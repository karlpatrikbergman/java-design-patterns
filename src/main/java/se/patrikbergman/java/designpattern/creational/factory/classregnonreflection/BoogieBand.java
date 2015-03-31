package se.patrikbergman.java.designpattern.creational.factory.classregnonreflection;

import static se.patrikbergman.java.designpattern.creational.factory.classregnonreflection.Band.Type.BOOGIE_BAND;

class BoogieBand extends Band {

    private final static String className = BoogieBand.class.getSimpleName();

    static {
        Factory.getInstance().registerBand(BOOGIE_BAND, new BoogieBand());
    }

    public Band create() {
        return new BoogieBand();
    }

    public void play() {
        System.out.println(String.format("%s.play() implemented in Boogie-manner", className));
    }
}
