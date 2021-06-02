import java.util.ArrayList;

class Point2{
    int x,y;
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x +", " + y +")";
    }
}

public class tutoring_ArrayListTest {
    public static void main(String[] args){
        ArrayList<Point2>  list = new ArrayList<>();
        list.add(new Point2(0,0));
        list.add(new Point2(4,0));
        list.add(new Point2(3,5));

        System.out.println(list); //그냥 출력하면 [] 포함 => .get을 이용하여 출력
    }
}
