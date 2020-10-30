import  java.util.Scanner;
public class IfStatement {
    public static void main(String[] args){
        // Scanner sn = new Scanner(System.in);
        // String  userName = "";
        // int  passWord = 0;
         
        // System.out.println("Enter you Username");userName = sn.next();
        // System.out.println("password"); passWord = sn.nextInt();
        // System.out.println(userName);
        // System.out.println(passWord);
        // if (userName == "mateo") {
        //     System.out.println("You're now logged in.");
        // } else {
        //     System.out.println("Sorry, your usename or password is incorrect.");
        // }  
        Scanner sn = new Scanner(System.in);

        System.out.println("\tScore Evaluation Program");

        System.out.print("Enter your score between 0 - 100: ");
        int score = sn.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("You must enter a correct score, try again later.");
        } else {

            if (score >= 80) {
                System.out.println("Your score is excellent.");
                System.out.println("You grant grade S.");
            } else if (score >= 60) {
                System.out.println("Your score is good.");
                System.out.println("You grant grade A.");
            } else if (score >= 40) {
                System.out.println("Your score is fair.");
                System.out.println("You grant grade B.");
            } else {
                System.out.println("Your score is poor.");
                System.out.println("You grant grade C.");
            }

        }
    }
}
