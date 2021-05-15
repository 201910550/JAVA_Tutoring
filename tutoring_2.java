public class tutoring_2 {
    public static void main(String[] args){
        Pizza obj1=new Pizza();
        System.out.println("(" + obj1.type+" , " +obj1.size+")");

        Pizza obj2=new Pizza(24, "포테이토");
        System.out.println("(" + obj2.type+" , " +obj2.size + ")");
    }
}
class Pizza{
    String type;
    int size;
    Pizza(){
        type = "고구마";
        size = 30;
    }
    Pizza(int size, String type){
        this.size = size;
        this.type = type;
    }
}