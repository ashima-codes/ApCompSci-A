class App {
  public static void main(String[] args) {
    Book aBook = new Book("https://www.gutenberg.org/cache/epub/6130/pg6130.txt");
    //System.out.println(aBook.endPunctuation("hello!"));
    //System.out.println(aBook.endPunctuation("What?!?"));   
    //System.out.println(aBook.endPunctuation("Allons-y"));   
    //System.out.println(aBook.translateSentence("I can now speak in Pig-Latin? WOW!!! I can translate words and sentences for the students at Foothill High School.")); 
    aBook.readBook();
    System.out.println("Word Count: " + aBook.getWordCount());
  }
}
