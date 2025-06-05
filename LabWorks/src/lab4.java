import java.util.Scanner;
public class lab4 {
        public static void main(String[] args) {
            int[] num;
            int Size;
            System.out.print("Rose Dangol (28684/078) \n");
            System.out.print("Lab no.4 \n\n");
            Scanner arraySize = new Scanner(System.in);
            System.out.print("Enter the array size:");
            Size= arraySize.nextInt();
            num = new int[Size];
            Scanner array = new Scanner(System.in);
            System.out.print("Enter the array elements:");
            for(int i=0;i<Size;i++){
                num[i] = array.nextInt();
            }
            int largest= num[0];
            int secondLargest=num[0];
            for(int i=0;i<5;i++){
                if(num[i]>largest) {
                    secondLargest = largest;
                    largest = num[i];
                }
                else if(num[i]>secondLargest && num[i]!=largest){
                    largest=secondLargest;
                }
            }
            System.out.println("The second largest number is: "+secondLargest);
        }
}
