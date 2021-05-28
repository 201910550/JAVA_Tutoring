//상속과 다형성 실습문제 4번
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

//Km2Mile 클래스
public class tutoring_hm4_Km2Mile extends tutoring_hm3_Converter {
    double km;
    tutoring_hm4_Km2Mile(double km){
        this.km = km;
    }
    @Override
    protected double convert(double src) {
        return src/km;
    }
    @Override
    protected String getSrcString() {
        return "Km";
    }
    @Override
    protected String getDestString() {
        return "mile";
    }
}

//main 클래스
public class tutoring_hm4_main {
    public static void main(String args[]) {
        tutoring_hm4_Km2Mile toMile = new tutoring_hm4_Km2Mile(1.6);
        toMile.run();
    }
}
