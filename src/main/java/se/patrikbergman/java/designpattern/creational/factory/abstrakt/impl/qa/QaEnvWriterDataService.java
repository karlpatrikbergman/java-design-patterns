package se.patrikbergman.java.designpattern.creational.factory.abstrakt.impl.qa;

import se.patrikbergman.java.designpattern.creational.factory.abstrakt.AbstractWriterDataService;

class QaEnvWriterDataService extends AbstractWriterDataService {
    private final String className = QaEnvWriterDataService.class.getSimpleName();

    @Override
    public void connect() {
        String url = "jdbc:qa.patrikbergman.se:1521/writerService";
        System.out.println(String.format("%s.connect() to url %s", className, url));
    }
}

