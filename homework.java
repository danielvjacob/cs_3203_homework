package cs_3203_homework;
import java.util.*;

public class homework {
    public static void main(String[] args) throws Exception{
        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            int number;
            System.out.println("Enter number: ");
            number = scan.nextInt();
            array[i] = number;
        }
        
        int sum = Sum(array);
        int product = Product(array);

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The product of the array is: " + product);

        int[] reversed = reverse(array, array.length);
        for (int i = 0; i < array.length; i++){
            System.out.print(reversed[i]);
        }
    }
    public static int Sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }

    public static int Product(int[] array) {
        int result = 1;
        for (int i = 0; i < array.length; i++){
            result = result * array[i];
        }
        return result;
    }

    public static int[] reverse(int a[], int len){
        int[] reversed = new int[len];
        int count = len;
        for (int i = 0; i < len; i++) {
            reversed[count - 1] = a[i];
            count = count - 1;
        }
        return reversed;
    }
}

