package mylib;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
public class jtext {
    JTextField txtarea;
    JPasswordField pass;
    String txtField;
    int yn;
    int xn;
    int width;
    int height;
    String name;
    ArrayList<String> buttx=new ArrayList<>(20);
    ArrayList<Integer>buttValues;

    public jtext(int xn, int yn, int w, int h, String name){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=name;
    }

    public ArrayList<Integer> getbuttonvalue(String val){
        buttValues=new ArrayList<>(25);
        byte[] bytes = val.getBytes();
        int aByte = bytes[0];
        if (aByte>=48 && aByte <=57) {
            int valx=Integer.parseInt(val);
            buttValues.add(valx);
        }
        switch (aByte){
            case 67://clr
                buttValues.add(19);
                break;
            case 47:// /
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

    public Component gettextarea(Component butt) {
        JTextArea area=new JTextArea();
        Border border=new LineBorder(new Color(20,180, 132),2,true);
        area.setBorder(border);
//        area.setText(butt.getName());
        area.setName(this.name);
        area.setFont(new Font(Font.SANS_SERIF,Font.BOLD,22));
        area.setWrapStyleWord(false);
        area.setBounds(this.xn,this.yn,this.width,this.height);
        area.setLineWrap(false);
        area.setEditable(false);
        area.setEnabled(true);
        area.setLayout(null);

        files fd=new files("panel.txt");
        final String[] s = new String[1];
        final String[] name1 = new String[1];

        butt.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                name1[0] = butt.getName();
                ArrayList<Integer> getbuttonvalue = getbuttonvalue(name1[0]);
                try {
                    if (getbuttonvalue.get(0).equals(19)){
                        fd.flushFile();
                        area.setText(" ");

                    }else{
                    s[0] = fd.readFile();
                    fd.writeFile(s[0].concat(name1[0]));
                    area.setText(s[0].concat(name1[0]));
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
//                String name1 = area.getName();
//                buttx.add(name1);
//                System.out.println("nn "+area.getName());
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        area.setVisible(true);
        return area;
    }
}
