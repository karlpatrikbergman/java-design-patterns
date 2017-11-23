package se.patrikbergman.java.designpattern.creational.factory.abstrakt2;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SongWriterTest {

    @Test
    public void abstractFactoryBeforeJava8() {

        //Before Java 8 functional interfaces
        //HeavyMetalSongWriter is a concrete factory of type SongWriter
        //A client can retrieve instance of SongWriter once, and later get instances of Songs without knowing
        //about how they where created (metal-song or rnb-song)
        SongWriter songWriter = new HeavyMetalSongWriter();
        Song song = songWriter.writeSong("Some nice lyrics");

        assertNotNull(song);
        assertTrue(song instanceof HeavyMetalSong);
    }

    @Test
    public void abstractFactoryUsingJava8FunctionalInterface() {
        //Using Java 8 functional interface we can get rid of concrete factories (HeavyMetalSongwriter and RnbSongWriter)
        //Sing SongWriter is a functional interface
        SongWriter songWriter = lyrics -> new RnbSong(lyrics);
        Song song = songWriter.writeSong("Some nice lyrics");

        assertNotNull(song);
        assertTrue(song instanceof RnbSong);
    }
}
