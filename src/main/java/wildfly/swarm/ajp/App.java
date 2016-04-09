package wildfly.swarm.ajp;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.container.Container;
import org.wildfly.swarm.jaxrs.JAXRSArchive;
import org.wildfly.swarm.undertow.UndertowFraction;

public class App {

  public static void main(String[] args) throws Exception {

    Container container = new Container();

    container.fraction(
        UndertowFraction.createDefaultAJPOnlyFraction()
    );

    JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
    deployment.addPackage(App.class.getPackage());
    deployment.addAllDependencies();
    container.start().deploy(deployment);
  }

}
