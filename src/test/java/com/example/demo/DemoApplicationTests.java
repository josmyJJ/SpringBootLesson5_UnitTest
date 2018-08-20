package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

  @Test
  public void contextLoads() {
  }

  @Test
  public void id() {
    Song id = new Song();
    id.setId(2);
    assertEquals(id.getId(), 2);
  }

  @Test
  public void name() {
    Song song = new Song();
    song.setName("Some Name");
    assertEquals(song.getName(), "Some Name");
  }

  @Test
  public void year() {
    Song year = new Song();
    year.setYear(1999);
    assertEquals(year.getYear(), 1999);
  }


  @Test
  public void songTest(){
    Song testSong = new Song(1, "Song1", "Artist1", "Album1", 3, 2017);
    assertEquals(testSong.getId(), 1);
    assertEquals(testSong.getName(), "Song1");
    assertEquals(testSong.getArtist(), "Artist1");
    assertEquals(testSong.getAlbum(), "Album1");
    assertEquals(testSong.getRating(), 3);
    assertEquals(testSong.getYear(), 2017);
  }

}
