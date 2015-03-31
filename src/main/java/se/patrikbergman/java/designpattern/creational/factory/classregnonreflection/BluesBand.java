package se.patrikbergman.java.designpattern.creational.factory.classregnonreflection;

import static se.patrikbergman.java.designpattern.creational.factory.classregnonreflection.Band.Type.BLUES_BAND;

class BluesBand extends Band {

    private final static String className = BluesBand.class.getSimpleName();

    static {
        Factory.getInstance().registerBand(BLUES_BAND, new BluesBand());
    }

    public Band create() {
        return new BluesBand();
    }

    public void play() {
        System.out.println(String.format("%s.play() implemented in Blues-manner", className));
    }

}
