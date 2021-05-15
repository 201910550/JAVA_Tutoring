/**
 * 201910550 정진아
 * 연습문제 13번
 */
public class Chap3_13 {
    public static void main(String[] args){
        String a = "Sangmyung University";
        int b = a.length();
        String s = a.substring(b-1,b)+a.substring(b-2,b-1)+a.substring(b-3,b-2)+a.substring(b-4,b-3)+a.substring(b-5,b-4)+a.substring(b-6,b-5)+a.substring(b-7,b-6)+a.substring(b-8,b-7)+a.substring(b-9,b-8);
        System.out.println(s);

        String k[]=new String[b];
        for(int i=b; i<0; i--){
            k[20-b]=a.substring(b-1,i);
        }
        System.out.print(k[0]);
    }
}

/**public class place{
    static String mirror(String s){
        String strM="";
        for(int i=s.length(); i>0; i--){
            strM += s.charAt(i-1);
        }
        return strM;
    }
    public static void main(String[] args){
        String str="Sangmyung University";
        System.out.println(mirror(str));
    }
}*/