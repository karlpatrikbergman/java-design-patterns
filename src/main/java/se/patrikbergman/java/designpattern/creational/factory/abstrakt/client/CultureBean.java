package se.patrikbergman.java.designpattern.creational.factory.abstrakt.client;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractComposerDataService;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractWriterDataService;

public class CultureBean {
    private final String className = CultureBean.class.getSimpleName();
    private final AbstractComposerDataService abstractComposerDataService;
    private final AbstractWriterDataService abstractWriterDataService;

    public CultureBean(AbstractComposerDataService abstractComposerDataService, AbstractWriterDataService abstractWriterDataService) {
        this.abstractComposerDataService = abstractComposerDataService;
        this.abstractWriterDataService = abstractWriterDataService;
    }

    public void writerDataServiceDependentMethod() {
        System.out.println(String.format("%s.writerDataServiceDependentMethod()", className));
        abstractWriterDataService.connect();
    }

    public void composerDataServiceDependentMethod() {
        System.out.println(String.format("%s.composerDataServiceDependentMethod()", className));
        abstractComposerDataService.connect();
    }
}
