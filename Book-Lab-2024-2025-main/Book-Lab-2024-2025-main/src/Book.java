//A few assumptions.......

//Words will be separated by spaces. 
//There can be punctuation in a word, we will only add/keep punctuation at the end of a string if it is at the end of a string.
//    for examples: Hello.==> Ellohay.    Good-bye! ==> Ood-byegay!    so... ==> osay...

public class Book
{
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
    int indexOfPunc = 0;
    String punctuation = "?.!;:,";
    boolean case1 = false;

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
      if (indexOfPunc != 0){
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
        return pigLatin(word);
      }
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
