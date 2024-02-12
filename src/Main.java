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
        System.out.println(wholeNumbers[0] + ", " + wholeNumbers[1] + ", " + wholeNumbers[2]);
        System.out.println(fractionalNumbers[0] + ", " + fractionalNumbers[1] + ", " + fractionalNumbers[2]);
        System.out.println(anyWholeNumbers[0] + ", " + anyWholeNumbers[1] + ", " + anyWholeNumbers[2]);
        System.out.println("Задание 3");
        System.out.println(wholeNumbers[2] + ", " + wholeNumbers[1] + ", " + wholeNumbers[0]);
        System.out.println(fractionalNumbers[2] + ", " + fractionalNumbers[1] + ", " + fractionalNumbers[0]);
        System.out.println(anyWholeNumbers[2] + ", " + anyWholeNumbers[1] + ", " + anyWholeNumbers[0]);
        System.out.println("Задание 4");
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