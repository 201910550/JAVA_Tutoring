import java.util.ArrayList;

public class tutoring_ArrayListTest3 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple"); //index : 0
        list.add("Pear"); //index : 1
        list.add("Mango"); //index : 2
        list.add("Banana"); //index : 3
        list.add("Grape"); //index : 4



        int index = list.indexOf("Mango");
        System.out.println("Mango의 위치: "+index);
    }
}
