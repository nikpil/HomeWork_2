//Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами


public class HW_4
{
    public static void main(String[] args)
    {
        int count = 1;
        int[][] table;
        table = new int[4][4];
        for(int i=0 ;i< table.length; i++)
        {
            for (int j = 0, o = table[i].length; j < table[i].length; j++, o--)
            {
//                table[i][j] = count;
//                count++;
                if (i == j || i == (o - 1)) table[i][j] = 1;

                System.out.print(table[i][j] + " ");

            }
            System.out.println();
        }

    }
}