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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15000;
        int total = 0;
        while (total <= 2_459_000) {
            total = total + contribution;
            int b = total / contribution;
            System.out.println("Месяц " + b + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 1;
        int b = 0;
        while (b < 10) {
            b = b + a;
            System.out.print(" " + b + "");
        }
        System.out.println();
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(" " + i + "");

        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int y = 12000000;
        for (int i = 1; i <= 10; i++) {
            int theBirthRateOfPeople = 17 * y / 1000;
            int humanMortality = 8 * y / 1000;
            y = y + (theBirthRateOfPeople - humanMortality);
            System.out.println("Год " + i + " численность населения " + y);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 15000;
        int i = 1;
        for (; total <= 12000000; i++) {
            total = total + total * 7 / 100;
            System.out.println("месяц " + i + " сумма накоплений " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 15000;
        int i = 1;
        for (; total <= 12000000; i++) {
            total = total + total * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("месяц " + i + " сумма накоплений " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15000;
        for (int i = 1; i <= 9 * 12; i++) {
            total = total + total * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("месяц " + i + " сумма накоплений " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int friday = 5; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int b = 2023;
        int c = b - 200;
        int d = b + 100;
        for (int a = 0; a <= d; a = a + 79) {
            if (a >= c)
                System.out.println(a);
        }


    }


}