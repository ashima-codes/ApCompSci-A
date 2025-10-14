public class Song {
    private String artist, genre, title;
    private int year;
    private int dance;

    public Song(String a, String g, String t, int y, int d) {
        this.artist = a;
        this.genre = g;
        this.title = t;
        this.year = y;
        this.dance = d;
    }

    public String getArtist(){
        return artist;
    }
    public String getGenre(){
        return genre;
    }
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    public int getDance(){
        return dance;
    }
}
