//상속과 Override
class Animal{
    void eat(){
        System.out.println("먹고있다...");
    }
    void print(){
        System.out.println("부모클래스");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("짖고있다...!");
    }
    @Override
    void eat(){
        System.out.println("강아지가 먹고 있다...!");
    }
    void print(){
        super.print();
        System.out.println("자식클래스");
    }
}

public class tutoring_6 {
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();
        d.eat();
        d.print();
    }
}
