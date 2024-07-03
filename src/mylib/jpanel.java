package mylib;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;


public class jpanel {
    JPanel jp;
    int xn;
    int yn;
    int width;
    int height;
    String name;
    ArrayList<String>comp;

    public jpanel(int x,int y,int width,int height,String name){
        this.xn=x;
        this.yn=y;
        this.width=width;
        this.height=height;
        this.name=name;
    }

    public  JPanel getpanelComp(Component apane) {
        jp = new JPanel();
        jp.setBounds(this.xn, this.yn, this.width, this.height);
        jp.setName(this.name);
        jp.setLayout(null);
        jp.setBackground(new Color(163, 190, 220, 213));
        jp.setPreferredSize(new Dimension(this.width, this.height));
        Border border = new LineBorder(new Color(13, 55, 216, 103), 5, true);
        jp.setBorder(border);
        jp.setEnabled(true);

        comp = new ArrayList<>(20);
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
        int x = 10;
        int y = 140;
        jp.setVisible(true);
        return jp;
    }
}
