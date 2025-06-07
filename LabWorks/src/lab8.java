import java.util.Scanner;
public class lab8 {
    public static void main(String[] args) {
        int m,n;
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.8 \n\n");
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter the first number 'm': ");
        m=input1.nextInt();
        System.out.print("Enter the second number 'n': ");
        n=input2.nextInt();
        if(m%n==0)
            System.out.printf("m(%d) is a multiple of n(%d)",m, n);
    }
}
