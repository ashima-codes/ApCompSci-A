
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadData{

    public static void read() {
        try{
        Scanner in = new Scanner(new File("songs 2025-2026.csv"));  
        while(in.hasNext()){
            System.out.println(in.nextLine());
        }          
        }
        catch(Exception e) {
            System.out.println(e);
        }

    }

}