package  mylib;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class jmenubar {
    JMenuBar jbar;
    jmenu menu;
    int xn;
    int yn;
    int width;
    int height;
    String name;
    int cnt=30;

    public jmenubar(int xn, int yn, int w, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.width = w;
        this.height = h;
        this.name = name;
    }
    public Component get_Abar(ArrayList<String> lm,String ls) {
        jbar=new JMenuBar();
        menu = new jmenu(this.xn, cnt, this.width, this.height, ls);
        jbar.add(menu.getjmenu(lm, ls));
        return jbar;
    }
    public Component getjbar(ArrayList<String> ls,ArrayList<String> file,ArrayList<String>view,ArrayList<String> edit,ArrayList<String>help){
        jbar=new JMenuBar();
        for (String l : ls) {
            menu = new jmenu(this.xn, cnt, this.width, this.height, l);
            if (l.equals(ls.get(0))) {
                jbar.add(menu.getjmenu(file, l));
            }
            if (l.equals(ls.get(1))) {
                jbar.add(menu.getjmenu(edit, l));
            }
            if (l.equals(ls.get(2))) {
                jbar.add(menu.getjmenu(view, l));
            }
//            if (l.equals(ls.get(3))) {
//                jbar.add(menu.getjmenu(close, l));
//            }
            if (l.equals(ls.get(3))) {
                jbar.add(menu.getjmenu(help, l));
            }
        }
        jbar.setName(this.name);
        Border border=new LineBorder(new Color(160, 227, 190),2,true);
        jbar.setBorder(border);
        jbar.setBackground(new Color(239, 231, 231, 137));
        jbar.setBounds(this.xn, this.yn, this.width, this.height);
        jbar.setEnabled(true);
        jbar.setVisible(true);
        return jbar;
    }
}
