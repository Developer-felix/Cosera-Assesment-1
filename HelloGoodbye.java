// Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello and goodbye messages as shown below (with the names for the hello message in the same order as the command-line arguments and with the names for the goodbye message in reverse order).
public class HelloGoodbye {
    public static void main(String[] args) {
        System.out.println("Hello " + args[0] + " " + args[1] + "!");
        System.out.println("Goodbye " + args[1] + " " + args[0] + "!");
    }
}