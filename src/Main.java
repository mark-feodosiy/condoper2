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
        System.out.println();
              {
                  // Задача № 5
                 int monthNumber = 13;
                 switch (monthNumber) {
                     case 12:
                     case 1:
                     case 2:
                         System.out.println("Зима");
                         break;
                     case 3:
                     case 4:
                     case 5:
                         System.out.println("Весна");
                         break;
                     case 6:
                     case 7:
                     case 8:
                         System.out.println("Лето");
                         break;
                     case 9:
                     case 10:
                     case 11:
                         System.out.println("Осень");
                         break;
                     default:
                         System.out.println("Такого месяца не существует");


              }


        }
    }
}



