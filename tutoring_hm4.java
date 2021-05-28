//상속과 다형성 실습문제 4번
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
