import java.util.Arrays;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {


        //Exercise 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        char space = '\u0020';
        String fullName = lastName + space + firstName + " " + middleName;
        System.out.println("ФИО сотрудника -" + '\u0020' + fullName);
        System.out.println();


        //Exercise 2
        System.out.println("Данные ФИО сотрудника для заполнения отчёта - " + fullName.toUpperCase());
        System.out.println();


        //Exercise 2.1 test
        String[] arrayFIO = {lastName, firstName, middleName};
        System.out.print("Данные ФИО сотрудника для заполнения отчёта - ");
        for (String words : arrayFIO) {
            System.out.print(words.toUpperCase() + space);
        }
        System.out.println("\n");


        //Exercise 2.2 test
        char[] mas = fullName.toUpperCase().toCharArray();
        System.out.print("Данные ФИО сотрудника для заполнения отчёта - ");
        for (char symbols : mas) {
            System.out.print(symbols);
        }
        System.out.println("\n");


        //Exercise 3
        String newFullName = "Иванов Семён Семёнович";
        char letter = 'ё';
        char altLetter = 'е';
        System.out.print("Данные ФИО сотрудника - ");
        System.out.println(newFullName.replace(letter, altLetter));
        System.out.println();


        //Exercise 3.1 test
        System.out.print("Данные ФИО сотрудника - ");
        for (int count = 0; count < newFullName.length(); count++) {
            if (newFullName.charAt(count) == letter) {
                System.out.print(altLetter);
            } else if (newFullName.toUpperCase().charAt(count) == Character.toUpperCase(letter)) {
                System.out.print(Character.toUpperCase(altLetter));
            } else {
                System.out.print(newFullName.charAt(count));
            }

        }
        System.out.println();

    }
}