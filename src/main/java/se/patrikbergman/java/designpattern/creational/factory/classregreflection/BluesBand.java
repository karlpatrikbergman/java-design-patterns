package se.patrikbergman.java.designpattern.creational.factory.classregreflection;

import static se.patrikbergman.java.designpattern.creational.factory.classregreflection.Band.Type.BLUES_BAND;

class BluesBand implements Band {

    private final static String className = BluesBand.class.getSimpleName();
    private final static Type TYPE = BLUES_BAND;

    @Override
    public void play() {
        System.out.println(String.format("%s.play() implemented in Blues-manner", className));
    }

}