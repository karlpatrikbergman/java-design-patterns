package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.test;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractComposerDataService;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractFactory;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractWriterDataService;

public class TestEnvDataSourceFactory extends AbstractFactory {

    @Override
    public AbstractComposerDataService createComposerDataService() {
        return new TestEnvComposerDataService();
    }

    @Override
    public AbstractWriterDataService createWriterDataService() {
        return new TestEnvWriterDataService();
    }
}
