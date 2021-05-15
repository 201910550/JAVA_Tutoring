/**
 * 201910550 정진아
 * 연습문제 9번
 */
public class Chap3_9 {
    public static void main(String[] args){
        int a=(int)Math.floor(Math.random()*6)+1;
        int b=(int)Math.floor(Math.random()*6)+1;
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        if(a>b)
            System.out.println("A wins");
        else if(a==b)
            System.out.println("No winner");
        else
            System.out.println("B wins");
    }
}
