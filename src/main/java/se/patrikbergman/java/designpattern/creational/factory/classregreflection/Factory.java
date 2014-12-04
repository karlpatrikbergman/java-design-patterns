package se.patrikbergman.java.designpattern.creational.factory.classregreflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * Does not violate open closed principle since it does not need to change
 * if a new Band-type is added.
 *
 * Reflection has negative impact on performance.
 *
 */
@SuppressWarnings("ALL")
public class Factory {

    private final Map<Band.Type, Class> registeredBands = new HashMap<>();
    private static Factory instance;

    public void registerBand(final Band.Type key, Class clazz) {
        registeredBands.put(key, clazz);
    }

    public Band bookBand(final Band.Type key) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Class clazz = registeredBands.get(key);
        Constructor constructor = clazz.getDeclaredConstructor(new Class[] {  });
        return (Band) constructor.newInstance();
    }

    public static synchronized Factory getInstance() {
        if (instance == null)
            instance = new Factory();
        return instance;
    }
}
