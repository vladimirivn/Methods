import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public  static  boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    public  static void printMessageLeapYear(int year){
        if (isLeapYear(year)) {
            System.out.println(year + " год - високосный год");
        }
        else {
            System.out.println(year +" год - невисокосный год");
        }
    }
    public static String clientNameOs(int numberOs ){
        if (numberOs == 0) {
            return "iOS";
        } else if (numberOs == 1) {
            return "Android";
        } else {
            return "Такой ОС нет";
        }
    }
    public static String appVersionOs(int mobileYear){
        int currentYear = LocalDate.now().getYear();
        if (mobileYear < currentYear) {
            return "Lite версию";
        } else {
            return "Обычную версию";
        }
    }
    public static void outputInfoToClient(int mobileOs, int mobileYear){
        String osName = clientNameOs(mobileOs);
        String osVersion = appVersionOs(mobileYear);
        System.out.println("Для ОС - "+osName+" установите "+ osVersion);
    }
    public static int deliveryTimeInDays(int deliveryDistance){
        int deliveryDay;

        if (deliveryDistance <=20) {
            deliveryDay = 1;
        } else if (deliveryDistance >20 && deliveryDistance <=60) {
            deliveryDay = 2;
        } else if (deliveryDistance >60 && deliveryDistance <= 100) {
            deliveryDay = 3;
        } else {
            deliveryDay = 0;
        }
        return deliveryDay;
    }
    public static void deliveryTimeInformation(int deliveryDistance) {
        int deliveryDay = deliveryTimeInDays(deliveryDistance);
        if ( deliveryDay > 0) {
            System.out.println("Потребуется дней: " + deliveryDay);
        } else {
            System.out.println("Доставка не производится");
        }
    }
    public static void task1 () {
        System.out.println("---------------------- Задача 1 ---------------------");
        int clientDeviceYear = 2023;
        printMessageLeapYear(clientDeviceYear);
    }
    public static void task2 () {
        System.out.println("---------------------- Задача 2 ---------------------");
        outputInfoToClient(0, 2021);
    }
    public static  void task3() {
        System.out.println("---------------------- Задача 3 ---------------------");
        int deliveryDistance = 40;
        deliveryTimeInformation(deliveryDistance);
    }
}