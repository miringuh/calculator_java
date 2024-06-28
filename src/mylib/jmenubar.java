package  mylib;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.ArrayList;

public class jmenubar {
    JMenuBar jbar;
    jmenu menu;
    jmenuitems items;
    jtooltip pop;
    ArrayList <String> fd;
    ArrayList <String> file;
    ArrayList <String> view;
    ArrayList <String> edit;
    ArrayList <String> help;
    int xn;
    int yn;
    int width;
    int height;
    String name;
    int cnt;

    public jmenubar(int xn, int yn, int w, int h, String name) {
        this.xn = xn;
        this.yn = yn;
        this.width = w;
        this.height = h;
        this.name = name;
    }
    public void get_Abar() {
        fd=new ArrayList<>(4);
        fd.add("File");
        fd.add("View");
        fd.add("Edit");
        fd.add("Help");

        file=new ArrayList<>(4);
        file.add("Open");
        file.add("New");
        file.add("Previous");
        file.add("Exit");

        view=new ArrayList<>(3);
        view.add("Decimal");
        view.add("Hex");
        view.add("Simple");

        edit=new ArrayList<>(3);
        edit.add("Copy");
        edit.add("Paste");
        edit.add("Clear");

        help=new ArrayList<>(3);
        help.add("Author");
        help.add("Doccumentation");
        help.add("www.website.com");
    }
    public Component getjbar(){
        jbar=new JMenuBar();
        get_Abar();
        jbar.setName(this.name);
        Border border=new LineBorder(new Color(160, 227, 190),2,true);
        jbar.setBorder(border);
        jbar.setBackground(new Color(239, 231, 231, 137));
        jbar.setBounds(this.xn, this.yn, this.width, this.height);
        jbar.setEnabled(true);
        cnt=0;
        int fd_size = fd.size() * 12;
        System.out.println(file.get(0));
        for (int i = 0; i < fd.size(); i++) {
            menu = new jmenu(0, cnt, 40, 30, fd.get(i));
            Component getjmenu = menu.getjmenu(fd.get(i), file, view, edit, help);
            jbar.add(getjmenu);
            cnt += fd_size;
        }

        jbar.setVisible(true);
        return jbar;
            }
        }
