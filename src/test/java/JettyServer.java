import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.ContextHandlerCollection;


/**
 * Created by root on 08/06/17.
 */
public class JettyServer {
    private Server server;

    public JettyServer() {
        server = new Server(10001);
    }

    public void startJetty() throws Exception {
//        ContextHandler context1 = new ContextHandler("/");
//        context1.setHandler(new HelloHandler());
        ContextHandler context = new ContextHandler("/");
        context.setHandler(new DummyGremlinHandler());

//        ContextHandlerCollection contexts = new ContextHandlerCollection();
//        contexts.setHandlers(new Handler[] { context, context1 });
        server.setHandler(context);
        server.start();
    }

    public void stopJetty() throws Exception {
        server.stop();
    }
}