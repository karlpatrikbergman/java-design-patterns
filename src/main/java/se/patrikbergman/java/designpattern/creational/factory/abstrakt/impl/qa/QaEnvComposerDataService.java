package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.qa;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractComposerDataService;

public class QaEnvComposerDataService extends AbstractComposerDataService {
    private final String className = QaEnvComposerDataService.class.getSimpleName();
    private final String url = "jdbc:qa.patrikbergman.se:1521/composerService";

    @Override
    public void connect() {
        System.out.println(String.format("%s.connect() to url %s", className, url));
    }
}
