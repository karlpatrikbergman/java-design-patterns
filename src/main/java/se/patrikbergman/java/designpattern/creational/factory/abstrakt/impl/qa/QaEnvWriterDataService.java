package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.qa;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractWriterDataService;

public class QaEnvWriterDataService extends AbstractWriterDataService {
    private final String className = QaEnvWriterDataService.class.getSimpleName();
    private final String url = "jdbc:qa.patrikbergman.se:1521/writerService";

    @Override
    public void connect() {
        System.out.println(String.format("%s.connect() to url %s", className, url));
    }
}

