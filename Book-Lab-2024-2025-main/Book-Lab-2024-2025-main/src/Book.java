//A few assumptions.......

//Words will be separated by spaces. 
//There can be punctuation in a word, we will only add/keep punctuation at the end of a string if it is at the end of a string.
//    for examples: Hello.==> Ellohay.    Good-bye! ==> Ood-byegay!    so... ==> osay...

public class Book
{
  public String pigLatin(String word)
  {
    String newWord = "";
    String firstLetter = word.substring(0,1);
    //System.out.println(*****firstLetter***)
    //if (firstLetter == "a"||firstLetter == "e"||firstLetter == "i"||firstLetter == "o"||firstLetter == "u"){
    if (firstLetter == "e"){
      newWord = word + "yay";
      System.out.println(newWord);
    }
    else{
      //int whereIsVowel = 0;
      //for (int i=0; i< word.length(); i ++){
        //if (word.substring(i,i+1) == "a" ||word.substring(i,i+1) == "e" ||word.substring(i,i+1) == "i"||word.substring(i,i+1) == "o"||word.substring(i,i+1) == "u" ){
          //whereIsVowel = i;
          //System.out.println(word.substring(i,i+1));
          //break;
        //}
      //newWord = word.substring(i) + word.substring(0,i) + "ay";
      //}
      System.out.println("reached else");
    }
    return newWord;
  }
  
  public int endPunctuation(String word)  //return the index of where the punctuation is at the end of a String. If it is all punctuation return 0, if there is no punctuation return -1
  {

    return -1;
  }

  public String translateWord(String word)    //to share with class
  {
    String convertedWord = "";

    return convertedWord;
  }

  public String translateSentence(String sentence)
  {
    String retSentence = "";


    return retSentence;
  }
}  
