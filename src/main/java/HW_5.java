import java.util.Arrays;

public class HW_5
{
    public static void main(String[] args)
    {
        int[]arr={9,6,0,-29,1};
        int minNumb = 0;
        int maxNumb= 0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxNumb)
            {
                maxNumb=arr[i];
            }
            if(arr[i]<minNumb)
            {
                minNumb=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(maxNumb + " - максимальное число. "+minNumb+" - минимальное число");

    }
}
