import java.util.Scanner;
/**
 * Asks for amount of heights, acalculates average and says which numbers are above average
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // scanner for input
    Scanner input = new Scanner(System.in);
    // asking for amount heights
    System.out.println("How many heights would you like to enter");
    // variable for amount of heights
    int arraynum = input.nextInt();
    // array variable for amount of heights
    int[] height = new int[arraynum];
    // ask for heights
    System.out.println("Please enter the heights on separate lines");
    // for loop letting the user input x amounts of heights
     for(int i = 0; i < arraynum; i++){
       height[i] = input.nextInt();
     }
     // variable for total for calculating average
     int total = 0;
     // adds total
     for(int i = 0; i < arraynum; i++){
      total = total + height[i];
    }
    // calculates average
    int average = total/arraynum;
    // displays average
    System.out.println("The average height is " + average);
    // states heights above average and calculates which heights are above average
    System.out.println("The heights above average are");
   for(int i = 0; i < height.length; i++){
     if(height[i] > average){
       System.out.println(height[i]);
     }
   }
  }
}
