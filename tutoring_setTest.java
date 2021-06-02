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
