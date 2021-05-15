/**
 * 201910550 정진아
 * 연습문제 10번
 */
import java.util.Scanner;
public class Chap3_10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.println("원본 문장 : Let's meet in my office at 10");
        System.out.println("문장에서 바꾸고 싶은 문자열을 입력하세요:");
        String s1 = "Let's meet in my office at 10";
        String change = sc.nextLine();
        System.out.println("새로운 문자열을 입력하세요:");
        String change_new = sc.nextLine();
        System.out.println("새로운 문장: ");
        int location = s1.indexOf(change);
        int length = change.length();
        System.out.println(s1.substring(0,location)+change_new+s1.substring(location+length,29));
    }
}
