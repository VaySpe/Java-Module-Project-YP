import java.util.Scanner;

public class Main {
    public static boolean isInt(String people){
        try {
            int peopleInt = Integer.parseInt (people);
            if (peopleInt <= 1){
                System.out.println("Введено не корректное кол-во человек");
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введено не корректное значение, используйте целые числа");
            return false;
        }
    }

    public static boolean isPriceDouble(String strPrice){
        try {
            double price = Double.parseDouble(strPrice);
                return true;
        } catch (NumberFormatException e) {
            System.out.println("Введено не корректное значение, стоимость должна быть в формате {рубли.копейки}");
            return false;
        }
    }

    public static void main(String[] args) {
        boolean numberOfPeopleCorrectly = false;
        Scanner scanner = new Scanner(System.in);
        while (!numberOfPeopleCorrectly) {
            System.out.println("на скольких человек необходимо разделить счёт?");
            // принимаем не известный тип данных
            String people = scanner.nextLine();
            if (isInt(people)) {
                numberOfPeopleCorrectly = true;
            }
        }
        System.out.println("Добавление товаров в калькулятор");
        while (true) {
            System.out.println("Пример:\n Помидор 10.45");
            String product = scanner.next();
            // принимаем не известный тип данных
            String strPrice = scanner.next();
            if (product.equalsIgnoreCase("завершить") || strPrice.equalsIgnoreCase("завершить")) {
                break;
            }
            if (isPriceDouble(strPrice)){
                //товар корректный
                double price = Double.parseDouble(strPrice);
                //item(product, price); добавление товара в класс калькулятор
            }
        }
    }
}