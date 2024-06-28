import mylib.jframe;
import mylib.jpanel;
import mylib.pane;

import javax.swing.*;
import javax.swing.text.Style;
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

        pane pn=new pane(10,40,320,35,"panel");
        Component gettextpane = pn.gettextpane(" ");

        JPanel getpanel = panel.getpanelComp(gettextpane);
        comps.add(getpanel);


        frame.getFrame(comps,"CALCULATOR");

    }
}