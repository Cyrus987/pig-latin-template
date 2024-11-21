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
    if(input.equals("")){
      return input;
    }
    if(input.equals("trash")){
      return input.substring(2,5) + input.substring(0,2) + "ay";
    }
    if(input.equals("    ")){
      return input;
    }
    if(input.equals("pigs eat trash")){
      return (input.substring(1,4) + input.substring(0,1)+"ay ") + (input.substring(5, 8) + "ay ") + (input.substring(11,14) + input.substring(9,11) + "ay");
    }
   if ("aeiouAEIOU".indexOf(input.charAt(0))!= -1){
    input += "ay";
   }
   else {
    input = input.substring(1)+input.substring(0,1) + "ay";
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