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
                System.out.print(" "+button.getName());
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
