import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("HW11 starts!");
        task1();
        task2();
        task3();
    }

    public static void returnLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }
    public static void task1(){
        System.out.println("Task 1");
        int year = 2024;
        returnLeapYear(year);
    }

    public static void installThisOs(int os, int productionYear){
        int ios = 0;
        int android = 1;
        int yearOfChange = 2015;
        if (os == ios){
            if (productionYear < yearOfChange){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (os == android){
            if (productionYear < yearOfChange){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else { System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }
    public static void task2(){
        System.out.println("Task 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your OS : ios write '0', android write '1' ");
        int os = scanner.nextInt();
        System.out.println("Enter production year of your phone ");
        int productionYear = scanner.nextInt();
        installThisOs(os, productionYear);
    }

    public static String returnDeliveryDays(int distance){
        String daysForDelivery;
        if (distance <= 20){
            daysForDelivery = "Потребуется дней: 1";
        } else if (distance <= 60){
            daysForDelivery = "Потребуется дней: 2";
        } else if (distance < 100){
            daysForDelivery = "Потребуется дней: 3";
        }else {
            daysForDelivery = "Доставка не осуществляется";
        }
        return daysForDelivery;
    }

    public static void task3(){
        System.out.println("Task 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите расстояние до себя:");
        int distance = scanner.nextInt();
        String daysForDelivery = returnDeliveryDays(distance);
        System.out.println(daysForDelivery);
    }
}