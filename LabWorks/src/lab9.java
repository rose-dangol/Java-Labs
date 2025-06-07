import java.util.Scanner;
public class lab9 {
    public static void main(String[] args) {
        int length, width, area, perimeter;
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.9 \n\n");
        Scanner lInput = new Scanner(System.in);
        Scanner wInput= new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        length=lInput.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        width=wInput.nextInt();
        System.out.println("The area of the rectangle is: " + length*width);
        System.out.println("The perimeter of the rectangle is: " + 2*(length+width));
    }
}
