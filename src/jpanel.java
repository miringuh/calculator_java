import mylib.jbutton;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

public class jpanel {
    JPanel jp;
    int xn;
    int yn;
    int width;
    int height;
    int row=10;
    int col=50;
    int sizev=60;
    int sizeh=40;
    String name;
    public jpanel(int x,int y,int width,int height,String name){
        this.xn=x;
        this.yn=y;
        this.width=width;
        this.height=height;
        this.name=name;
    }
    public  JPanel getpanel(ArrayList<Component>comp) {
        jp = new JPanel();
        jp.setBounds(this.xn, this.yn, this.width, this.height);
        jp.setName(this.name);
        jp.setLayout(null);
        jp.setPreferredSize(new Dimension(this.width,this.height));
    ArrayList<String>calc=new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            jbutton butt=new jbutton(row,col,60,40,comp.get(i).getName());
            JButton button = butt.getButton(comp.get(i).getName());
            row+=sizev;
            jp.add(button);
        }
        row=10;
        col+=sizeh;
        for (int i = 4; i < 8; i++) {
            jbutton butt1=new jbutton(row,col,60,40,comp.get(i).getName());
            JButton button1 = butt1.getButton(comp.get(i).getName());
            row+=sizev;
            jp.add(button1);
        }
        row=10;
        col+=sizeh;
        for (int i = 8; i < 12; i++) {
            jbutton butt2=new jbutton(row,col,60,40,comp.get(i).getName());
            JButton button2 = butt2.getButton(comp.get(i).getName());
            row+=sizev;
            jp.add(button2);
        }
        row=10;
        col+=sizeh;
        for (int i = 12; i < 16; i++) {
            jbutton butt3=new jbutton(row,col,60,40,comp.get(i).getName());
            JButton button3 = butt3.getButton(comp.get(i).getName());
            row+=sizev;
            jp.add(button3);
        }

        Border border=new LineBorder(new Color(13, 55, 216, 103),5,true);
        jp.setBorder(border);
        jp.setEnabled(true);

        jp.setVisible(true);
        return jp;
    }
}
