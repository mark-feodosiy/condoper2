public class Main {
    public static void main(String[] args) {

        System.out.println();
        {
            // Задача № 1
            int clientOS = 1;
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Выберите О или 1");
            }

        System.out.println();
        {
            // Задача № 2
            int clientOS = 0;
            int yearOS = 2016;
            if ((clientOS = 0) && (yearOS < 2015)) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS = 0 && yearOS >= 2015) {
                   System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS = 1 && yearOS < 2015) {
                   System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS = 1 && yearOS >= 2015) {
                   System.out.println("Установите версию приложения для Android по ссылке");
                   }

            }
        }

    }
}