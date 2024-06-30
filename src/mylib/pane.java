package mylib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


public class pane {
    JPanel pane;
    int xn;
    int yn;
    int width;
    int height;
    String name;

//int val=Integer.valueOf(myString).intValue();
    public pane(int x,int y,int width,int h,String nm) {
        this.xn=x;
        this.yn=y;
        this.height=h;
        this.width=width;
        this.name=nm;
    }

    public Component gettextpane(String num){
        pane=new JPanel();
        pane.setBounds(this.xn,this.yn,this.width,this.height);
        pane.setName(this.name);
        pane.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pane.setLayout(null);
        pane.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));

        pane.setVisible(true);
        return pane;
    }
}



/*
//        comp=new ArrayList<>(20);
//        comp.add("7");
//        comp.add("8");
//        comp.add("9");
//        comp.add("CLR");//67
//        comp.add("4");
//        comp.add("5");
//        comp.add("6");
//        comp.add("%");//37
//        comp.add("1");
//        comp.add("2");
//        comp.add("3");
//        comp.add("-");//45
//        comp.add(".");//46
//        comp.add("0");
//        comp.add("=");//61
//        comp.add("+");//43
//        comp.add("(");//40
//        comp.add(")");//41
//        comp.add("^");//94
//        comp.add("*");//42
//        int x=10;
//        int y=140;
//        int space=40;
//
//        for (int i = 0; i < 20; i++) {
//            butt=new jbutton(x,y,80,40,comp.get(i));
//            jp.add(butt.getButton(jp, comp.get(i)));
//            if (i==3 || i==7 || i==11 || i==15 || i==19){
//                x=10;
//                y+=space;
//            }else {x+=80;}
//        }

 */

/*
 pane pn = new pane(10, 40, 320, 35, " ");
        Component gettextpane = pn.gettextpane("welcome");
*/
