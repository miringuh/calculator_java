package mylib;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class jmenuitems {
    JMenuItem item;
//    jtooltip pop;
    int xn;
    int yn;
    int height;
    int width;
    String name;
    public jmenuitems(int xn, int yn, int w, int h, String name){
        this.xn = xn;
        this.yn = yn;
        this.height = h;
        this.width = w;
        this.name = name;
    }
    public JMenuItem jmenuitem(String lm){
        item=new JMenuItem();
//        pop=new jtooltip(this.xn,this.yn,this.height,"pop");
        Border border=new LineBorder(new Color(167, 168, 155),1,true);
        item.setBorder(border);
        item.setBounds(this.xn,this.yn,this.width,this.height);
        item.setBackground(new Color(229, 241, 149));
        item.setText(lm);
        item.setVisible((true));
        item.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
//                System.out.print(lm+" ");
            }
            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                System.out.print(lm+" ");
            }
            @Override
            public void mouseReleased(MouseEvent mouseEvent) {
            }
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                item.setToolTipText(lm);
            }
            @Override
            public void mouseExited(MouseEvent mouseEvent) {
            }
        });
        return item;
    }

}
