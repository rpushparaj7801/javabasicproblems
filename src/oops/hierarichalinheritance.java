package oops;

class shape{
    float length,breadth,radius;
}
class rect extends shape {
    public rect(float l, float b) {
        length = l;
        breadth = b;

    }



    float rect_area() {
        return length * breadth;
    }
}
    class circle extends shape {
        public circle(float r) {
            radius = r;
        }

        float circle_area() {
            return 3.14f * (radius * radius);
        }
    }
        class square extends shape{
            public square(float l){
                length=l;

            }

        float square_area(){
            return (length*length);
        }
    }



public class hierarichalinheritance {
    public static void main(String[] args) {

        rect o1= new rect(2,3);
        System.out.println(o1.rect_area());
        circle o2 = new circle(3);
        System.out.println(o2.circle_area());
        square o3 =new square(3);
        System.out.println(o3.square_area());







    }
}
