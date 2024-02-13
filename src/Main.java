import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int [] wholeNumbers = new int [3];
        wholeNumbers[0] = 1;
        wholeNumbers[1] = 2;
        wholeNumbers[2] = 3;
        double [] fractionalNumbers = {1.57, 7.654, 9.986};
        int [] anyWholeNumbers = {4, 5, 6};
        System.out.println("Задание 2");
        for (int i = 0; i < wholeNumbers.length; i++)
        {
            if (i == wholeNumbers.length -1)
            {
                System.out.print(wholeNumbers[i]);
            }
            else
            {
                System.out.print(wholeNumbers[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < fractionalNumbers.length; i++)
        {
            if (i == fractionalNumbers.length -1)
            {
                System.out.print(fractionalNumbers[i]);
            }
            else
            {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < anyWholeNumbers.length; i++)
        {
            if (i == anyWholeNumbers.length -1)
            {
                System.out.print(anyWholeNumbers[i]);
            }
            else
            {
                System.out.print(anyWholeNumbers[i] + ", ");
            }
        }
        System.out.println("\nЗадание 3");
        for (int i = wholeNumbers.length - 1; i >= 0; i--)
        {
            if (i == 0)
            {
                System.out.print(wholeNumbers[i]);
            }
            else
            {
                System.out.print(wholeNumbers[i] + ", ");
            }
        }
        System.out.println();
        for (int i = fractionalNumbers.length - 1; i >= 0; i--)
        {
            if (i == 0)
            {
                System.out.print(fractionalNumbers[i]);
            }
            else
            {
                System.out.print(fractionalNumbers[i] + ", ");
            }
        }
        System.out.println();
        for (int i = anyWholeNumbers.length - 1; i >= 0; i--)
        {
            if (i == 0)
            {
                System.out.print(anyWholeNumbers[i]);
            }
            else
            {
                System.out.print(anyWholeNumbers[i] + ", ");
            }
        }
        System.out.println("\nЗадание 4");
        for (int i = 0; i < wholeNumbers.length; i++)
        {
            if (wholeNumbers[i] % 2 != 0)
            {
                wholeNumbers[i] += 1;
            }
            System.out.print(wholeNumbers[i] + " ");
        }


    }
}