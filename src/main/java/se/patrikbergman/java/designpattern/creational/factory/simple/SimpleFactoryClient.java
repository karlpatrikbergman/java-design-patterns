package se.patrikbergman.java.designpattern.creational.factory.simple;

import static se.patrikbergman.java.designpattern.creational.factory.simple.Band.Type.BLUES_BAND;
import static se.patrikbergman.java.designpattern.creational.factory.simple.Band.Type.ROCK_BAND;


/**
 * Some client, setting upp a show with with a rock band and a blues band. It does not
 * need to know anything about the actual creation or implementation of different types
 * of bands, neither does it have to know how a certain type of band is implemented, it
 * just knows that each band can play (as an example)
 */
class SimpleFactoryClient {

    public void arrangeRockAndBluesFestival() {
        Band rollingStones = SimpleFactory.bookBand(ROCK_BAND);
        Band muddyWaters   = SimpleFactory.bookBand(BLUES_BAND);

        muddyWaters.play();
        rollingStones.play();
    }
}
