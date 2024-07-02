package mylib;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class jtext {
    JTextField txtarea;
    JPasswordField pass;
    String txtField;
    int yn;
    int xn;
    int width;
    int height;
    String name;
    ArrayList<String> buttx=new ArrayList<>(20);

    public jtext(int xn, int yn, int w, int h, String name){
        this.xn=xn;
        this.yn=yn;
        this.width=w;
        this.height=h;
        this.name=name;
    }
    public Component getfieldtext(String word){
        txtarea=new JTextField(word);
        txtarea.setName(this.name);
        txtarea.setBackground(new Color(205, 209, 189));
        txtarea.setFont(new Font("Arial",Font.PLAIN,14));
        Border border=new LineBorder(new Color(20,180, 132),2,true);
        txtarea.setBorder(border);
        txtarea.setCaretPosition(0);
        txtarea.setBounds(this.xn,this.yn,this.width,this.height);
        txtarea.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                txtarea.setText("");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        txtarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int st=actionEvent.paramString().indexOf("cmd=");
                doReadfield(actionEvent.paramString().substring(st+4));
            }
        });

        txtarea.setVisible(true);
        return txtarea;
    }
    protected void doReadfield(Object obj){
        char c;
        int wdLen=obj.toString().indexOf(",");
        ArrayList<Character> datax=new ArrayList<>();
        for (int i = 0; i < wdLen; i++) {
            c = obj.toString().toUpperCase().charAt(i);
            datax.add(c);
        }
        String[] msg = new String[datax.size()];
        String mesg="";
        for (int i = 0; i < datax.size(); i++) {
            msg[i] = mesg.concat(datax.get(i).toString());
            System.out.print(msg[i]);
        }
        String val=new String();
        txtField = val.formatted("%s", msg);
        System.out.println(txtField);

    }
    public Component getfieldPasword(){
        pass=new JPasswordField("password");
        pass.setName(this.name);
        pass.setBackground(new Color(205, 209, 189));
        Border border=new LineBorder(new Color(103, 41, 77),2,true);
        pass.setBorder(border);
        pass.setEditable(true);
        pass.setBounds(this.xn,this.yn,this.width,this.height);
        pass.setCaretPosition(0);
        pass.setCaretColor(new Color(220, 21, 21));
        pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int st=actionEvent.paramString().indexOf("cmd=");
                doReadfield(actionEvent.paramString().substring(st+4));
            }
        });
        pass.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                pass.setText("");
            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {
                pass.setToolTipText("PassWord");
            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });
        pass.setEnabled(true);
        pass.setVisible(true);
        return pass;
    }
    public Component getdatefield(){
        txtarea=new JFormattedTextField(new Date() );
        txtarea.setName(this.name);
        txtarea.setBackground(new Color(205, 209, 189));
        txtarea.setFont(new Font("Arial",Font.PLAIN,14));
        Border border=new LineBorder(new Color(20,180, 132),2,true);
        txtarea.setBorder(border);
        txtarea.setCaretPosition(0);
        txtarea.setBounds(this.xn,this.yn,this.width,this.height);
        txtarea.setToolTipText("Edit date");
        txtarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = txtarea.getText();
                System.out.println(text);
            }
        });

        txtarea.setEnabled(true);
        txtarea.setVisible(true);
        return txtarea;
    }

    public String read_textarea(String comp){
        return comp;
    }
    public Component gettextarea(String val,Component butt) {
        JTextArea area=new JTextArea();
        Border border=new LineBorder(new Color(20,180, 132),2,true);
        area.setBorder(border);
//        area.setText(comp.getName());
        area.setName(this.name);
        area.setFont(new Font(Font.SANS_SERIF,Font.BOLD,22));
        area.setWrapStyleWord(false);
        area.setBounds(this.xn,this.yn,this.width,this.height);
        area.setLineWrap(false);
        area.setEditable(false);
        area.setEnabled(true);
        area.setLayout(null);

        files fd=new files("panel.txt");
        final String[] s = new String[1];

        butt.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                String name1 = butt.getName();
                try {
                    if (name1.equals("C")){
                        fd.flushFile();
                        area.setText(" ");

                    }else{
                    s[0] = fd.readFile();
                    fd.writeFile(s[0].concat(name1));
                    area.setText(s[0].concat(name1));
//                    System.out.println(name1);
                    }



                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
//                String name1 = area.getName();
//                buttx.add(name1);
//                System.out.println("nn "+area.getName());
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseEntered(MouseEvent mouseEvent) {

            }

            @Override
            public void mouseExited(MouseEvent mouseEvent) {

            }
        });

        area.setVisible(true);
        return area;
    }
}
