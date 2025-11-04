//A few assumptions.......

//Words will be separated by spaces. 
//There can be punctuation in a word, we will only add/keep punctuation at the end of a string if it is at the end of a string.
//    for examples: Hello.==> Ellohay.    Good-bye! ==> Ood-byegay!    so... ==> osay...

public class Book
{
  public String pigLatin(String word)
  {
    String newWord = "";
    String vowels = "aeiou";
    String numbers = "0123456789";
    //System.out.println(*****firstLetter***)
    if (word.length() == 0){
      return word;
    }
    if(vowels.indexOf(word.substring(0,1))>0){
      newWord = word + "yay";
      return newWord;
    }
    if(numbers.indexOf(word.substring(0,1))>0){
      return word + "ay";
    }
    if (word.length()==1){
      return word + "ay";
    }
    else{
      for (int i = 0; i < word.length(); i++){
        if (vowels.indexOf(word.substring(i, i+1))> 0){
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
    String newWord = "";
    int lenOfWord = word.length();
    int indexOfPun = 0;
    String finalWord = "";
    String punctuation = "!.?;:,";
      for (int i = lenOfWord-1; i >=0; i--){
          if (punctuation.indexOf(word.substring(i))>= 0){
            indexOfPun = i;
            //newWord = word.substring(0, i);
          }
          else {
            indexOfPun = -1;
            break;
          }
      }
      if (indexOfPun > 0){
          finalWord = pigLatin(word.substring(0, indexOfPun)) + word.substring(indexOfPun);
          return finalWord;
      }
      else{
        return pigLatin(word);
      }

      //return newWord;
    // -1;
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
