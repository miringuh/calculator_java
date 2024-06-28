package mylib;

import java.util.ArrayList;


public class calc_bar {
    ArrayList <String> fd;
    ArrayList <String> file;
    ArrayList <String> view;
    ArrayList <String> edit;
    ArrayList <String> help;

    public ArrayList<String> get_cal_bar(){
        ArrayList<String>bar=new ArrayList<>(5);
        fd=new ArrayList<>(4);
        fd.add("File");
        fd.add("View");
        fd.add("Edit");
        fd.add("Help");
        file=new ArrayList<>(3);
        file.add("New");
        file.add("Recent");
        file.add("Exit");
        view=new ArrayList<>(2);
        view.add("Hex");
        view.add("Decimal");
        edit=new ArrayList<>(2);
        edit.add("Copy");
        edit.add("Paste");
        help=new ArrayList<>(2);
        help.add("Author");
        help.add("www.website.com");
        bar.add(fd.get(0));
        bar.add(fd.get(1));
        bar.add(fd.get(2));
        bar.add(fd.get(3));
        bar.add(file.get(0));
        bar.add(file.get(1));
        bar.add(file.get(2));
        bar.add(view.get(0));
        bar.add(view.get(1));
        bar.add(edit.get(0));
        bar.add(edit.get(1));
        bar.add(help.get(0));
        bar.add(help.get(1));
        return bar;
    }
}
