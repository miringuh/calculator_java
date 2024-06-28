package mylib;

import javax.swing.*;

public class jtooltip {
    JToolTip tip;
    int xn;
    int yn;
    int height;
    String name;
    public jtooltip(int x, int y, int h, String name) {
        this.xn = x;
        this.yn = y;
        this.height = h;
        this.name = name;
    }
    public JToolTip getTip(String name) {
        tip = new JToolTip();
        tip.setName(this.name);
        tip.setTipText(name);
        tip.setBounds(this.xn, this.yn, 40, this.height);
        tip.setEnabled(true);
        tip.setVisible(true);
        return tip;
    }
}
