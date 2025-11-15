import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Book
{
  private String book;
  private BufferedWriter writer;
  int count = 0;

  public Book(String url){
    book = url;
    try {
      writer = new BufferedWriter(new FileWriter("translatedBook.txt"));
    } 
    catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  public int getWordCount(){
    return count;
  }

  public void readBook(){
    try{
      URL url = new URL(book);
      Scanner s = new Scanner(url.openStream());

      while(s.hasNextLine()){
        String text = s.nextLine();
        writeToFile(text);
      }

      writer.close();   
    }
    catch(IOException ex){
      ex.printStackTrace();
    }
  }

  public void writeToFile(String t)
  {
    try{
      writer.write(translateSentence(t));
      writer.newLine();    
    }
    catch(IOException e) {
      System.out.println("Some error");
    }
  }


  public String pigLatin(String word)
  {
    String newWord = "";
    String vowels = "aeiouAEIOU";
    String numbers = "0123456789";
    //System.out.println(*****firstLetter***)
    if (word.length() == 0){
      return word;
    }
    if(vowels.indexOf(word.substring(0,1))>=0){
      newWord = word + "yay";
      return newWord;
    }
    if(numbers.indexOf(word.substring(0,1))>=0){
      return word + "ay";
    }
    if (word.length()==1){
      return word + "ay";
    }
    else {
      for (int i = 0; i < word.length(); i++){
        if (vowels.indexOf(word.substring(i, i+1))>= 0){
          String left = word.substring(0, i);
          String right = word.substring(i);
          return  right + left +"ay";
        }
      }
    }
    return word;
  }

  public String endPunctuation(String word)  //return the index of where the punctuation is at the end of a String. If it is all punctuation return 0, if there is no punctuation return -1
  {
    //char firstLetter = word.charAt(0);
    int lenOfWord = word.length();
    String puncInIt = "";
    String finalWord = "";
    int indexOfPunc = -1;
    String punctuation = "?.!;:,";
    boolean case1 = false;
    count ++;
    if (word == null || word.length()==0){
      return "";
    }
    if (Character.isUpperCase(word.charAt(0))){
      case1 = true;
    }
      for (int i = lenOfWord-1; i >=0; i--){
          if (punctuation.indexOf(word.substring(i, i+1)) >= 0){
            puncInIt += word.substring(i,i+1);
            indexOfPunc = i;
          }
          else {
            break;
          }
      }
      if (indexOfPunc != -1){
        if (case1 == true){
          finalWord = pigLatin(word.substring(0, indexOfPunc)) + puncInIt;
          String actualWord = finalWord.substring(0,1).toUpperCase()+finalWord.substring(1).toLowerCase();
          return actualWord;
        }
        else{
        finalWord = pigLatin(word.substring(0, indexOfPunc)) + puncInIt;
        return finalWord;
        }
      }
      else{
        if (case1 == true){
          finalWord = pigLatin(word);
          String actualWord = finalWord.substring(0,1).toUpperCase()+finalWord.substring(1).toLowerCase();
          return actualWord;
        }
        else{
          return pigLatin(word);
        } 
      }
  }

  //public String translateWord(String word)    //to share with class
  //{
    //String convertedWord = "";

    //return convertedWord;
  //}

  public String translateSentence(String sentence)
  {
  String newSentence = "";
  int start = 0;
  String space = " ";
    for (int i = 0; i< sentence.length(); i++){
      if (sentence.substring(i, i+1).equals(space)){
        newSentence += (endPunctuation(sentence.substring(start, i)) + " ");
        start = i + 1;
      }
    }
    if (start != sentence.length()){
      newSentence += (endPunctuation(sentence.substring(start, sentence.length())));
    }
    return newSentence; 
  }
}  
