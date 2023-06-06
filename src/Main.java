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
        } else
            System.out.println("Год не является високосным");
    }
    public static void task1(){
        System.out.println("Task 1");
        int year = 2024;
        returnLeapYear(year);
    }

    public static void installThisOs(int os, int productionYear){
        if (os == 0){
            if (productionYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (os == 1){
            if (productionYear < 2015){
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

    public static void returnDeliveryDays(int distance){
        int daysForDelivery = 0;
        if (distance <= 20){
            daysForDelivery += 1;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (distance > 20 && distance <= 60){
            daysForDelivery += 2;
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (distance > 60 && distance < 100){
            daysForDelivery += 3;
            System.out.println("Потребуется дней: " + daysForDelivery);
        }else System.out.println("Доставка не осуществляется");
    }

    public static void task3(){
        System.out.println("Task 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите расстояние до себя:");
        int distance = scanner.nextInt();
        returnDeliveryDays(distance);
    }
}