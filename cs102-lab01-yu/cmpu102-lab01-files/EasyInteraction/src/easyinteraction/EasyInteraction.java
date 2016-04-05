package easyinteraction;

import acm.program.*;

/**
 * Program EasyInteraction gives demonstration of using the
 * libraries in the acm.program package to read input from the
 * user and write output in a pop-up frame.
 */ 
 
public class EasyInteraction extends ConsoleProgram {
 
   /* Displays a pop-up frame for program execution */
   public void run() {      
      println("Welcome to CMPU102: Topics in Computer Science");
      String firstName = readLine("Please enter your first name: ");
      String lastName = readLine("Please enter your last name: ");
      println("Hello, " + firstName + " " + lastName + "." );
      println("It's a pleasure to have you with us!");
   }
 
   /* Standard Java entry point */
   public static void main(String[] args) {
      /* Calling the start method of a ConsoleProgram (e.g., EasyInteraction)
       * invokes the system to call the run method.
       */
      new EasyInteraction().start();
   }
} 
