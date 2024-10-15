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


   }
}
