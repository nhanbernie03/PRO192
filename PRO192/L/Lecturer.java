package L;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends Person {


    public static List<String> listSubject = new ArrayList<>();
//    List là một thuộc tính của class Lecturer
    public static void enterSubject(String Subject){
        listSubject.add(Subject);
    }

    public static void showSubject(){
        for (String Show : listSubject){
            System.out.println(Show);
        }
    }

}


