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

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

 /*   public String playTrack(String trackNo){


        String choiceAsString="", playMessage="";
        int choice;

        choice = Integer.parseInt(choiceAsString);
        if(choice == trackNo){
            playMessage = "Currently Playing: \n";
        }else{
            playMessage = "Invalid Track Number";
        }

        return playMessage;
    }
*/
    public int getPlayingTime(Song song1){
    int total;

    total = song1.getDuration();

    return total;

    }

    public int getNumberOfTracks(Song song1){
        int noOfTracks;

    }




    public String toString() {
        return ("Name: " + getName() + "\n\nProducer: " + getProducer() + "\n\nRelease Year: " + getReleaseYear() +
        "\n\nNumber of Tracks: " + "\n\nTotal Playing Time: " + getPlayingTime(songs) + "\n\n Total Playing Time: " +
                "\n\n======Album Tracks======" +
                "\n\nTrack No    " + "Title    " + "Artist    " + "\n\n" + songs.toString());
    }
}
