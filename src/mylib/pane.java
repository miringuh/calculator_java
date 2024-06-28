package mylib;

import javax.swing.*;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class pane {
    JTextPane pane;
    int xn;
    int yn;
    int width;
    int height;
    String name;

    public pane(int x,int y,int width,int h,String nm) {
        this.xn=x;
        this.yn=y;
        this.height=h;
        this.width=width;
        this.name=nm;
    }
    public Component gettextpane(String num){
        pane=new JTextPane();
        pane.setBounds(this.xn,this.yn,this.width,this.height);
        pane.setName(this.name);
        pane.setText(num);
        pane.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pane.setLayout(null);
        pane.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
        pane.setVisible(true);
        pane.setVisible(true);
        return pane;
    }
}
