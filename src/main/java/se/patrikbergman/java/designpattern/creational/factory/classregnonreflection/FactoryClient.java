package se.patrikbergman.java.designpattern.creational.factory.classregnonreflection;


import static se.patrikbergman.java.designpattern.creational.factory.classregnonreflection.Band.Type.*;

/**
 * This client does not need to know anything about actual implementations of Band-interface.
 *
 */
class FactoryClient {

    public void arrangeRockBluesAndBoogieFestival() {

        Factory bandFactory = Factory.getInstance();
        try {
            Band rollingStones = bandFactory.bookBand(ROCK_BAND);
            Band muddyWaters = bandFactory.bookBand(BLUES_BAND);
            Band jerryLeeLewis = bandFactory.bookBand(BOOGIE_BAND);

            muddyWaters.play();
            jerryLeeLewis.play();
            rollingStones.play();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
