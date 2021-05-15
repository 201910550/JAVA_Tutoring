/**
 * 201910550 정진아
 * 연습문제 12번
 */
public class Chap3_12 {
    public static void main(String[] args){
        H_ello H__ello = new H_ello();
        H__ello.setWhom("KIM");
        H__ello.setWhere("Incheon");
        H__ello.sayHello();
        H_ello H__ello1 = new H_ello();
        H__ello1.setWhom("Cho");
        H__ello1.setWhere("Seoul");
        H__ello1.sayHello();
        H_ello H__ello2 = new H_ello();
        H__ello2.setWhom("Lim");
        H__ello2.setWhere("Seongnam");
        H__ello2.sayHello();
    }
}
class H_ello{
    String toWhom;
    String toWhere;
    void setWhom(String whom){toWhom=whom;}
    void setWhere(String where){toWhere=where;}
    void sayHello(){
        System.out.println("hello " + toWhom + " in " + toWhere);
    }

}