package mylib;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class jpanel {
    JPanel jp;
    jbutton butt;
    jmenubar bar;
    pane pn;
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

    public  JPanel getpanelComp(Component comps) {
        jp = new JPanel();
        pn=new pane(0,31,this.width,40,"xxxx");
        comp=new ArrayList<>(20);
        bar=new jmenubar(0,0,this.width,30,"menubar");

        jp.setBounds(this.xn, this.yn, this.width, this.height);
        jp.setName(this.name);
        jp.setLayout(null);
        jp.setBackground(new Color(163, 190, 220, 213));
        jp.setPreferredSize(new Dimension(this.width,this.height));
        Border border=new LineBorder(new Color(13, 55, 216, 103),5,true);
        jp.setBorder(border);
        jp.setEnabled(true);
/*
        ArrayList<String>fd=new ArrayList<>(4);
        fd.add("File");
        fd.add("View");
        fd.add("Edit");
        fd.add("Help");

        ArrayList<String>file=new ArrayList<>(3);
        file.add("New");
        file.add("Recent");
        file.add("Exit");
        ArrayList<String>view=new ArrayList<>(2);
        view.add("Hex");
        view.add("Decimal");
        ArrayList<String>edit=new ArrayList<>(2);
        edit.add("Copy");
        edit.add("Paste");
        ArrayList<String>help=new ArrayList<>(2);
        help.add("Author");
        help.add("www.website.com");
        Component getjbar = bar.getjbar(fd, file, view, edit, help);
        jp.add(getjbar);
        */
        Component getjbar = bar.getjbar();
        jp.add(getjbar);

        comp.add("7");
        comp.add("8");
        comp.add("9");
        comp.add("CLR");//67
        comp.add("4");
        comp.add("5");
        comp.add("6");
        comp.add("%");//37
        comp.add("1");
        comp.add("2");
        comp.add("3");
        comp.add("-");//45
        comp.add(".");//46
        comp.add("0");
        comp.add("=");//61
        comp.add("+");//43
        comp.add("(");//40
        comp.add(")");//41
        comp.add("^");//94
        comp.add("*");//42
        int x=10;
        int y=140;
        int space=40;
        for (int i = 0; i < 20; i++) {
            butt=new jbutton(x,y,80,40,comp.get(i));
            jp.add(butt.getButton(comps.getName()));
            if (i==3 || i==7 || i==11 || i==15 || i==19){
                x=10;
                y+=space;
            }else {x+=80;}
        }

//        butt.
        jp.add(comps);
        jp.setVisible(true);
        return jp;
    }

}
