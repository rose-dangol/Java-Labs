import java.util.Scanner;
public class lab7 {
    public static void main(String[] args) {
        int[] array;
        int size;
        System.out.print("Rose Dangol (28684/078) \n");
        System.out.print("Lab no.7 \n\n");
        Scanner sizeInput= new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        size=sizeInput.nextInt();
        array=new int[size];

        Scanner input= new Scanner(System.in);
        System.out.print("Enter the elements of the array : ");
        for( int i=0;i<size;i++){
            array[i]=input.nextInt();
        }
        //sorted check garna aba
        int count=0;
        for(int i=0;i<size-1;i++){
            if(array[i]>array[i+1]){
                count++;
            }
        }
        if(count==0)
            System.out.println("The given array is sorted! \n");
        else
            System.out.println("The given array is not sorted! \n");
    }
}
