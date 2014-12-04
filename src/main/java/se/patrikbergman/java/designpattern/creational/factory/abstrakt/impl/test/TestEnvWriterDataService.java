package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.test;
import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractWriterDataService;

public class TestEnvWriterDataService extends AbstractWriterDataService {
    private final String className = TestEnvComposerDataService.class.getSimpleName();
    private final String url = "jdbc:test.patrikbergman.se:1521/writerService";

    @Override
    public void connect() {
        System.out.println(String.format("%s.connect() to url %s", className, url));
    }
}

