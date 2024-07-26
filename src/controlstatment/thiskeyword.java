package controlstatment;

class abcd{
    int num1;
    int num2;
    void getData(int num1 ,int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }

    void display(){
        System.out.println(num1+num2);
    }
}

public class thiskeyword {
    public static void main(String[] args) {

        abcd obj =new abcd();
        obj.getData(2,3);
        obj.display();

    }
}
