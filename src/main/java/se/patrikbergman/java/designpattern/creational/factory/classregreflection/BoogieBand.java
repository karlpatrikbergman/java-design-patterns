package se.patrikbergman.java.designpattern.creational.factory.classregreflection;

class BoogieBand implements Band {

    private final static String className = BoogieBand.class.getSimpleName();

    @Override
    public void play() {
        System.out.println(String.format("%s.play() implemented in Boogie-manner", className));
    }
}
