
package student;

import java.util.Scanner;

/**
 *
 * @author ivy20
 */
public class Student {

    public static void main(String[] args) {
      /* char[] myWord = new char[7];
        myWord[0] = 's';
        myWord[1] = 't'; 
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
    
        for(int i = 0; i < myWord.length; i++){
            System.out.print(myWord[i]);  
        
   }
        System.out.println();
        System.out.println("Reversing the word: ");
        for(int i = myWord.length -1; i >=0; i--){
            System.out.print(myWord[i]);
        }
         System.out.println();*/
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter a word: ");
      String word = sc.nextLine();
      
      char[] myLetters = new char[word.length()];
      for(int i =0; i < myLetters.length; i++){
          myLetters[i] = word.charAt(i);
          System.out.println(myLetters[i]);
      }
    }
    
}
        
