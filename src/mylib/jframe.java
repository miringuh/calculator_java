package mylib;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class jframe extends JFrame {
    JFrame frame;
    int xn;
    int yn;
    int width;
    int height;
    String name;

    public jframe(int x,int y,int width,int h,String nm) {
        this.xn=x;
        this.yn=y;
        this.height=h;
        this.width=width;
        this.name=nm;
    }

    public JFrame getFrame(String title) {
        frame=new JFrame();
        frame.setName(this.name);
        frame.setTitle(title);
        frame.setBounds(this.xn,this.yn,this.width,this.height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(this.width,this.height);
        frame.setAlwaysOnTop(false);
        frame.setLayout(null);
        frame.setVisible(true);
        return frame;
    }
}