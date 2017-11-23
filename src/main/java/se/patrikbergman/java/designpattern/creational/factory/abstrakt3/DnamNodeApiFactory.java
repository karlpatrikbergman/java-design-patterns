package se.patrikbergman.java.designpattern.creational.factory.abstrakt3;

class DnamNodeApiFactory implements NodeApiFactory{
    @Override
    public NodeApi getNodeApi() {
        return new DnamNodeApi();
    }
}
