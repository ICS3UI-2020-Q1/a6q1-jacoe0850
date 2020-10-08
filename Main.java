import java.util.Scanner;
/**
 *
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("How many heights would you like to enter");
    int arraynum = input.nextInt();
    int[] height = new int[arraynum];
    System.out.println("Please enter the heights on separate lines");
     for(int i = 0; i < arraynum; i++){
       height[i] = input.nextInt();
     }
     int total = 0;
     for(int i = 0; i < arraynum; i++){
      total = total + height[i];
    }
    int average = total/arraynum;
    System.out.println("The average height is " + average);
    System.out.println("The heights above average are");
   for(int i = 0; i < height.length; i++){
     if(height[i] > average){
       System.out.println(height[i]);
     }
   }
  }
}
