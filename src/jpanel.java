import mylib.jbutton;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class jpanel {
    JPanel jp;
    jbutton butt;
    int xn;
    int yn;
    int width;
    int height;
    String name;
    ArrayList<String> comp;
    public jpanel(int x,int y,int width,int height,String name){
        this.xn=x;
        this.yn=y;
        this.width=width;
        this.height=height;
        this.name=name;
    }
    public  JPanel getpanelComp() {
        jp = new JPanel();
        comp=new ArrayList<>(20);
        jp.setBounds(this.xn, this.yn, this.width, this.height);
        jp.setName(this.name);
        jp.setLayout(null);
        jp.setPreferredSize(new Dimension(this.width,this.height));
        Border border=new LineBorder(new Color(13, 55, 216, 103),5,true);
        jp.setBorder(border);
        jp.setEnabled(true);

        comp.add("7");
        comp.add("8");
        comp.add("9");
        comp.add("DEL");
        comp.add("4");
        comp.add("5");
        comp.add("6");
        comp.add("%");
        comp.add("1");
        comp.add("2");
        comp.add("3");
        comp.add("-");
        comp.add(".");
        comp.add("0");
        comp.add("=");
        comp.add("+");
        comp.add("(");
        comp.add(")");
        comp.add("00");
        comp.add("x");
        int x=10;
        int y=140;
        int space=40;
        for (int i = 0; i < 20; i++) {
            butt=new jbutton(x,y,80,40,comp.get(i));
            jp.add(butt.getButton());
            if (i==3 || i==7 || i==11 || i==15 || i==19){
                x=10;
                y+=space;
            }else {x+=80;}
        }

        jp.setVisible(true);
        return jp;
    }
    public  JPanel getpanel(Component comp) {
        jp = new JPanel();
        jp.setBounds(this.xn, this.yn, this.width, this.height);
        jp.setName(this.name);
        jp.setLayout(null);
        jp.setPreferredSize(new Dimension(this.width,this.height));
        Border border=new LineBorder(new Color(13, 55, 216, 103),5,true);
        jp.setBorder(border);
        jp.setEnabled(true);
        jp.add(comp);
        jp.setVisible(true);
        return jp;
    }

}
