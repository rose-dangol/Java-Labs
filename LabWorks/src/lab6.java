import java.util.Scanner;
public class lab6 {
    public static void main(String[] args) {
        char ch;
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.6 \n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch=input.next().charAt(0);
        if(Character.isAlphabetic(ch))
            System.out.printf("The entered character, %c is an alphabet \n",ch);
        else
            System.out.printf("The entered character, %c is not an alphabet \n",ch);
    }
}
