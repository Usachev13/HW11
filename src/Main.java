public class Main {

    public static void returnLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год является високосным");
        } else
            System.out.println("Год не является високосным");
    }

    public static void main(String[] args) {
        System.out.println("HW11 starts!");
        System.out.println("Task 1");
        int year = 2024;
        returnLeapYear(year);
    }
}