package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> al = new ArrayList<String>(); //creating array list
        al.add("Ravi"); // adding object in array list
        al.add("Vijay");
        al.add("Budi");
        al.add("Ajay");


        List<String> al2 = new LinkedList<String>();// creating linkedlist
        al2.add("james");
        al2.add("serena");
        al2.add("Swati");
        al2.add("janid");
        al2.add("moonton");

        String a = al.get(0);
        Iterator<String> b = al2.iterator();


        System.out.println("arraylist :" + a);
        System.out.println("linked list :" + b.next());
        System.out.println("linkedlist :" + b.next());

        
    }
}