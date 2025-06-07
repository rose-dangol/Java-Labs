import java.util.Scanner;
public class lab11 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.11 \n\n");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1=input1.nextInt();
        System.out.print("Enter second number: ");
        num2=input2.nextInt();
        System.out.println("\n\t--Before Swapping--");
        System.out.printf("\t \tnum1= %d and num2=%d\n",num1,num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("\n \t--After Swapping--");
        System.out.printf("\t \tnum1= %d and num2=%d\n",num1,num2);
    }
}
