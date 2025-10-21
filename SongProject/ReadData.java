
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadData{

    public Song[] read() {
        Song[] songs = new Song [28371];
        try{
            int count = 1;
            Scanner in = new Scanner(new File("songs ANSI.csv"));  
            in.nextLine();
            while(in.hasNext()){
                String line = in.nextLine();
                String artist = line.split(";")[0];
                String title = line.split(";")[1];
                int year = Integer.parseInt(line.split(";")[2]);
                String genre = line.split(";")[3];
                int length = Integer.parseInt(line.split(";")[4]);
                double shakeability = Double.parseDouble(line.split(";")[5]);
                double obscene = Double.parseDouble(line.split(";")[6]);
                double dance = Double.parseDouble(line.split(";")[7]);
                double loudness = Double.parseDouble(line.split(";")[8]);
                String topic = line.split(";")[9];
                songs[count-1] = new Song (artist, genre, title, topic, year, length, dance, loudness, obscene,  shakeability);
                //System.out.println(count +" " + in.nextLine().split(";" )[0]);
                count ++;                  
        }  
        System.out.println(count);         
        }
        catch(Exception e) {
            System.out.println(e);
        }
    return songs;
    }

    public String getLongestTitle(Song[] list){
        String title = "";
        for (int i = 0; i < 28371; i++){
            String newTitle = list[i].getTitle();
            if(newTitle.length() > title.length()){
                title = newTitle;
            }
        }
        return title;
    }
    public String getLongestLength(Song[] list){
        double length = 0.0;
        String Song = "";
        for (int i = 0; i < 28371; i++){
            double newLength = list[i].getLength();
            if(newLength > length){
                length = newLength;
                Song = list[i].getTitle();
            }
        }
        return Song;
    }
    public String getLoudestSong(Song[] list){
        double loud = 0.0;
        String theSong = "";
        for (int i = 0; i < 28371; i++){
            double newLoud = list[i].getLoudness();
            if(newLoud > loud){
                loud = newLoud;
                theSong = list[i].getTitle();
            }
        }
        return theSong; 
    }
    public String getLowestShake (Song[] list) {
        double shake = 1.0;
        String aSong = "";
        for (int i = 0; i < 28371; i++){
            double newShake = list[i].getShake();
            if(newShake < shake){
                shake = newShake;
                aSong = list[i].getTitle();
            }
        }
        return aSong;
    }
    public int danceabilityRating (Song[] list){
        int numOfRating = 0;
        for (int i = 0; i< 28371; i++){
            double newRating = list[i].getDance();
            if (newRating > 0.80){
                numOfRating ++;
            }
        }
        return numOfRating;
    }
    public int totalFrom1982(Song[] list){
        int total = 0;
        for (int i = 0; i < 28371; i++){
            int year = list[i].getYear();
            if (year == 1982){
                total++;
            }
        }
        return total;
    }
    public int totalFrom2000(Song[] list){
        int total = 0;
        for (int i = 0; i < 28371; i++){
            int year = list[i].getYear();
            if (year == 2000){
                total++;
            }
        }
        return total;
    }
    public int totalFrom2015(Song[] list){
        int total = 0;
        for (int i = 0; i < 28371; i++){
            int year = list[i].getYear();
            if (year == 2015){
                total++;
            }
        }
        return total;
    }
    public int numSongArtist(Song[] list, String artistName){
        int count = 0;
        for (int i = 0; i<list.length; i++){
            Song s = list[i];
            if (s != null && s.getArtist().toLowerCase().contains(artistName.toLowerCase())){
                count++;
            }
        }
        return count;
    }
    public double getAverageObscenity(Song[] list, int startYear){
        double endYear = startYear+9;
        double total= 0.0;
        int count = 0;
        for (int i = 0; i < list.length;i++){
            Song s = list[i];
            if ( s!= null && s.getYear() >= startYear && s.getYear()<= endYear){
                total += s.getObscene();
                count++;
            }
        }
        if (count ==0) return 0.0;
        return total/count;
        }
    
}






// line, artist, title, year, genre, lengh, , shakebaility, obscne, danceabilitym, lodness, topioc
//public Song(String a, String g, String titl, String top, int y, int len, double dan,double loud, double ob, double shak) 




