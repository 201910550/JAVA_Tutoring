//상속과 다형성 실습 문제 1번
//TV 클래스
class tutoring_hm1_TV {
    private int size;
    public tutoring_hm1_TV(int size){this.size = size;}
    protected int getSize() {return size;}
}

//ColorTV 클래스
public class tutoring_hm1_ColorTV extends tutoring_hm1_TV{
    protected int color;
    public tutoring_hm1_ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    public void printProperty(){
        System.out.println(getSize()+"인치 "+color+"컬러");
    }
}
