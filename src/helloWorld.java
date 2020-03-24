import java.util.Scanner;

public class helloWorld {
    public static void main (String[] args) {
        
        System.out.println("Do you like Git?");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(input);
    }

}