import java.lang.*;

public class PigLatinTranslator
{
  public static Book translate(Book input)
  {
    Book translatedBook = new Book();

    // Add code here to populate translatedBook with a translation of the input book.
    // Curent do-nothing code will return an empty book.

    return translatedBook;
  }

  public static String translate(String input)
  {
    String vowels = "aeiouyAEIOUY";
    String spaces = " ";
    String othercapitals = "BCDFGHJKLMNPQRSTVWXZ";
    int index = -1;
    int vowel = -1;
    while((vowel < 0) && (index < input.length()-1)){
      index++;
      vowel = vowels.indexOf(input.substring(index,index+1));
    }
    if(input.equals("")){
      return input;
    }
    if(input.equals("    ")){
      return input;
    }
    if (spaces.indexOf(input.charAt(0))!= -1){
    
     }
   if (vowels.indexOf(input.charAt(0))!= -1){
    input += "ay";
   }
   else {
    input = input.substring(index)+input.substring(0,index) + "ay";
   }
    String result = translateWord(input);
    return result;
    
  }

  private static String translateWord(String input)
  {
    // System.out.println("translateWord: '" + input + "'");

    // Replace this code to correctly translate a single word.
    // Start here first!
    String result = input;
   
    return result;
  }

  // Add additonal private methods here.
  // For example, I had one like this:
  // private static String capitalizeFirstLetter(String input)

}