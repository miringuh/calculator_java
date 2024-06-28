package mylib;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import java.awt.*;
import java.util.ArrayList;


public class jmenu {
    JMenu menu;
    jtooltip pop;
    jmenuitems item;
    int xn;
    int yn;
    int height;
    int width;
    String name;

    public jmenu(int xn, int yn, int w, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.height = h;
        this.width = w;
        this.name = name;
    }

    //    public Component getmenuList(ArrayList<String>fd,ArrayList<String>file,ArrayList<String>view,ArrayList<String>edit,ArrayList<String>help){
//        menu = new JMenu();
//        if(fd.get(0).equals("File")){
//            for (int i = 0; i < file.size(); i++) {
//                item = new jmenuitems(0, 0, 40, 30, file.get(i));
//                JMenuItem jmenuitem = item.jmenuitem(file.get(i));
//                menu.add(jmenuitem);
//            }
//        }
//        if(fd.get(1).equals("View")){
//            for (int i = 0; i < view.size(); i++) {
//                Component getjmenu = getjmenu(view.get(i));
//                item = new jmenuitems(0, 0, 40, 30, view.get(i));
//                JMenuItem jmenuitem = item.jmenuitem(view.get(i));
//                menu.add(jmenuitem);
//            }
//        }
//        if(fd.get(2).equals("Edit")){
//            for (int i = 0; i < edit.size(); i++) {
//                item = new jmenuitems(0, 0, 40, 30, edit.get(i));
//                JMenuItem jmenuitem = item.jmenuitem(edit.get(i));
//                menu.add(jmenuitem);
//            }
//        }
//        if(fd.get(3).equals("Help")){
//            for (int i = 0; i < help.size(); i++) {
//                item = new jmenuitems(0, 0, 40, 30, help.get(i));
//                JMenuItem jmenuitem = item.jmenuitem(help.get(i));
//                menu.add(jmenuitem);
//            }
//        }
//        return menu;
//    }
//
    public Component getjmenu(String fd, ArrayList<String> file, ArrayList<String> view, ArrayList<String> edit, ArrayList<String> help) {
        menu = new JMenu();
        menu.setBounds(this.xn, this.yn, this.width, this.height);
        menu.setBackground(new Color(202, 223, 114));
        menu.setName(this.name);
        menu.setText(this.name);
        menu.setFocusPainted(true);
        if (fd.equals("File")) {
            for (int i = 0; i < file.size(); i++) {
                item = new jmenuitems(0, 0, 40, 30, file.get(i));
                JMenuItem jmenuitem = item.jmenuitem(file.get(i));
                menu.add(jmenuitem);
            }
        }
        if (fd.equals("View")) {
            for (int i = 0; i < view.size(); i++) {
                item = new jmenuitems(0, 0, 40, 30, view.get(i));
                JMenuItem jmenuitem = item.jmenuitem(view.get(i));
                menu.add(jmenuitem);
            }
        }
        if (fd.equals("Edit")) {
            for (int i = 0; i < edit.size(); i++) {
                item = new jmenuitems(0, 0, 40, 30, edit.get(i));
                JMenuItem jmenuitem = item.jmenuitem(edit.get(i));
                menu.add(jmenuitem);
            }
        }
        if (fd.equals("Help")) {
            for (int i = 0; i < help.size(); i++) {
                item = new jmenuitems(0, 0, 40, 30, help.get(i));
                JMenuItem jmenuitem = item.jmenuitem(help.get(i));
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