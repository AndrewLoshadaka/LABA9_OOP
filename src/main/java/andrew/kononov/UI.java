package andrew.kononov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UI {
    private final Post post = new Post();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void createNewLetter() throws IOException {
        String name1, name2, route1, route2;
        System.out.println("Введите имя отправителя:");
        name1 = reader.readLine();
        System.out.println("Введите имя получателя:");
        name2 = reader.readLine();
        System.out.println("Введите адрес отправителя");
        route1 = reader.readLine();
        System.out.println("Введите адрес получателя");
        route2 = reader.readLine();

        Letter letter = new Letter();
        letter.setSender(name1);
        letter.setAddressee(name2);
        letter.setRouteOfLetter(route1 + "-" + route2);

        post.addLetter(letter);
    }

    public void menu() throws IOException {
        System.out.println("/----------------------------------------------\\");
        System.out.println("| 1 | Оформить новое письмо                    |");
        System.out.println("| 2 | Посмотреть все письма в списке           |");
        System.out.println("| 3 | Найти письма                             |");
        System.out.println("| 4 | Удалить письмо                           |");
        System.out.println("| 0 | Выход                                    |");
        System.out.println("\\----------------------------------------------/");
        System.out.println("Введите номер команды");
        processOfCommand();
    }

    public void processOfCommand() throws IOException{
        switch (reader.readLine()){
            case "1" -> createNewLetter();
            case "2" -> post.showInform(post.getListOfLetters());
            case "3" -> {
                System.out.println("Введите имя отправителя");
                String name = reader.readLine();
                if(post.findLetter(name).size() == 0)
                    System.out.println("Не найдено!");
                else
                    post.showInform(post.findLetter(name));
            }
            case "4" ->{
                post.showInform(post.getListOfLetters());
                System.out.println("Введите номер письма из списка:");
                int number = Integer.parseInt(reader.readLine());
                if(post.remove(number - 1))
                    System.out.println("Удалено!");
                else
                    System.out.println("Не найдено!");
            }
            case "0" -> System.exit(1);
            default -> menu();
        }
        menu();
    }
}
