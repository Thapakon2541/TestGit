import java.util.Scanner;


public class Student {
  public static void main(String[] args){
      Scanner sn =new Scanner(System.in);
        String  name;
        int   num; 
    System.out.println("\tGreeting program");
    System.out.println("Enter Your name");
    name = sn.next();
    System.out.print("Enter your favorite number: ");
    num = sn.nextInt();
    System.out.println("Hellow"+ ":"+ name);
    System.out.println(", your favorite number is "+num);

  }
}
