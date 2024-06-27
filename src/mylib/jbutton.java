package mylib;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class jbutton extends JButton {
    JButton button;
    int xn;
    int yn;
    int width;
    int height;
    String name;

    public jbutton(int x,int y,int width,int h,String nm) {
        this.xn=x;
        this.yn=y;
        this.height=h;
        this.width=width;
        this.name=nm;
    }
    public Integer buttonValue(String val){
        byte[] bytes = val.getBytes();
        int value = 0;
        if((bytes[0]-48)>=0 || (bytes[0]-48)<=9) {
            value=(bytes[0] - 48);
        }
        if((bytes[0]-48)==-2){
            value=10;
        }
        if((bytes[0]-48)==13){
            value=11;
        }
        if((bytes[0]-48)==-5){
            value=12;
        }
        if((bytes[0]-48)==-3){
            value=13;
        }
        if((bytes[0]-48)==-11){
            value=14;
        }
        if((bytes[0]-48)== 20){
            value=15;
        }
        return value;
    }
    public JButton getButton(String num) {
        button=new JButton();
        button.setText(num);
        button.setName(num);
        button.setBounds(this.xn,this.yn,this.width,this.height);
//        Border border=new LineBorder(new Color(223, 237, 2),2,true);
//        setBorder(border);
        button.setEnabled(true);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                Integer i = buttonValue(button.getName());
                System.out.print(" "+i);
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
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
        button.setVisible(true);
        return button;
    }
}
