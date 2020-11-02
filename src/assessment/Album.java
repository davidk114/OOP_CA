package assessment;

import java.util.*;

public class Album {

private String name;
private Song songs = new Song();
private String producer;
private int releaseYear;

public Album(String name, String producer, int releaseYear, Song song){
    setName(name);
   setSongs(song);
    setProducer(producer);
    setReleaseYear(releaseYear);
}

//public Album(){
  //  this("N/a","n/a",2000, songs.toString());
//}

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

   public void setSongs(Song songs) {
        this.songs = songs;
    }

    //    public void setSongs(Song[] songs) {
//this.songs = songs;
//}

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }


    public String toString() {
        return "";
    }
}
