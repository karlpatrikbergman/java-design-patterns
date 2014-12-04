package se.patrikbergman.java.designpattern.creational.factory.simple.bandimplementation;

import se.patrikbergman.java.designpattern.creational.factory.simple.Band;

import static se.patrikbergman.java.designpattern.creational.factory.simple.Band.Type.BLUES_BAND;

public class BluesBand implements Band {

    private final static String className = BluesBand.class.getSimpleName();
    private final static Type TYPE = BLUES_BAND;

    @Override
    public void play() {
        System.out.println(String.format("%s.play() implemented in Blues-manner", className));
    }

}
