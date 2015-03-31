package se.patrikbergman.java.designpattern.creational.factory.classregnonreflection;

import org.junit.Test;

public class FactoryTest {

    static {
        //Register Band implementations with Factory?
        //Can't see how else this could work...
        new BluesBand();
        new RockBand();
        new BoogieBand();
    }

    @Test
    public void arrangeRockAndBluesFestival() {
        FactoryClient festivalCommittee = new FactoryClient();
        festivalCommittee.arrangeRockBluesAndBoogieFestival();
    }
}
