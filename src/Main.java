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
            }

        }
    }
