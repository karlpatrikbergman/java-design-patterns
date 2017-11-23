package se.patrikbergman.java.designpattern.creational.factory.abstrakt3;

class NextGenNodeApiFactory implements NodeApiFactory {
    @Override
    public NodeApi getNodeApi() {
        return new NextGentNodeApi();
    }
}
