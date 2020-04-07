import java.util.ArrayList;

public class main {
    public static void main (String [] args) {
    ArrayList <Integer> list1 = new ArrayList <Integer>();
    ArrayList <Integer> list2 = new ArrayList<Integer>();
    ArrayList<Integer> list3 = new ArrayList<Integer>();

    list1.add(100);
    list1.add(500);
    list1.add(900);

    list2.add(800);
        list2.add(600);
        list2.add(300);

        list2.add(400);
        list2.add(700);
        list2.add(200);


    ArrayOrganizer a = new ArrayOrganizer();
    a.concatAndSort(list1, list2,list3);

    System.out.println( a.concatAndSort(list1, list2,list3));


    }
}