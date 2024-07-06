package mylib;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class pane{
    JPanel pane;
    int xn;
    int yn;
    int width;
    int height;
    String name;
    Component mycomp;

    public pane(int x, int y, int width, int h, String nm) {
        this.xn = x;
        this.yn = y;
        this.height = h;
        this.width = width;
        this.name = nm;
    }

    public void getComp(Component comp){
        this.mycomp=comp;
    }

    public Component gettextpane() {
        pane = new JPanel();

        jmenubar bar=new jmenubar(10,10,(this.width-20),40,"Bar");
        bar.getComp(mycomp);
        Component getjbar = bar.getjbar();
        pane.add(getjbar);
        pane.setBounds(this.xn, this.yn, this.width, this.height);
        pane.setName(this.name);
        Border border = new LineBorder(new Color(13, 55, 216, 103), 5, true);
        pane.setBorder(border);
        pane.setBackground(new Color(45, 125, 218, 140));
        pane.setCursor(new Cursor(Cursor.TEXT_CURSOR));
        pane.setLayout(null);
        pane.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));

        jbutton[] butt=new jbutton[20];
        String[] buttVal={"7","8","9","C","4","5","6","/","1","2","3","-",".","0","00","*","(",")","+","="};
        int x = 10;
        int y = 140;
        int space = 40;
        JButton[] button=new JButton[20];

        for (int i = 0; i < 20; i++) {
            butt[i] = new jbutton(x, y, 80, 40);
            button[i] = butt[i].getButton(buttVal[i]);
            pane.add(button[i]);

            jtext inp=new jtext(10,70,(this.width-20),40,buttVal[i]);
            Component gettextarea = inp.gettextarea(button[i]);
            pane.add(gettextarea);

            if (i == 3 || i == 7 || i == 11 || i == 15 || i == 19) {
                x = 10;
                y += space;
            } else {x += 80;}
        }
        pane.setVisible(true);
        return pane;
        }


}


