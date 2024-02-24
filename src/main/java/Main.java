import java.util.ArrayList;
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
            if (price >= 0.01) {
                return true;
            } else {
                System.out.println("Введено не корректное значение, стоимость должна быть больше 0");
            }
        } catch (NumberFormatException e) {
            System.out.println("Введено не корректное значение, стоимость должна быть в формате {рубли.копейки}");
            System.out.println("Пример:\n Помидор 10.45");
            return false;
        }
        return false;
    }

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<Product>(); // создаем список товаров
        Scanner scanner = new Scanner(System.in);
        int people = Formater.peopleCorrectly(); // получаем интовое колво людей

        Calculator calculator = new Calculator(people);
        System.out.println("Добавление товаров в калькулятор");
        System.out.println("Пример:\n Помидор 10.45");

        boolean isAddProduct = true;
        while (isAddProduct) { // собираем товары

            String product = scanner.next();
            if (product.equalsIgnoreCase("завершить")) {
                break;
            }
            // принимаем не известный тип данных
            String strPrice = scanner.next();
            if (strPrice.equalsIgnoreCase("завершить")) {
                break;
            }

            if (isPriceDouble(strPrice)){
                //товар корректный
                double price = Double.parseDouble(strPrice);
                products.add(new Product(product, price)); //добавление товара в товары
                System.out.println(product + " " + Math.floor(price*100)/100 + ". Данный товар был успешно добавлен");
                calculator.account += Math.floor(price*100)/100;
                System.out.println("Общий чек составляет:" + calculator.account);
                isAddProduct = false;
            }

            while (!isAddProduct){ // проверяем хочет ли пользователь добавить еще товар и переспрашиваем при не понятном ответе
                System.out.println("Хотите ли Вы добавить ещё один товар? Да/Нет");
                String ans = scanner.nextLine();
                if (ans.equalsIgnoreCase("нет")){
                    break;
                } else if (ans.equalsIgnoreCase("да")) {
                    isAddProduct = true;
                }
            }
        }
        // вывод всех товаров
        // вывод скольк одолжен заплатить каждый
    }
}
