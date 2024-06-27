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

        jbutton butt =new jbutton(0,0,50,30,"number");
        JButton butt7 = butt.getButton("7");
        JButton butt8 = butt.getButton("8");
        JButton butt9 = butt.getButton("9");
        JButton buttDEL = butt.getButton("DEL");//20
        JButton butt4 = butt.getButton("4");
        JButton butt5 = butt.getButton("5");
        JButton butt6 = butt.getButton("6");
        JButton buttDIV = butt.getButton("%");//-11
        JButton butt1 = butt.getButton("1");
        JButton butt2 = butt.getButton("2");
        JButton butt3 = butt.getButton("3");
        JButton buttMINUS = butt.getButton("-");//-3
        JButton butt_dot = butt.getButton(".");//-2
        JButton butt0 = butt.getButton("0");
        JButton buttEQUAL = butt.getButton("=");//13
        JButton buttPLUS = butt.getButton("+");//-5


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