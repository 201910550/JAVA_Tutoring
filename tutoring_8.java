//상속, 인터페이스, implements
class shape1{
    protected int x,y;
}
interface Drawble{
    void draw();
}
class Circle2 extends shape1 implements Drawble{ //상속+인터페이스 구현
    int radius;
    @Override
    public void draw(){
        System.out.println("Circle Draw");
    }
}

public class tutoring_8 {
    public static void main(String[] args){
        Drawble obj = new Circle2();
        obj.draw();
    }
}
