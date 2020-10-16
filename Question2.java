import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        

        System.out.print("Hi there what is your name?");
        String name = scan.nextLine();
        System.out.print("Hi" + name + "how old are you?");
       
       int age = scan.nextInt();
        System.out.println(name + " is " + age + "years old.");
        

        
       
        
        

    }
}