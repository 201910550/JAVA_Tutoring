import java.util.Scanner;
public class baekjoon_9655 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n이 홀수인경우 무조건 상근이가 이김 / n이 짝수인경우 창영이가 무조건 이김
        game(n);
    }
    static void game(int n){
        if(n%2==0)
            System.out.println("CY");

        else
            System.out.println("SK");
    }
}