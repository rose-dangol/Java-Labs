import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.2 \n\n");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=input.nextInt();

        if(num%2==0){
            System.out.println("The entered number is even.");
        }
        else{
            System.out.println("The entered number is odd.");
        }
    }
}