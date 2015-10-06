package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.test;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractComposerDataService;

public class TestEnvComposerDataService extends AbstractComposerDataService {
    private final String className = TestEnvComposerDataService.class.getSimpleName();

    @Override
    public void connect() {
        String url = "jdbc:test.patrikbergman.se:1521/composerService";
        System.out.println(String.format("%s.connect() to url %s", className, url));
    }
}
