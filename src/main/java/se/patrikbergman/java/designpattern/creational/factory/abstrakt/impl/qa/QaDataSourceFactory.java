package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.qa;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractComposerDataService;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractFactory;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractWriterDataService;

public class QaDataSourceFactory extends AbstractFactory {

    @Override
    public AbstractComposerDataService createComposerDataService() {
        return new QaEnvComposerDataService();
    }

    @Override
    public AbstractWriterDataService createWriterDataService() {
        return new QaEnvWriterDataService();
    }
}
