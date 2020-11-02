package assessment;

public class Song {

    private int trackId;
    private int trackNumber;
    private String title;
    private String artist;
    private String genre;
    private int duration;
    private int releaseYear;

    public Song(int trackId, int trackNumber, String title, String artist,
                      String genre, int duration, int releaseYear){
        setTrackId(trackId);
        setTrackNumber(trackNumber);
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setDuration(duration);
        setReleaseYear(releaseYear);
    }

    public Song(){
        this(1,1, "N/A", "N/A", "N/A",0,2010);
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getTrackId() {
        return trackId;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String toString() {
        return(getTrackNumber() + "    " + getTitle() +
                "    " + getArtist() + "    " + getDuration() + "    " + getGenre()+ "    " + getReleaseYear());
    }


}
