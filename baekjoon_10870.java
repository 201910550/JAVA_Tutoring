import java.util.Scanner;
public class baekjoon_10870 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("0~20 사이에 숫자 N을 입력하세요");
        int n = sc.nextInt();
        int a [] = new int[n+1];
        a[0]=0;
        if(n==0) {
            System.out.println(a[0]);
        }
        else{
            a[1]=1;
            for(int i=2; i<a.length; i++){
                a[i] = a[i-2]+a[i-1];
            }
            System.out.println(a[n]);
        }
    }
}
