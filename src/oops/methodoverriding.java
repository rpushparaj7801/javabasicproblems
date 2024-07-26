package oops;

class Bank{
    int getRateOfInterest(){return 0;}
}
//Creating child classes.
class SBI extends Bank{
    int getRateOfInterest(){return 8;}
}

class ICICI extends Bank{
    int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
    int getRateOfInterest(){return 9;}
}
//Test class to create objects and call the methods
class methodoverriding{
    public static void main(String args[]){
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS();
        System.out.println("oops.SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("oops.ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("oops.AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}