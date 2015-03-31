package se.patrikbergman.java.designpattern.creational.factory.classregnonreflection;

import java.util.HashMap;
import java.util.Map;

/**
 * Does not violate open closed principle since it does not need to change
 * if a new Band-type is added.
 *
 * Avoids reflection
 *
 */
@SuppressWarnings("ALL")
class Factory {

    private final Map<Band.Type, Band> registeredBands = new HashMap<>();
    private static Factory instance;

    public void registerBand(final Band.Type key, final Band band) {
        registeredBands.put(key, band);
    }

    public Band bookBand(final Band.Type key)  {
        return ((Band) registeredBands.get(key)).create();
    }

    public static synchronized Factory getInstance() {
        if (instance == null)
            instance = new Factory();
        return instance;
    }
}
