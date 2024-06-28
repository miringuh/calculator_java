package mylib;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.util.ArrayList;


public class jmenu {
    JMenu menu;
    jmenuitems pop;
    JMenuItem jmenuitem;
    int xn;
    int yn;
    int height;
    int width;
    String name;
    int cnt = 0;

    public jmenu(int xn, int yn, int w, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.height = h;
        this.width = w;
        this.name = name;
    }
    public Component getjmenu(ArrayList<String> lm, String ls) {
        menu = new JMenu();
        menu.setBounds(this.xn, this.yn, this.width, this.height);
        menu.setName(ls);
        menu.setBackground(new Color(202, 223, 114));
        menu.setText(ls);
        for (String s : lm) {
            pop = new jmenuitems(10, cnt, this.width, this.height, s);
            jmenuitem = pop.jmenuitem(s);
            menu.add(jmenuitem);
        }
        menu.addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent menuEvent) {
//                System.out.println(ls);
            }

            @Override
            public void menuCanceled(MenuEvent menuEvent) {
            }

            @Override
            public void menuDeselected(MenuEvent menuEvent) {
            }
        });
        menu.setEnabled(true);
        menu.setVisible(true);
        return menu;
    }
}