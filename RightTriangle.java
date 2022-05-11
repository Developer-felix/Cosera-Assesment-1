// Write a program RightTriangle that takes three int command-line arguments and determines whether they constitute the side lengths of some right triangle
public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        //return true or false
        if (a * a + b * b == c * c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
}
