public class Main {
    public static void main(String[] args) {

        System.out.println();
        {
            // Задача № 1
            int clientOS = 1;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                if (clientOS == 1) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
            System.out.println();
            {
                // Задача № 2
                int userOS = 1;
                int yearOS = 2014;
                if (userOS == 0 && yearOS < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else if (userOS == 0 && yearOS >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (userOS == 1 && yearOS < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else if (userOS == 1 && yearOS >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
            System.out.println();
            {
                // Задача № 3
                int year = 2021;
                if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год является невисокосным");
                }
            }
            System.out.println();
            {
                // Задача № 4
                int deliveryDistance = 110;

                if (deliveryDistance > 100) {
                System.out.println("Доставка не осуществляется");
                } else {
                    int deliveryDays = 1;
                    if (deliveryDistance >= 20 && deliveryDistance < 60) {}
                    deliveryDays++;
                    if (deliveryDistance >= 60 && deliveryDistance < 80) {}
                    deliveryDays++;
                    if (deliveryDistance >= 80 && deliveryDistance < 100) {
                    deliveryDays++;}
                       System.out.println("Потребуется количество дней - " + deliveryDays);
                                    }
                    }
                }

            }

        }


