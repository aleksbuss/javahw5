import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



//    TODO
//    1) Создать массивы типа: int, double и создать методы, для их вывода на консоль
//    2) Сделать программу, которая будет складывать или вычитать введенные числа многократно,
//    пока не будет дана команда на выход из цикла
//    3*) Сделать процедуру для вывода из массива чисел со значением кратным 3. Найти в другой функции их среднее
//    арифметическое значение
//    4*) Перевернуть массив(реверсировать) и вывести из него все значения на нечетных позициях.
//    5**) Создать метод, который будет принимать строку и выводить из нее только гласные буквы


//        int [] arr = {3, 9, 21, 44, 88, 99}; // Создаем массив
//
//        double [] arr1 = {1, 2, 4, 8, 16, 32};// Инициализация массива при декларации
//
//        for(int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for(int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }

            Scanner scanner = new Scanner(System.in);
            char y;
            char e;

        for (; ;) {
            System.out.println("insert 1 number: ");
             int num1 = scanner.nextInt();
            System.out.println("insert 2 number: ");
            int num2 = scanner.nextInt();
            System.out.println("Выберите операцию: " +
                "\n a - fold " +
                "\n b - subtract");
            y = scanner.next().charAt(0);


            if(y == 'a'){
               int sum = num1 + num2;
                System.out.println("Result +: " + sum);
            }else if(y == 'b'){
                int dif = num1 - num2;
                System.out.println("Result -: " + dif);
            }
            System.out.println("do you want to continue: " +
                    "\n a - Type: " + "c" +
                    "\n b - Exit: " + "e");
            e = scanner.next().charAt(0);
            if (e == 'e'){
                break;
            }
        }




















//        System.out.println("Выберите операцию: " +
//                "\n c - продолжить " +
//                "\n e - выход");
//
//        ex = scanner.next().charAt(0);            // Считываем нулевой символ ввода
//
//        if(ex == 'e'){                // Проверяем ввод
//            break;           // Выход из цикла
//        }


//        int a = 5;
//        int b = 7;
//
//        if (a == 5 && b == 7) {
//            System.out.println("right");
//        }
//
//        Scanner scanner = new Scanner(System.in);
//
//
//
//        char ex;
//        int mark = 0;
//        for (; ; ) {                                     // Оцениваем группу. Пример бесконечного цикла
//            System.out.println("Введите оценку: ");
//            int c = scanner.nextInt();
//            mark += c;
//            if(c < 1 || c > 5) {                             // Проверяем диапазон ввода
//                System.out.println("Оценка вне диапазона ");
//            }
//            else {                                           // Если оценка в диапазоне, переходим к блоку
//                if (c == 5) {                                 // Блок if
//                    System.out.println("Отлично");
//                } else if (c == 4) {
//                    System.out.println("Хорошо");
//                } else if (c == 3) {
//                    System.out.println("Удовлетворительно");
//                } else {
//                    System.out.println("Плохо");
//                }
//            }
//
//            System.out.println("Выберите операцию: " +
//                    "\n c - продолжить " +
//                    "\n e - выход");
//
//            ex = scanner.next().charAt(0);            // Считываем нулевой символ ввода
//
//            if(ex == 'e'){                // Проверяем ввод
//                break;           // Выход из цикла
//            }
//
//        }
//
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 60; j++) {
//                for( int k = 0; k < 60; k++) {
//                    System.out.println(i ": " + j + ": " + k);
//
//                }
//            }
//        }


//        int [] arr = new int[10]; // Создаем массив
//
//        int [] arr1 = {1, 2, 4 ,3}; // Инициализация массива при декларации
//
//
//        for (int i = 0; i < arr.length; i++) {      // Присваиваем значения элементам массива
//            arr[i] = i;
//        }
//
//        System.out.println("Вывод первого массива: ");
//        print(arr);
//
//
//        System.out.println("Вывод второго массива: ");
//        print(arr1);
//
//    }
//
//    public static void print(int[] arr ){              // Создаю универсальный метод, который будет выводить
//        for (int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);                    // массив на консоль
//        }




//        int c = scanner.nextInt();
//        if (c < 1 || c > 5) {
//            System.out.println("not right");
//        } else {
//            c = scanner.nextInt();
//            if (c == 5) {
//                System.out.println("Great");
//            } else if (c == 4) {
//                System.out.println("good");
//            } else if (c == 3) {
//                System.out.println("not bad");
//
//            } else {
//                System.out.println("bad");
//            }
//        }
//
//
//        int x = 10, z = 10;                           // Ничего не меняется
//        x++;
//        ++z;
//
//        System.out.println();
//
//        System.out.println("x: " + x + ", z: " + z);
//
//        int x1 = 10, c1 = 10;                              // Форма имеет значение
//        final int y1 = 13 - x1++;
//        final int z1 = 13 - ++c1;
//
//        System.out.println("y: " + y1 + ", z: " + z1);
//
//        String str = "hello";
//        for(int i = str.length()+1; i>=0; i--){
//            System.out.print(str.charAt(i)+" ");
//        }
//        for (int i =0; i < str.length(); i++){
//            System.out.println(i+ " ");
//        }




    }
}
