import mylib.jbutton;

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

    public jpanel(int x,int y,int width,int height,String name){
        this.xn=x;
        this.yn=y;
        this.width=width;
        this.height=height;
        this.name=name;
    }
    public  JPanel getpanel(ArrayList<Component>comp) {
        jp = new JPanel();
        jp.setBounds(this.xn, this.yn, this.width, this.height);
        jp.setName(this.name);
        jp.setLayout(null);
        jp.setPreferredSize(new Dimension(this.width,this.height));
        Border border=new LineBorder(new Color(13, 55, 216, 103),5,true);
        jp.setBorder(border);
        jp.setEnabled(true);
        for (int i = 0; i < comp.size(); i++) {
            jp.add(comp.get(i));
        }
        jp.setVisible(true);
        return jp;
    }
}
