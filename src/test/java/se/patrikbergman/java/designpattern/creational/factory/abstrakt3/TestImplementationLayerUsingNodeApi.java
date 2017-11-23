package se.patrikbergman.java.designpattern.creational.factory.abstrakt3;

import org.junit.Test;

import java.util.function.Supplier;

public class TestImplementationLayerUsingNodeApi {

    @Test
    public void dnamModeApiTest() {
        NodeApiFactory nodeApiFactory = new DnamNodeApiFactory();
        NodeApi nodeApi = nodeApiFactory.getNodeApi();
        nodeApi.addNode("172.17.1.2");
    }

    @Test
    public void nextGenNodeApiTest() {
        NodeApiFactory nodeApiFactory = new NextGenNodeApiFactory();
        NodeApi nodeApi = nodeApiFactory.getNodeApi();
        nodeApi.addNode("172.17.1.2");
    }

    /**
     * Here we can get rid of concrete factories DnamNodeApiFactory and
     * NextGenNodeApiFactory
     */
    @Test
    public void usingJava8FunctionalInterface() {
        NodeApiFactory nodeApiFactory = DnamNodeApi::new;
        NodeApi nodeApi = nodeApiFactory.getNodeApi();
        nodeApi.addNode("172.17.1.2");
    }

    /**
     * Getting rid of abstract factory NodeApiFactory
     */
    @Test
    public void usingJava8FunctionalInterface2() {
        Supplier<NodeApi> nodeApiFactory = NextGentNodeApi::new;
        NodeApi nodeApi = nodeApiFactory.get();
        nodeApi.addNode("172.17.1.2");
    }
}
