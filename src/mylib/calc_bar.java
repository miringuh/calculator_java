package mylib;

import java.util.ArrayList;

public class calc_bar {
    ArrayList <String> file;
    ArrayList <String> view;
    ArrayList <String> edit;
    ArrayList <String> help;

    public ArrayList<String> get_cal_bar(){
        file.add("New");
        file.add("Recent");
        file.add("Exit");
        view.add("Hex");
        view.add("Decimal");
        edit.add("Copy");
        edit.add("Paste");
        help.add("Author");
        help.add("www.website.com");
        return null;
    }
}
