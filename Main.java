public class Main {

   public static void main(String []args) {
      System.out.println("Hello World");

      //One = sign ASSIGNS a value to a variable
      int age = 15;
      int year = 14;

      //TWO == signs is checking for EQUALITY
      boolean match = (age == year);
      System.out.println("Does age amtch year? " + match);

      year = 15; // RE-ASSIGNING
      System.out.println(age == year); // true

      // != means "Is NOT equal to"
      System.out.println(age != year); //false

      // RELATIONAL OPERATORS
      // used in boolean expressions
      double pi = 3.14159;
      System.out.println(pi > 0); // checking if positive
      System.out.println(pi < 0); // checking if negative
      System.out.println(pi >= 3.14);
      System.out.println(pi <= 10);

      // IF STATEMENTS
      boolean isCold = false;{
      if (isCold == true);
         System.out.println("Bring a jacket");
      }
         System.out.println("Enjoy your walk!");

      // Magic-8 Ball Mini Program
      // 1. Generate random integer between 1-8

      double randDoub = Math.random() * 8 + 1; // adjust the output range
      int randInt = (int) randDoub; // CASTING types
      System.out.println(randInt);

      // 2. Use that numebr in 8 if statements to print a different response

      if (randInt == 1){
         System.out.println("It is looking good buddy...");
      }
      if (randInt == 2){
         System.out.println("Your future is bright!");
      }
      if (randInt == 3){
         System.out.println("You will enjoy life!");
      }
      if (randInt == 4){
         System.out.println("Happiness is upon you!");
      }
      if (randInt == 5){
         System.out.println("Success is in your future!");
      }
      if (randInt == 6){
         System.out.println("You will succeed!");
      }
       if (randInt == 7){
         System.out.println("You will do great!");
      }
      if (randInt == 8){
         System.out.println("You will do amazing!");
      }


   }
}
