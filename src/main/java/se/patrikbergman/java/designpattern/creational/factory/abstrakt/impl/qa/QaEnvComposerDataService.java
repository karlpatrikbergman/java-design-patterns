package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.qa;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractComposerDataService;

class QaEnvComposerDataService extends AbstractComposerDataService {
    private final String className = QaEnvComposerDataService.class.getSimpleName();

    @Override
    public void connect() {
        String url = "jdbc:qa.patrikbergman.se:1521/composerService";
        System.out.println(String.format("%s.connect() to url %s", className, url));
    }
}
