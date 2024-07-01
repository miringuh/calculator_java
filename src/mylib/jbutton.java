package mylib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class jbutton{
    JButton button;
    int xn;
    int yn;
    int width;
    int height;
    String name;
    public jbutton(int x,int y,int width,int h) {
        this.xn=x;
        this.yn=y;
        this.height=h;
        this.width=width;
    }
    public JButton getButton(String value) {
        button=new JButton();
        button.setName(value);
        button.setText(value);
        button.setBounds(this.xn,this.yn,this.width,this.height);
        button.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
        button.setEnabled(true);


        button.setVisible(true);
        return button;
    }
}
