package se.patrikbergman.java.designpattern.creational.factory.simple;

import se.patrikbergman.java.designpattern.creational.factory.simple.bandimplementation.BluesBand;
import se.patrikbergman.java.designpattern.creational.factory.simple.bandimplementation.RockBand;

/**
 * Real world example is
 * https://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/SAXParserFactory.html
 * public static SAXParserFactory newInstance(String factoryClassName, ClassLoader classLoader)
 * <p>
 * Intent
 * - creates objects without exposing the instantiation logic to the client.
 * - refers to the newly created object through a common interface
 * <p>
 * Does violate the open/closed principle though, since it has to change if a new type
 * of Band is added.
 */
class SimpleFactory {

    public static Band bookBand(final Band.Type type) {
        switch (type) {
            case ROCK_BAND:
                return new RockBand();
            case BLUES_BAND:
                return new BluesBand();
            default:
                throw new IllegalArgumentException("Unknown band type");
        }
    }
}
