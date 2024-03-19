import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        isLeapYear(2000);
        isLeapYear(2100);

        System.out.println(checkOS(0, 2000));
        System.out.println(checkOS(1, 2023));



        dell(60);


    }


    //Задача1
    public static int isLeapYear(int year) {
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " Год високосный");
        } else {
            System.out.println(year + " Гoд не високосный");
        }
        return (year);
    }

    //Задача2
    public static String checkOS(int clientOs, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();


        if (clientOs == 0 && clientDeviceYear >= currentYear) {
            return "Облегченный iOS";
        } else if (clientOs == 0 && clientDeviceYear < currentYear) {
            return "Обычный iOS";
        }
        if (clientOs == 1 && clientDeviceYear >= currentYear) {
            return "Облегченный Android";
        } else if (clientOs == 1 && clientDeviceYear < currentYear) {
            return "Обычный Android";
        }

        return "Неверные данные";
    }

    //Задача3
    public static void dell(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребются сутки, чтобы проехать " + deliveryDistance + " км");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется двое суток, чтобы проехать " + deliveryDistance + " км");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется еще трое суток, чтобы проехать " + deliveryDistance + " км");
        } else {
            System.out.println("Доставки нет");


        }


    }
}



