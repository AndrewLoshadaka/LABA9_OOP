package andrew.kononov;

import java.util.LinkedList;

public class Post {
    //список с письмами
    private final LinkedList<Letter> listOfLetters;
    public Post(){
        this.listOfLetters = new LinkedList<>();
    }

    public void addLetter(Letter letter){
        listOfLetters.add(letter);
    }

    public LinkedList<Letter> getListOfLetters() {
        return listOfLetters;
    }

    public LinkedList<Letter> findLetter(String route){
        LinkedList<Letter> letters = new LinkedList<>();
        for(Letter x : listOfLetters){
            if(x.getSender().getName().equals(route)){
                letters.add(x);
            }
        }
        return letters;
    }

    public void showInform(LinkedList<Letter> list){
        int i = 1;
        for (Letter x : list){
            System.out.println(i + ") " + x.getSender().getName() + " " + x.getAddressee().getName()
                    + " " + x.getRouteOfLetter().getRoute());
            i++;
        }
    }

    public boolean remove(int number){
        if(number > listOfLetters.size())
            return false;
        else {
            listOfLetters.remove(number);
            return true;
        }
    }
}
