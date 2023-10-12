import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //ввод данных

        Scanner inputString = new Scanner(System.in);
        System.out.println("Введите данные пользователя"); // Тимофеев Кирилл Владиславович 27.04.1990 89215744948 м
        String data = inputString.nextLine(); //Тимофеев Иван Владиславович 27.04.1990 89215744948 м
        System.out.println(data);//Семенов Иван Владиславович 27.04.1990 89215744948 м

        // массив создаем  из данных
        String[] parse = data.split(" ");
        int lenght = parse.length;
        System.out.println(lenght);

        //Проверяем длинну масиива и  называем переменные
        if (lenght != 6) {
            throw new RuntimeException("Введены данные не корреткно");

        }
            String surname = parse[0];
            String name = parse[1];
            String secondname = parse[2];
            String date = parse[3];
            String phone = parse[4];
            String male = parse[5];


        //Проверка  полей на корректность ввода

        if (date.length() != 10 ) {
            throw new RuntimeException("Не корректно введена дата");
        }
        if ( phone.length() != 11) {
            throw new RuntimeException("Не корректно введен телефон");
        }
        if ( male.length() != 1) {
            throw new RuntimeException("Не корректно введен пол");
        }
        // создаем объект Human
        Human man = new Human(surname, name, secondname, date, phone, male);
        String filename = man.surname + ".txt";

        //создаем файл


        try(FileWriter file = new FileWriter(filename, true))
        {

            file.write(man.toString());
            file.write("\n");




        }
        catch (IOException e){
            throw  new  RuntimeException("Ошибка чтения записи файла");
        }

    }
}