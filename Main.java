import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String name;
    int nameLength;
    String halfName;

    //String input from a user.
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your name");
    name = input.nextLine();

    System.out.println("Hello "+name);
    
    //returns the number of characters including spaces and special characters
    nameLength = name.length();
    System.out.println("The length is: "+nameLength);


   halfName = name.substring(0, nameLength/2);
   System.out.println("First half is: "+halfName);

   System.out.println(name.substring(1));

   System.out.println(name.indexOf("r"));

   System.out.println(name.equals("Burger"));

   String letter ="cat";
   System.out.println(letter.compareTo("car"));

   System.out.println(name.replace("r","z"));

    
  }
}