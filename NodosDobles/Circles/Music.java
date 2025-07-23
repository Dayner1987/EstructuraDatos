package Circles;
public class Music {
    private String name;
    private String artist;
    private Double duration;
    private String genre;
    public Music(String name, String artist,Double duration,String genre){
        this.name=name;
        this.artist=artist;
        this.duration=duration;
        this.genre=genre;

    }
    public String getName() {
        return name;
    }
    public String getArtist() {
        return artist;
    }
    public Double getDuration() {
        return duration;
    }
    public String getGenre() {
        return genre;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setDuration(Double duration) {
        this.duration = duration;
    }
    public void setGenre(String genre) {
        this.genre= genre;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                '}';
    }
}
