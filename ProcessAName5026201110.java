import java.util.Scanner;


public class ProcessAName5026201110 {
    
    
public static void main(String[] args) {

    Scanner console = new Scanner(System.in);

    System.out.println("Name Processor\nWrite only 3 words if your name consists of more than 3 words\n");
    System.out.print("Enter your name: ");
    String name = console.nextLine();
        int length = name.length();
        int idx1 = name.indexOf(' ');
            if (idx1 == -1) {
                System.out.println("Your name is: " + name);
            }
            else {
                int idx2 = name.indexOf(' ', idx1+1);
                if (idx2 == -1) {
                    String lastName = name.substring(idx1+1, length);
                    //String firstName = name.substring(0, idx1);
                    System.out.println("Your name is: " + lastName + ", " + name.charAt(0) + ".");
                }
                else {
                    int idx3 = name.indexOf(' ', idx2+1);
                    if (idx3 == -1) {
                        String lastName = name.substring(idx2+1, length);
                        //String firstName = name.substring(0, idx2);
                        System.out.println("Your name is: " + lastName + ", " + name.charAt(0) + ". " +
                                name.charAt(idx1+1) + ".");
                    }
                    else {
                        System.out.println("Cannot proceed because you entered more than 3 words of" +
                                " your name");
                    }
                }
            }

    }
}