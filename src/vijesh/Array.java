package vijesh;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int start = sc.nextInt();
        System.out.println("Enter end number: ");
        int end = sc.nextInt();
        
        int size = (end - start) + 1;
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = start + i;
        }
        
        System.out.println("Even numbers :");
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("\nOdd numbers: ");
         for (int i = 0; i < size; i++) {
                if (i % 2 != 0) {
                    System.out.print(arr[i] + ",");
                }
            }
         sc.close();
        }
   	 
   }
        
        


