package awt;

import java.awt.*;

public class demoawt {
    public static void main(String[] args) {
        Frame frm = new Frame("pushparaj");
        frm.setSize(1000,500);

        Button btn = new Button("click me");
        btn.setBounds(75,75,20,50);
        frm.add(btn);
        frm.setVisible(true);
    }
}
