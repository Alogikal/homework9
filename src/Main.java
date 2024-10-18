import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");
        System.out.println("---------------------------------------");
        int myArray[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " тыс рублей");
        System.out.println("---------------------------------------");

        System.out.println("Задача 2");
        System.out.println("---------------------------------------");
        int minValue = myArray[0];
        int minIndex = 0;
        int maxValue = myArray[0];
        int maxIndex = 0;
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minValue) {
                minValue = myArray[i];
                minIndex = i;
            } else if (myArray[i] > maxValue) {
                maxValue = myArray[i];
                maxIndex = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minValue + " с индексом " + minIndex + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxValue + " с индексом " +maxIndex + " рублей");
        System.out.println("---------------------------------------");

        System.out.println("Задача 3");
        System.out.println("---------------------------------------");
        double [] myArrayAverage = {12321, 23, 132, 12, 321233};
        int b = 0;
        int weeks = myArrayAverage.length;
        int c = 0;
        while (b <= myArrayAverage.length - 1) {
            c += c + myArrayAverage[b];
            b++;
        }
        System.out.println("Средняя зарплата зи месяц составила " + (c / weeks) + " рублей");

        System.out.println("---------------------------------------");

        System.out.println("Задача 4");
        System.out.println("---------------------------------------");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int l = reverseFullName.length;
        while (l > 0) {
            l--;
            System.out.print(reverseFullName[l]);
        }
    }
}
