import mylib.jbutton;
import mylib.jframe;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main {
    int width=400;
    int height=400;
    public static void main(String[] args) {
        Main mn=new Main();
        jframe frame=new jframe(0,0,mn.width,mn.height,"frame");
        JFrame frame1 = frame.getFrame("CALCULATOR");

        int bwidth=80;
        int bheight=40;
        int down=40;
        JButton butt7 = new jbutton(10,down,bwidth,bheight,"7").getButton();
        JButton butt8 = new jbutton(90,down,bwidth,bheight,"8").getButton();
        JButton butt9 =new jbutton(170,down,bwidth,bheight,"9").getButton();
        JButton buttDEL = new jbutton(250,down,bwidth,bheight,"DEL").getButton();//20
        down+=bheight;
        JButton butt4 = new jbutton(10,down,bwidth,bheight,"4").getButton();
        JButton butt5 = new jbutton(90,down,bwidth,bheight,"5").getButton();
        JButton butt6 = new jbutton(170,down,bwidth,bheight,"6").getButton();
        JButton buttDIV = new jbutton(250,down,bwidth,bheight,"%").getButton();//-11
        down+=bheight;
        JButton butt1 = new jbutton(10,down,bwidth,bheight,"1").getButton();
        JButton butt2 = new jbutton(90,down,bwidth,bheight,"2").getButton();
        JButton butt3 = new jbutton(170,down,bwidth,bheight,"3").getButton();
        JButton buttMINUS = new jbutton(250,down,bwidth,bheight,"-").getButton();//-3
        down+=bheight;
        JButton butt_dot = new jbutton(10,down,bwidth,bheight,".").getButton();//-2
        JButton butt0 = new jbutton(90,down,bwidth,bheight,"0").getButton();
        JButton buttEQUAL = new jbutton(170,down,bwidth,bheight,"=").getButton();//13
        JButton buttPLUS = new jbutton(250,down,bwidth,bheight,"+").getButton();//-5



        jpanel panel=new jpanel(0,0,340,350,"panel");
        JPanel getpanel = panel.getpanelComp();
        frame1.add(getpanel);

    }
}