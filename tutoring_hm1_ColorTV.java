public class tutoring_hm1_ColorTV extends tutoring_hm1_TV{
    protected int color;
    public tutoring_hm1_ColorTV(int size, int color){
        super(size);
        this.color = color;
    }
    public void printProperty(){
        System.out.println(getSize()+"인치 "+color+"컬러");
    }
}
