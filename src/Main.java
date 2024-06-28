import mylib.jframe;
import mylib.jpanel;

import javax.swing.*;


public class Main {
    int width=350;
    int height=360;
    public static void main(String[] args) {
        Main mn=new Main();
        jframe frame=new jframe(0,0,mn.width,mn.height,"frame");
        JFrame frame1 = frame.getFrame("CALCULATOR");

        jpanel panel=new jpanel(0,0,340,350,"panel");
        JPanel getpanel = panel.getpanelComp();
        frame1.add(getpanel);

    }
}