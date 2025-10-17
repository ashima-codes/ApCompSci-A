
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
    public double getLoudestSong(Song[] list){
        double loud = 0.0;
        for (int i = 0; i < 28371; i++){
            double newLoud = list[i].getLoudness();
            if(newLoud > loud){
                loud = newLoud;
            }
        }
        return loud;
    }

}
