package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.test;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractComposerDataService;

public class TestEnvComposerDataService extends AbstractComposerDataService {
    private final String className = TestEnvComposerDataService.class.getSimpleName();
    private final String url = "jdbc:test.patrikbergman.se:1521/composerService";

    @Override
    public void connect() {
        System.out.println(String.format("%s.connect() to url %s", className, url));
    }
}
