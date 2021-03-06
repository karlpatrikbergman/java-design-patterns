package se.patrikbergman.java.designpattern.creational.factory.abstrakt.service;

import org.junit.Before;
import org.junit.Test;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractFactory;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.client.CultureBean;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.test.TestEnvDataSourceFactory;

//TODO Make tests actually test something worthwhile
public class CultureBeanTestEnvTest {

    private CultureBean cultureBean;

    @Before
    public void setup() {
        AbstractFactory culturalDataServicesFactory = new TestEnvDataSourceFactory();
        cultureBean = new CultureBean(
                culturalDataServicesFactory.createComposerDataService(),
                culturalDataServicesFactory.createWriterDataService()
        );
    }

    @Test
    public void invokeComposerDataServiceMethod() {
        cultureBean.composerDataServiceDependentMethod();
    }

    @Test
    public void invokeWriterDataServiceMethod() {
        cultureBean.writerDataServiceDependentMethod();
    }

}
