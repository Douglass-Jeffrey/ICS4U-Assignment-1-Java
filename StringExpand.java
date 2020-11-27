/*
* This program recieves inputs like a3tx2z and translates them to strings of 
* letters that are defined by their numbers (blowing up a string). For example,
* a3tx2z would be attttxzzz if it was blown up by this program
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-11-27
* Class StringExpand.
*/

import java.util.Scanner;

public class StringExpand {
  
  /**
  * Runs the String expansion program to derive an expanded string from letters
  * and numbers.
  */

  public static void main(String[] args) {
    
    // Defines the translated string that will be outputted at the end
    String translString = " ";
    
    // Create a scanner object
    Scanner myObj = new Scanner(System.in);

    // prompts user to enter string input
    System.out.println("Enter the string that you wish to be translated");
    // Read user inputted string input
    String userString = myObj.nextLine();

    /* Process: loop automatically moves through list of characters in the
    * string marking those that are integers. If they are integers, program will
    * find next text object and print that as many times as integers value
    */
    for (int charCount = 0; charCount < userString.length(); charCount++) {
      // Catches any errors in terms of letters at the end of the string
      try {
        // Determines whether or not character is a digit if it is, then mark it
        boolean mark = (Character.isDigit(userString.charAt(charCount)));

        /* if character is marked as a digit, enter loop and add it to the final
        * string as many times as the integers value
        */
        if (mark) {
          for (int timesLooped = 0; timesLooped < userString.charAt(charCount) 
               - 48; timesLooped++) { // -48 stops excess addition of letters
            
            // Adds letter to final string (charcount) times
            translString = translString + (userString.charAt(charCount + 1));
          }
        // if a character isnt marked as a digit, add it to translString
        } else {
          translString = translString + userString.charAt(charCount);
        }
      //Prevents program from crashing when numbers are on the end of the string
      } catch (Exception e) {
        translString = translString + userString.charAt(charCount);
      }
    }
    // Prints final translated string
    System.out.println("Translated string:" + translString);
  }
}
