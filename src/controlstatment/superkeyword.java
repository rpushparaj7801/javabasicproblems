package controlstatment;

class parent{
    int a =10;
    public void display(){
        System.out.println("controlstatment.parent");
        System.out.println(a);
    }
    public parent(){
        System.out.println("im a controlstatment.parent class oops.constructor");
    }
}

class child extends parent{
    int a = 30;
    public void display(){
        System.out.println("controlstatment.child");
        super.display();
        System.out.println(a);
        System.out.println(super.a);

    }
    public child(){
        System.out.println("im a controlstatment.child class oops.constructor");

    }
}

public class superkeyword {
    public static void main(String[] args) {
        child obj =new child();

        obj.display();



    }
}