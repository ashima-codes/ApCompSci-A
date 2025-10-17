public class Driver {
    public static void main (String [] args){
        ReadData r = new ReadData();
        Song [] list = r.read(); // prints numbers of songs
        System.out.println(r.getLongestTitle(list)); // printing longest title
        System.out.println(r.getLoudestSong(list)); // printing loudest song
    }
}

