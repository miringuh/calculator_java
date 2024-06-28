package mylib;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class jpanel {
    JPanel jp;
    jbutton butt;
    jmenubar bar;
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
        bar=new jmenubar(0,0,this.width,30,"menubar");

        jp.setBounds(this.xn, this.yn, this.width, this.height);
        jp.setName(this.name);
        jp.setLayout(null);
        jp.setPreferredSize(new Dimension(this.width,this.height));
        Border border=new LineBorder(new Color(13, 55, 216, 103),5,true);
        jp.setBorder(border);
        jp.setEnabled(true);
//
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

        comp.add("7");
        comp.add("8");
        comp.add("9");
        comp.add("CLR");
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
