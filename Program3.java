//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
 public class Program3 {
     public static void main(String[] args) {
         // Create input scanner
         Scanner scanText = new Scanner(System.in);
         
         // Make variables
         int length = 0;
         int width = 0;
         int area = 0;
         int perimeter = 0;
         
         // Tell user what to input
         System.out.println("Enter the length of the rectangle: "); 
         
         // Store input
         length = scanText.nextInt();
         
         // Tell user what to input
         System.out.println("Enter the width of the rectangle: ");
         
         // Store input
         width = scanText.nextInt();
         
         // Calculate values
         area = length * width;
         perimeter = (2 * length) + (2 * width);
         
         // Report values back to user
         System.out.println("The rectangle's area is " + area);
         System.out.println("The rectangle's perimeter is " + perimeter);
         
     }
 }



//Paste console output below:
/*
Enter the length of the rectangle: 
123
Enter the width of the rectangle: 
50
The rectangle's length is 123
The rectangle's width is 50
The rectangle's area is 6150
The rectangle's perimeter is 346
*/
