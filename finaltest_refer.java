//기말고사 참고

import java.util.ArrayList;

class Point2{
    int x,y;
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x +", " + y +")";
    }
}

public class tutoring_ArrayListTest {
    public static void main(String[] args){
        ArrayList<Point2>  list = new ArrayList<>();
        list.add(new Point2(0,0));
        list.add(new Point2(4,0));
        list.add(new Point2(3,5));

        System.out.println(list); //그냥 출력하면 [] 포함 => .get을 이용하여 출력
    }
}

------------------------------------------------------------------------------------------
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


------------------------------------------------------------------------------------------
import java.util.HashSet;

public class tutoring_setTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        //set.add("Cheese"); //ArrayList와 Hashmap은 중복 값을 둘다 처리, HashSet은 중복 값을 하나로 처리

        System.out.println(set);
        if(set.contains("Cheese")){
            System.out.println("치즈 있음");
        }
    }
}


------------------------------------------------------------------------------------------
import java.util.*;

public class tutoring_Map1 {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        Scanner sc = new Scanner(System.in);

        hm.put("Apple", "사과");
        hm.put("Paper", "종이");
        hm.put("Flower", "꽃");
        String voca;

        System.out.println("알고 싶은 단어를 입력하세요");
        voca = sc.nextLine();

        if(hm.containsKey(voca)){
            System.out.println("해당하는 뜻은 : "+hm.get(voca));
        }
        else
            System.out.println("해단 단어에 대한 뜻은 존재하지 않습니다");
    }
}


------------------------------------------------------------------------------------------
import java.util.HashMap;
import java.util.Map;

public class tutoring_MapTest {
    public static void main(String[] args) {
        Map<String, String> list = new HashMap<String, String>();
        list.put("100", "홍길동");
        list.put("200", "김성은");
        list.put("300", "김성운");

        System.out.println(list);
        list.remove("200");
        list.put("100", "김유신");
        System.out.println(list.get("300"));

        for(String key : list.keySet()){ //foreach문
            String value=list.get(key);
            System.out.println("key= "+key+", value= "+value);
        }
    }
}
