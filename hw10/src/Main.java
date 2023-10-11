
import phonebook.Phonebook;
import phonebook.Record;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ListLogic listLogic = new ListLogic();
        List<String> strings = Arrays.asList("if", "you", "want to", "like it", "burn", "like sun", "shine",
                "do not compare", "you are insulting", "if you win", "burn", "yourself", "you need not", "to explain",
                "if", "you", "want to", "like it", "burn");
        listLogic.findOccurance(strings, "burn");
        listLogic.findOccurance(strings, "yourself");
        listLogic.findOccurance(strings, "818");
        String[] array = {"if", "you", "want to", "like it", "burn", "like sun", "shine",
                "do not compare", "you are insulting", "if you win", "burn", "yourself", "you need not", "to explain",
                "if", "you", "want to", "like it", "burn"};
        List listMadeFromAnArray = listLogic.toList(array);
        System.out.println(listMadeFromAnArray.toString());
        List<Double> numberList = Arrays.asList(10.0, 4567.0, 345678.0, 10.0, 324.0, 123.0, 123.0,
                0.1, 321.2, 0.0, 321.0, 31211.0);
        List<Double> uniqueNumberList = listLogic.findUnique(numberList);
        System.out.println(uniqueNumberList.toString());
        listLogic.calcOccurance(strings);
        System.out.println(listLogic.findOccurance(strings));
        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.add(new Record("redtfcvygtv", 23456789));
        phonebook.add(new Record("redtfcvygtv", 876543234));
        phonebook.add(new Record("yujnhrtgr", 1324534524));
        phonebook.add(new Record("jyhrtgefw", 324523));
        phonebook.add(new Record("gsdfgfds", 325342345));
        phonebook.add(new Record("gsdfgsdfgsdfgdsf", 523634532));
        phonebook.add(new Record("redtfcvygtv", 1234567890));
        System.out.println(phonebook.find("gsdfgsdfgsdfgdsf"));
        System.out.println(phonebook.find("redtfcvygtv"));
        System.out.println(phonebook.findAll("redtfcvygtv"));
    }

}
