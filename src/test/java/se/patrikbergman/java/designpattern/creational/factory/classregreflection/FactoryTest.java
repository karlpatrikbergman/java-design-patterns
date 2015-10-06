package se.patrikbergman.java.designpattern.creational.factory.classregreflection;

import org.junit.Test;

/**
 * TODO: Add asserts
 */

public class FactoryTest {

    //Dynamic runtime loading. I have forgotten why?
    static {
        try {
            final String pkg= "se.patrikbergman.java.designpattern.creational.factory.classregreflection.";
            Class.forName(pkg.concat("RockBand"));
            Class.forName(pkg.concat("BluesBand"));
            Class.forName(pkg.concat("BoogieBand"));
        } catch (ClassNotFoundException any) {
            any.printStackTrace();
        }
    }

    /**
     * Registration of new Band implementations could alternatively be done within Band implementations
     */
    @Test
    public void arrangeRockAndBluesFestival() {
        Factory bandFactory = Factory.getInstance();
        bandFactory.registerBand(Band.Type.BLUES_BAND, BluesBand.class);
        bandFactory.registerBand(Band.Type.ROCK_BAND, RockBand.class);
        bandFactory.registerBand(Band.Type.BOOGIE_BAND, BoogieBand.class);

        FactoryClient festivalCommittee = new FactoryClient();
        festivalCommittee.arrangeRockBluesAndBoogieFestival();
    }
}
