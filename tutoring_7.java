//상속과 부모클래스배열, instanceof
class shape{
    int x,y;
    shape(){
        System.out.println("부모클래스 생성자입니다.");
    }
    void draw(){
        System.out.println("Shape Draw");
    }
}
class Rectangle extends shape{
    private int width,height;
    void draw(){
        System.out.println("Shape Draw");
    }
}
class Triangle extends shape{
    private int base,height;
    void draw(){
        System.out.println("Triangle Draw");
    }
}
class Circle1 extends shape{
    int radius;
    public Circle1(int radius){
        this.radius = radius;
        x=0;
        y=0;
        System.out.println("자식클래스 생성자입니다.");
    }
    double calcArea(){
        return 3.14*radius*radius;
    }
}

public class tutoring_7 {
    public static void main(String[] args){
        shape [] s = new shape[3];
        s[0]=new Rectangle();
        s[1]=new Circle1(10);
        s[2]=new Triangle();

        if(s[0] instanceof Rectangle){ //instanceof 는 실제 객체가 무엇인지 TF반환
            System.out.println("아! 실제 객체는 Rectangle");
        }
        if(!(s[1] instanceof Triangle)){
            System.out.println("아! s[1]의 실제 객체는 Triangle이 아니군요");
        }

//        Circle1 obj = new Circle1(10);
//        System.out.println("원의중심: ("+obj.x+","+obj.y+")");
//        System.out.println("원의 면적: "+obj.calcArea());
    }
}
