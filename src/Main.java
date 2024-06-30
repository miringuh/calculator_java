import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import mylib.*;


public class Main {
    int width=350;
    int height=360;
    public static void main(String[] args) {
        Main mn=new Main();
        jframe frame=new jframe(0,0,mn.width,mn.height,"frame");

        ArrayList<Component>comps=new ArrayList<>(20);

        jmenubar bar = new jmenubar(10, 10, 320, 30, "menubar");
        Component getjbar = bar.getjbar();
        comps.add(getjbar);

//        pane pn = new pane(10, 50, 315, 35, "apane");
//        Component gettextpane = pn.gettextpane("pane");
//        comps.add(gettextpane);

        jpanel panel=new jpanel(0,0,340,350,"panel");
       JPanel getpanel = panel.getpanelComp(getjbar);
       comps.add(getpanel);



        frame.getFrame(comps,"CALCULATOR");

    }
}
