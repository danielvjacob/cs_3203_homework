package cs_3203_homework;

public class homework {

    
    public static int Sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++){
            result += array[i];
        }
        return result;
    }
}
