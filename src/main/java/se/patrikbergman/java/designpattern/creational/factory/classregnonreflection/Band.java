package se.patrikbergman.java.designpattern.creational.factory.classregnonreflection;

abstract class Band {
    enum Type{ROCK_BAND, BLUES_BAND, BOOGIE_BAND}
    abstract Band create();
    abstract void play();
}
