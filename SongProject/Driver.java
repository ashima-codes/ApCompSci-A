public class Driver {
    public static void main (String [] args){
        ReadData r = new ReadData();
        Song [] list = r.read(); // prints numbers of songs
        System.out.println("Longest title: " + r.getLongestTitle(list)); // Song with longest length
        System.out.println("Loudest song: " + r.getLoudestSong(list)); // Loudest song
        System.out.println("The song with the lowest shakeability score is: " + r.getLowestShake(list)); // lowest shake
        System.out.println(r.danceabilityRating(list) + " songs have a dance rate over 0.80"); // how many songs have danceability ratings > 0.80
        System.out.println("There are " + r.totalFrom1982(list) + " songs from the year 1982"); // Total number of songs from 1982
        System.out.println("There are " + r.totalFrom2000(list) + " songs from the year 2000"); // Total number of songs from  2000
        System.out.println("There are " + r.totalFrom2015(list) + " songs from the year 2015"); // Total number of songs from 2015
}


