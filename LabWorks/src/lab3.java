import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.3 \n\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array numbers:");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = input.nextInt();
        }
        int largest= numbers[0];
        for(int i=1;i<5;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        System.out.println("The largest number is: "+largest);
    }
}
