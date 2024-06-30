package mylib;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class jpanel {
    JPanel jp;
    jbutton butt;
    int xn;
    int yn;
    int width;
    int height;
    String name;
    ArrayList<String>comp;
    ArrayList<Integer>buttValues;
    String labelvalue=" ";
    public jpanel(int x,int y,int width,int height,String name){
        this.xn=x;
        this.yn=y;
        this.width=width;
        this.height=height;
        this.name=name;
    }

    public ArrayList<Integer> getbuttonvalue(String val){
        buttValues=new ArrayList<>(20);
        byte[] bytes = val.getBytes();
        int aByte = bytes[0];
        if (aByte>=48 && aByte <=57) {
            int valx=Integer.valueOf(val);
            buttValues.add(valx);
        }
        switch (aByte){
            case 67://clr
                buttValues.add(19);
                break;
            case 37://%
                buttValues.add(18);
                break;
            case 45://-
                buttValues.add(17);
                break;
            case 46://. dot
                buttValues.add(14);
                break;
            case 61://=
                buttValues.add(15);
                break;
            case 43://+
                buttValues.add(16);
                break;
            case 40://(
                buttValues.add(10);
                break;
            case 41://)
                buttValues.add(11);
                break;
            case 94://^
                buttValues.add(12);
                break;
            case 42://*
                buttValues.add(13);
            break;
        }
        return buttValues;
    }

    public void pthread(int val){
        Runnable runner=new Runnable() {
            @Override
            public void run() {
                ArrayList<Integer> getbuttonvalue = getbuttonvalue(comp.get(val));
                jlabel lb=new jlabel(200,80,35," well");
                Component getlabel = lb.getlabel(getbuttonvalue.get(0).toString());
                System.out.print(" "+getbuttonvalue.get(0));
                jp.add(getlabel);
            }
        };EventQueue.invokeLater(runner);
    }

    public  JPanel getpanelComp(Component apane) {
        jp = new JPanel();
//        pane pn=new pane(10,80,(this.width-18),35,"pane");
//        Component panes = pn.gettextpane("Panes");
//        jp.add(panes);

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
        int space = 40;

        JButton button = null;
        for (int i = 0; i < comp.size(); i++) {
            butt = new jbutton(x, y, 80, 40, comp.get(i));
            button = butt.getButton(comp.get(i));
            jp.add(button);
            if (i == 3 || i == 7 || i == 11 || i == 15 || i == 19) {
                x = 10;
                y += space;
            } else {x += 80;}
            int finalI = i;

            button.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent mouseEvent) {
                    labelvalue= comp.get(finalI);
                }
                @Override
                public void mousePressed(MouseEvent mouseEvent) {}
                @Override
                public void mouseReleased(MouseEvent mouseEvent) {}
                @Override
                public void mouseEntered(MouseEvent mouseEvent) {}
                @Override
                public void mouseExited(MouseEvent mouseEvent) {}
            });
        }
        jp.setVisible(true);
        return jp;
    }
}
