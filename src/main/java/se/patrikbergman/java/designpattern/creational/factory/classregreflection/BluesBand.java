package se.patrikbergman.java.designpattern.creational.factory.classregreflection;

class BluesBand implements Band {

    private final static String className = BluesBand.class.getSimpleName();

    @Override
    public void play() {
        System.out.println(String.format("%s.play() implemented in Blues-manner", className));
    }

}
