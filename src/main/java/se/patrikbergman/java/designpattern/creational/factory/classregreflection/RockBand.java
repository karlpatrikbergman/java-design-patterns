package se.patrikbergman.java.designpattern.creational.factory.classregreflection;

import static se.patrikbergman.java.designpattern.creational.factory.classregreflection.Band.Type.ROCK_BAND;

class RockBand implements Band {

    private final static String className = RockBand.class.getSimpleName();
    private final static Type TYPE = ROCK_BAND;

    public RockBand() {}

    @Override
    public void play() {
        System.out.println(String.format("%s.play() implemented in Rock-manner", className));
    }

}
