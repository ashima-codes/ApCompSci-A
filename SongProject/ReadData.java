
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
            int length = Integer.parseInt(line.split(";")[3]);
            double shakeability = Double.parseDouble(line.split(";")[4]);
            double obscene = Double.parseDouble(line.split(";")[5]);
            double dance = Double.parseDouble(line.split(";")[6]);
            double loudness = Double.parseDouble(line.split(";")[7]);
            String topic = line.split(";")[8];

// line, artist, title, year, genre, lengh, , shakebaility, obscne, danceabilitym, lodness, topioc
//public Song(String a, String g, String titl, String top, int y, int len, double dan,double loud, double ob, double shak) 
            songs[count-1] = new Song (artist, genre, title, topic, year, length, dance, loudness, obscene,  shakeability);
            System.out.println(count +" " + in.nextLine().split(";" )[0]);
            count ++;                   
        }  
        System.out.println(songs[2].getTitle());        
        }
        catch(Exception e) {
            System.out.println(e);
        }
    return songs;
    }
}
