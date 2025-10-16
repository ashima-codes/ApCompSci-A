public class Song {
    private String artist, genre, title, topic;
    private int year, length;
    private double dance, loudness, obscene, shake;

    public Song(String a, String g, String titl, String top, int y, int len, double dan,double loud, double ob, double shak) {
        this.artist = a;
        this.genre = g;
        this.title = titl;
        this.topic = top;
        this.year = y;
        this.length = len;
        this.dance = dan;
        this.loudness = loud;
        this.obscene = ob;
        this.shake = shak;
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
    public String getTopic(){
        return topic;
    }
    public int getYear(){
        return year;
    }
    public int getLength(){
        return year;
    }
    public double getDance(){
        return dance;
    }
    public double getLoudness(){
        return loudness;
    }
    public double getObscene(){
        return obscene;
    }
}

