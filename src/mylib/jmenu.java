package mylib;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;


public class jmenu {
    JMenu menu;
    jmenuitems item;
    int xn;
    int yn;
    int height;
    int width;
    String name;
    Component mycomp;
    public jmenu(int xn, int yn, int w, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.height = h;
        this.width = w;
        this.name = name;
    }
    public void getComp(Component comp){
        this.mycomp=comp;
    }
    public Component getjmenu(String fd, ArrayList<String> file, ArrayList<String> view, ArrayList<String> edit, ArrayList<String> help) {
        menu = new JMenu();
        menu.setBounds(this.xn, this.yn, this.width, this.height);
        menu.setBackground(new Color(202, 223, 114));
        menu.setName(this.name);
        menu.setText(this.name);
        menu.setFont(new Font(Font.SANS_SERIF,Font.BOLD,14));
        menu.setFocusPainted(true);
        if (fd.equals("File")) {
            for (String s : file) {
                item = new jmenuitems(0, 0, 40, 30, s);
                JMenuItem jmenuitem = item.jmenuitem(s);
                menu.add(jmenuitem);
            }
        }
        if (fd.equals("View")) {
            for (String s : view) {
                item = new jmenuitems(0, 0, 40, 30, s);
                JMenuItem jmenuitem = item.jmenuitem(s);
                menu.add(jmenuitem);
            }
        }
        if (fd.equals("Edit")) {
            for (String s : edit) {
                item = new jmenuitems(0, 0, 40, 30, s);
                JMenuItem jmenuitem = item.jmenuitem(s);
                menu.add(jmenuitem);
            }
        }
        if (fd.equals("Help")) {
            for (String s : help) {
                item = new jmenuitems(0, 0, 40, 30, s);
                JMenuItem jmenuitem = item.jmenuitem(s);
                menu.add(jmenuitem);
            }
            menu.addMenuListener(new MenuListener() {
                @Override
                public void menuSelected(MenuEvent menuEvent) {
//                System.out.println(menu.getText());
//                menu.setSelected(true);
                }

                @Override
                public void menuCanceled(MenuEvent menuEvent) {
                }

                @Override
                public void menuDeselected(MenuEvent menuEvent) {
//                System.out.println(menu.getText()+" deselected");
//                menu.setSelected(false);

                }
            });

            menu.setEnabled(true);
            menu.setVisible(true);
            return menu;
        }
        return menu;
    }
}