package se.patrikbergman.java.designpattern.creational.factory.simple.bandimplementation;

import se.patrikbergman.java.designpattern.creational.factory.simple.Band;

import static se.patrikbergman.java.designpattern.creational.factory.simple.Band.Type.ROCK_BAND;

public class RockBand implements Band {

    private final static String className = RockBand.class.getSimpleName();
    private final static Type TYPE = ROCK_BAND;

    @Override
    public void play() {
        System.out.println(String.format("%s.play() implemented in Rock-manner", className));
    }

}
