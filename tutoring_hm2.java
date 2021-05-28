//상속과 다형성 실습문제 2번
//IPTV 클래스
public class tutoring_hm2_IPTV extends tutoring_hm1_ColorTV{
    protected String ip;
    public tutoring_hm2_IPTV(String ip, int size, int color){
        super(size, color);
        this.ip = ip;
    }
    @Override
    public void printProperty() {
        System.out.println("나의 IPTV는 "+ip+" 주소의 "+getSize()+" 인치 "+color+" 컬러");
    }
}

//min 클래스
public class tutoring_hm2_main {
    public static void main(String[] args) {
        tutoring_hm2_IPTV iptv = new tutoring_hm2_IPTV("192.1.1.2", 32, 2048);
        iptv.printProperty();
    }
}
