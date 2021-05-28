//상속과 다형성 실습문제 5번
//Point 클래스
class tutoring_hm5_Point {
    private int x, y;
    public tutoring_hm5_Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y; }
}

//ColorPoint 클래스
public class tutoring_hm5_ColorPoint extends tutoring_hm5_Point{
    String color;
    tutoring_hm5_ColorPoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }
    void setXY(int z, int k){
        move(z,k);
    }
    void setColor(String co){
        color = co;
    }
    public String toString(){
        return color +"색의 ("+getX()+","+getY()+") 의 점";
    }

}

//main 클래스
public class tutoring_hm5_main {
    public static void main(String[] args) {
        tutoring_hm5_ColorPoint cp = new tutoring_hm5_ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다. ");
    }
}
