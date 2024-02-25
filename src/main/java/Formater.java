import java.util.Scanner;
public class Formater {

    public static int peopleCorrectly (){
        Scanner scanner = new Scanner(System.in);
        boolean numberOfPeopleCorrectly = false;
        String people = "";
        while (!numberOfPeopleCorrectly) { // пока не корректное колво людей
            System.out.println("на скольких человек необходимо разделить счёт?");
            // принимаем не известный тип данных
            people = scanner.nextLine();
            if (Main.isInt(people)) { // Проверяем на интовость кол-во чел и более 1
                numberOfPeopleCorrectly = true; // Корректное колво людей
            }
        }
        return Integer.parseInt (people);
    }

    public static String rub (double priceDouble){
        int price = (int) priceDouble;
        int units = price%10;
        int dozens = price%100/10;
        if (dozens == 1){
            return "рублей";
        } else if (units > 4 || units == 0){
            return "рублей";
        } else if (units == 1) {
            return "рубль";
        } else {
            return "рубля";
        }
    }
}
