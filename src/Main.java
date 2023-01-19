public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        System.out.println("Задача 1");
        {
            for(int i = 0; i <= 10; i = i + 1){
                System.out.println("Итерация цикла " + i);
            }
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        {
            for(int i = 10; i >= 0; i = i - 1){
                System.out.println("Итерация цикла " + i);
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        {
            //Выведите в консоль все четные числа от 0 до 17.
            {
                for(int i = 0; i <= 17; i = i + 2){
                    System.out.println("Итерация цикла " + i);
                }
            }
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        {
            //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
            {
                for(int i = 10; i >= -10; i = i - 1){
                    System.out.println("Итерация цикла " + i);
                }
            }
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        {
            //Напишите программу, которая выводит в консоль все високосные года,
            // начиная с 1904 года до 2096. В консоль результат должен выводиться
            // в формате: «… год является високосным».
            for (int i = 1904; i < 2096; i = i +4 ) {
            System.out.println(i + " год является високосным!");}
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        {
            // Напишите программу, которая выводит в консоль последовательность чисел:
            //
            //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        {
            //
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        {
            //
        }
    }
    public static void task9() {
        System.out.println("Задача 9");
        {
            //
        }
    }
    public static void task10() {
        System.out.println("Задача 10");
        {
            //
        }
    }

}
