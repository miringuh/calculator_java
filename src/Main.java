import mylib.jframe;
import mylib.jpanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Main {
    int width=350;
    int height=360;
    public static void main(String[] args) {
        Main mn=new Main();
        jframe frame=new jframe(0,0,mn.width,mn.height,"frame");
        ArrayList<Component>comps=new ArrayList<>(20);

       jpanel panel=new jpanel(0,0,340,350,"panel");
       JPanel getpanel = panel.getpanelComp();
       comps.add(getpanel);

//        jlabel lab=new jlabel(0,0,70,"help");
//        Component welcome = lab.getlabel("welcome");
//        comps.add(welcome);

//        pane pn=new pane()

        frame.getFrame(comps,"CALCULATOR");

    }
}