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
}
