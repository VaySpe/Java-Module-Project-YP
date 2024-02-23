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
    }
}