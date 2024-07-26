package controlstatment;

class Rectangle1
{
    private int length,width;
    int getLength(){
        return length;
    }
    int getWidth(){
        return width;
    }

    void setLength(int l){
        length = l;
    }
    void setWidth(int w){
        width=w;

    }
    int area(){
        int a = length*width;
        return a;
    }
}

public class getset {
    public static void main(String[] args) {


        Rectangle1 o1= new Rectangle1();
        o1.setLength(5);
        o1.setWidth(6);
        System.out.println(o1.area());

    }
}
