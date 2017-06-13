import com.dxc.ess.mss.controller.LogsController;
import com.dxc.ess.mss.model.GraphResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.http.HttpStatus;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.net.HttpURLConnection;
import java.net.URL;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by Subham Rakshit on 09/06/17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
public class TestLogsController {
    private static JettyServer server = new JettyServer();
    private LogsController controller = new LogsController("http://127.0.0.1:10001/");
    private ObjectMapper mapper = new ObjectMapper();

    @BeforeClass
    public static void startHttpServer() throws Exception {
        server.startJetty();
    }

    @AfterClass
    public static void stopHttpServer() throws Exception {
        server.stopJetty();
    }

    @Test
    public void testJetty() throws Exception{
        HttpURLConnection http = (HttpURLConnection)new URL("http://127.0.0.1:10001/").openConnection();
        http.connect();
        assertThat("Response Code", http.getResponseCode(), is(HttpStatus.OK_200));
    }

    @Test
    public void testGetLogs() throws Exception{
        GraphResponse expectedVal = controller.getLogs("ACME");
        GraphResponse actualVal = mapper.readValue(Utils.getJson("logs_graph_output"), GraphResponse.class);
        assertEquals(mapper.writeValueAsString(expectedVal), mapper.writeValueAsString(actualVal));
    }
}
