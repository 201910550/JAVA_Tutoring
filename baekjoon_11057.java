import java.util.Scanner;
public class baekjoon_11057 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1~1,000사이의 숫자 N을 입력하세요");
        int n = sc.nextInt();
        int uphill[][] = new int[n+1][10];
        for(int i=0; i<10; i++){
            uphill[1][i]=1;
        }
        for(int i=2; i<=n; i++){
            for(int j=0; j<10; j++){
                for(int k=0; k<=j; k++){
                    uphill[i][j] += uphill[i-1][k];
                }
            }
        } //uphill[3][1] += uphill[2][0]은 oo1은 o0과 o1을 넣은 것
        int sum=0;
        for(int i=0; i<10; i++){
            sum += uphill[n][i];
        }
        System.out.println(sum%10007); //-값이 나오는 경우?? ex.47
    }
}
/**
 * import java.util.*;
 *
 * public class B11057 {
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int n = sc.nextInt(); //입력N
 *         int mod = 10007;
 *         int[][] A = new int[n][10];
 *         for (int i=0;i<10;i++)
 *             A[0][i] = 1; // 0
 *         for (int i=1;i<n;i++) { //행
 *             for (int j=0;j<10;j++) {
 *                 for (int l=0;l<=j;l++) {
 *                     A[i][j] += A[i-1][j-l];
 *                     A[i][j] %= mod;
 *                 }
 *             }
 *         }
 *         int temp = A[n-1][0];
 *         for (int i=1;i<10;i++) {
 *             temp += A[n-1][i];
 *             temp %= mod;
 *         }
 *         System.out.println(temp);
 *     }
 * }
 */