import java.util.Scanner;
public class lab10 {
    public static void main(String[] args) {
        float radius;
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.10 \n\n");
        Scanner rInput = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius=rInput.nextFloat();
        double area = 3.14*radius*radius;
        double circumference = radius+radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}
