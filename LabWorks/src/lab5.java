import java.util.Scanner;
public class lab5 {
    public static void main(String[] args) {
        int num1,num2,num3;
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.5 \n\n");
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1=input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the second number: ");
        num2=input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the third number: ");
        num3=input3.nextInt();
        int result = (num1>num2&&num1>num3)?num1:(num2>num3?num2:num3);
        System.out.println("The largest number is: "+result);
    }
}
