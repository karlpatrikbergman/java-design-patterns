package se.patrikbergman.java.designpattern.creational.factory.abstrakt2;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.assertEquals;
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
        SongWriter songWriter1 = lyrics -> new RnbSong(lyrics);
        Song song1 = songWriter1.writeSong("Some nice lyrics");

        assertNotNull(song1);
        assertTrue(song1 instanceof RnbSong);

        //alternative
        SongWriter songWriter2 = HeavyMetalSong::new;
        Song song2 = songWriter2.writeSong("Some very nice lyrics");

        assertNotNull(song2);
        assertTrue(song2 instanceof HeavyMetalSong);
    }

    @Test
    public void abstractFactoryUsingJava8FunctionalInterface2() {
        Function<String, Song> songWriter = HeavyMetalSong::new;
        Song song = songWriter.apply("Some nice lyrics");
        assertTrue(song instanceof HeavyMetalSong);
        assertEquals("Some nice lyrics", song.getLyrics());
    }
}
