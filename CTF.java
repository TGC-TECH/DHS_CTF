/**
 * Program by Toby Cowles
 * HINT: There are two ways to get the Key, either pass the coding test or modify the program so it will give you the anwser any time
 */
import java.util.Scanner;
public class CTF {
  
  
  public static void main(String[] args) { 
    
 
  
  System.out.println("Welcome to the Coding Quiz");
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Please answer all of the coding questions be entering the number of correct solution, if you get an 100% you will get the key");
  System.out.println(" ");
  int score = 0;
  System.out.println("In coding what is the most common type of logical test.");
    System.out.println("1.) if statements");
    System.out.println("2.) or statements");
    System.out.println("3.) else statements");
    System.out.println("4.) and statements");
  int input = keyboard.nextInt();
  if (input == 1) { score++; }
   System.out.println("In java and C++ how do you end lines");
    System.out.println("1.) :");
    System.out.println("2.) ;");
    System.out.println("3.) \\");
    System.out.println("4.) |");
  input = keyboard.nextInt();
  if (input == 2) { score++; }
   System.out.println("What scripting language cares about indentations");
    System.out.println("1.) Bash");
    System.out.println("2.) C++");
    System.out.println("3.) Java");
    System.out.println("4.) Python");
  input = keyboard.nextInt();
  if (input == 4) { score++; }
   System.out.println("What language in used in the linux terminal");
    System.out.println("1.) Bash");
    System.out.println("2.) C++");
    System.out.println("3.) Java");
    System.out.println("4.) Python");
  input = keyboard.nextInt();
  if (input == 1) { score++; }
   System.out.println("What language is most commonly used for web devolpment");
    System.out.println("1.) C#");
    System.out.println("2.) js");
    System.out.println("3.) Java");
    System.out.println("4.) Python");
  input = keyboard.nextInt();
  if (input == 2) { score++; }
  if (score == 5) {System.out.println("Congrats, the key is: KEY-" + 4%2+8/4+900%7*50/2);}
  else {System.out.println("Sorry you did not pass the test");}
  
    
  
  }}
