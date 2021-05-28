//상속과 다형성 실습문제 6번
//Point 클래스
class tutoring_hm5_Point {
    private int x, y;
    tutoring_hm5_Point() {}
    public tutoring_hm5_Point(int x, int y) { this.x = x; this.y = y; }

    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y; }
}

//ColorPoint 클래스
public class tutoring_hm6_ColorPoint extends tutoring_hm5_Point{
    int x,y;
    String color;
    tutoring_hm6_ColorPoint(){
        x=0;
        y=0;
        color="BLACK";
    }
    tutoring_hm6_ColorPoint(int x, int y){
        super(x,y);
    }
    void setXY(int x, int y){
        move(x,y);
    }
    void setColor(String co){
        color = co;
    }
    public String toString(){
        return color +"색의 ("+getX()+","+getY()+") 의 점";
    }
}

//main 클래스
public class tutoring_hm6_main {
    public static void main(String[] args) {
        tutoring_hm6_ColorPoint zeroPoint = new tutoring_hm6_ColorPoint();
        System.out.println(zeroPoint.toString() + "입니다.");
        tutoring_hm6_ColorPoint cp = new tutoring_hm6_ColorPoint(10, 10);
        cp.setXY(5,5);
        cp.setColor("RED");
        System.out.println(cp.toString()+"입니다.");
    }
}
