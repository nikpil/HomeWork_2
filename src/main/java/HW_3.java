import java.util.Arrays;

public class HW_3
{
    public static void main(String[] args)
    {
        int[] arr={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr) + " было");

        for (int w=0; w<arr.length;w++)   // Александр, подскажи почему не работает через foreach? for (int w: arr)
        {
            if(arr[w] < 6)
                arr[w] *=2;
        }
        System.out.println(Arrays.toString(arr) +" стало");


    }
}
