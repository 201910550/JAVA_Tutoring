//상속과 다형성 실습 문제 3번
//Converter 클래스
import java.util.Scanner;
abstract class tutoring_hm3_Converter {
    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();
    protected double ratio;
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
        System.out.print(getSrcString()+"을 입력하세요>> ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: "+res+getDestString()+"입니다");
        scanner.close();
    }
}

//Won2Dollar 클래스
public class tutoring_hm3_Won2Dollar extends tutoring_hm3_Converter{
    int dollar;
    tutoring_hm3_Won2Dollar(int dollar){
        this.dollar = dollar;
    }

    @Override
    protected double convert(double src) {
        return src/1200;
    }
    @Override
    protected String getSrcString() {
        return "원";
    }
    @Override
    protected String getDestString() {
        return "달러";
    }
}

//main 클래스
public class tutoring_hm3_main {
    public static void main(String args[]) {
        tutoring_hm3_Won2Dollar toDollar = new tutoring_hm3_Won2Dollar(1200);
        toDollar.run();
    }
}
