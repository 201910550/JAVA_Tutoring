class Student_t{
}
class Leader extends Student_t{
    void eat(){
        System.out.println("밥먹기");
    }
    void say(){
        System.out.println("선생님께 인사");
    }
}

public class tutoring_9 {
    public static void main(String[] args){
        Leader leader1 = new Leader();
        leader1.eat();
        leader1.say();
    }
}
