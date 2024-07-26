package oops;

class RectangleShape{
    int length;
    int width;
    RectangleShape(){
        length=3;
        width=5;
    }
    int area(){
        int a = length*width;
        return a;
    }

}


public class constructor {
    public static void main(String[] args) {


        RectangleShape o = new RectangleShape();
        System.out.println(o.area());

    }
}
