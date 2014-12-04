package se.patrikbergman.java.designpattern.creational.factory.classregreflection.bandimplementation;

import static se.patrikbergman.java.designpattern.creational.factory.classregreflection.Band.Type.BOOGIE_BAND;

public class BoogieBand implements se.patrikbergman.java.designpattern.creational.factory.classregreflection.Band {

    private final static String className = BoogieBand.class.getSimpleName();
    private final static Type TYPE = BOOGIE_BAND;

    @Override
    public void play() {
        System.out.println(String.format("%s.play() implemented in Boogie-manner", className));
    }
}
