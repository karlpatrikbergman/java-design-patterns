package se.patrikbergman.java.designpattern.creational.factory.simple;

import org.junit.Test;

/**
 * TODO: Add asserts
 */
public class SimpleFactoryTest {

    @Test
    public void arrangeRockAndBluesFestival() {
        SimpleFactoryClient festivalCommittee = new SimpleFactoryClient();
        festivalCommittee.arrangeRockAndBluesFestival();
    }
}
