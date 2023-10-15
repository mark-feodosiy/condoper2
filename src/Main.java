public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println();
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



    }
}