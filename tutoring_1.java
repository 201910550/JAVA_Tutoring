public class tutoring_1 {
    public static void main(String[] args){
        circle cc = new circle();
        System.out.println("원의 면적 : " + cc.area);
    }
}
class circle{
    double r = 100;
    double area = r*r*3.14;
}
