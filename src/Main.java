import java.awt.*;
import java.util.ArrayList;

import mylib.*;
public class Main {
    int width=350;
    int height=360;
    public static void main(String[] args) {
        Main mn=new Main();
        jframe frame=new jframe(0,0,mn.width,mn.height,"frame");
        ArrayList<Component>comps=new ArrayList<>(20);
        pane pn=new pane(0,0,340,350,"panel");
        pn.getComp(frame);
        Component pn1 = pn.gettextpane();
        comps.add(pn1);


        frame.getFrame(comps,"CALCULATOR");
    }
}
