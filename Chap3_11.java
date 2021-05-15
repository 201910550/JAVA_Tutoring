/**
 * 201910550 정진아
 * 연습문제 11번
 */
public class Chap3_11 {
    public static void main(String[] args){
    chap3_11_2 myshow = new chap3_11_2();
    myshow.show();
    }
}

class chap3_11_2{
    String [] cards = {"10", "J", "Q", "K", "A"};
    void show(){
        String show_num = cards[(int)Math.floor(Math.random()*5)];
        System.out.println("출력 카드: 하트 "+show_num);
    }

}