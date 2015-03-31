package se.patrikbergman.java.designpattern.creational.factory.classregnonreflection;

import static se.patrikbergman.java.designpattern.creational.factory.classregnonreflection.Band.Type.ROCK_BAND;

class RockBand extends Band {

    private final static String className = RockBand.class.getSimpleName();

    static {
        Factory.getInstance().registerBand(ROCK_BAND, new RockBand());
    }

    public Band create() {
        return new RockBand();
    }

    public void play() {
        System.out.println(String.format("%s.play() implemented in Rock-manner", className));
    }

}
