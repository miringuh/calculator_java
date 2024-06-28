package mylib;

import javax.swing.*;
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
    public Integer getbuttonvalue(String val){
        System.out.print(" "+val);

        return null;
    }

    public JButton getButton() {
        button=new JButton();
        button.setText(this.name);
        button.setName(this.name);
        button.setBounds(this.xn,this.yn,this.width,this.height);
        button.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
//        Border border=new BevelBorder(2,null,Color.magenta,Color.gray,Color.red);
//        button.setBorder(border);
        button.setEnabled(true);

        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                getbuttonvalue(button.getName());
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
