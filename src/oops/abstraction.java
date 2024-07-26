package oops;


abstract class mobile{
    void voicecall(){
        System.out.println("you can make call");
    }
    abstract void camera();
    abstract void touchDisplay();

}

class samsung extends mobile{

    @Override
    void camera() {
        System.out.println("32 mp camera");
    }

    @Override
    void touchDisplay() {
        System.out.println("32 inch display");

    }
}

class nokia extends mobile{

    @Override
    void camera() {
        System.out.println("64 mp ");
    }

    @Override
    void touchDisplay() {
        System.out.println("34 inch display");
    }

        void fingerprint() {
            System.out.println("onscreen fingerprint");
        }
}

    public class abstraction {
        public static void main(String[] args) {

            samsung s= new samsung();
            nokia n= new nokia();
            n.voicecall();
            n.camera();
            n.touchDisplay();
            n.fingerprint();
            s.voicecall();
            s.camera();
            s.touchDisplay();


            System.out.println("-----------------------");

            mobile mob = new nokia();
            mob.camera();
        }
}
