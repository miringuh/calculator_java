import mylib.jbutton;
import mylib.jframe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    int width=260;
    int height=220;
    public static void main(String[] args) {
        Main mn=new Main();
        jframe frame=new jframe(0,0,mn.width,mn.height,"frame");
        JFrame frame1 = frame.getFrame("CALCULATOR");

        int bwidth=60;
        int bheight=30;

        JButton butt7 = new jbutton(10,80,bwidth,bheight,"7").getButton();
        JButton butt8 = new jbutton(70,80,bwidth,bheight,"8").getButton();
        JButton butt9 =new jbutton(130,80,bwidth,bheight,"9").getButton();
        JButton buttDEL = new jbutton(190,80,bwidth,bheight,"DEL").getButton();//20

        JButton butt4 = new jbutton(10,110,bwidth,bheight,"4").getButton();
        JButton butt5 = new jbutton(70,110,bwidth,bheight,"5").getButton();
        JButton butt6 = new jbutton(130,110,bwidth,bheight,"6").getButton();
        JButton buttDIV = new jbutton(190,110,bwidth,bheight,"DIV").getButton();//-11

        JButton butt1 = new jbutton(10,140,bwidth,bheight,"1").getButton();
        JButton butt2 = new jbutton(70,140,bwidth,bheight,"2").getButton();
        JButton butt3 = new jbutton(130,140,bwidth,bheight,"3").getButton();
        JButton buttMINUS = new jbutton(190,140,bwidth,bheight,"-").getButton();//-3

        JButton butt_dot = new jbutton(10,170,bwidth,bheight,".").getButton();//-2
        JButton butt0 = new jbutton(70,170,bwidth,bheight,"0").getButton();
        JButton buttEQUAL = new jbutton(130,170,bwidth,bheight,"=").getButton();//13
        JButton buttPLUS = new jbutton(190,170,bwidth,bheight,"+").getButton();//-5


        ArrayList<Component> comp=new ArrayList<>(16);
        comp.add(butt7);
        comp.add(butt8);
        comp.add(butt9);
        comp.add(buttDEL);
        comp.add(butt4);
        comp.add(butt5);
        comp.add(butt6);
        comp.add(buttDIV);
        comp.add(butt1);
        comp.add(butt2);
        comp.add(butt3);
        comp.add(buttMINUS);
        comp.add(butt_dot);
        comp.add(butt0);
        comp.add(buttEQUAL);
        comp.add(buttPLUS);

        jpanel panel=new jpanel(0,0,mn.width,mn.height,"panel");
        JPanel getpanel = panel.getpanel(comp);
        frame1.add(getpanel);

    }
}