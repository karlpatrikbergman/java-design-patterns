package se.patrikbergman.java.designpattern.creational.factory.classregreflection;

class RockBand implements Band {

    private final static String className = RockBand.class.getSimpleName();

    @Override
    public void play() {
        System.out.println(String.format("%s.play() implemented in Rock-manner", className));
    }

}
