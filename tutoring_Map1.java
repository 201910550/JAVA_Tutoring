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
