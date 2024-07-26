package dummy;

class raj{

    raj display(){
        System.out.println("this is pushparaj");
        return this;
    }

}

class vinoth extends raj{


   vinoth display(){
        System.out.println("this is vinoth");
        return this;
    }
}
public class covariant {
    public static void main(String[] args) {

        vinoth obj = new vinoth();
        obj.display();
        raj obj1 = new raj();
        obj1.display();


    }
}
