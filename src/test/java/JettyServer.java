import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;


/**
 * Created by Subham Rakshit on 08/06/17.
 */
public class JettyServer {
    private Server server;

    public JettyServer() {
        server = new Server(10001);
    }

    public void startJetty() throws Exception {
        ContextHandler context = new ContextHandler("/");
        context.setHandler(new DummyGremlinHandler());
        server.setHandler(context);
        server.start();
    }

    public void stopJetty() throws Exception {
        server.stop();
    }
}