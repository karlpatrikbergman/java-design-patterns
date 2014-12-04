package se.patrikbergman.java.designpattern.creational.factory.abstrakt;

public abstract class AbstractFactory {

    public abstract AbstractComposerDataService createComposerDataService();
    public abstract AbstractWriterDataService createWriterDataService();

}
