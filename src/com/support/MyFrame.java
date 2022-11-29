package com.support;

import java.awt.Button;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.Panel;

public class MyFrame extends Frame {

    protected static Panel p1, p2;
    Panel1 panel1;
    Panel2 panel2;

    public MyFrame() throws HeadlessException {
        p1 = new Panel();
        p2 = new Panel();

        p1.setBounds(0, 0, 100, 100);
//        p2.setBounds(0, 0, 100, 100);
        
        
        panel1 = new Panel1();
        panel2 = new Panel2();
//        p
        
        
        this.add(p1);
        this.add(p2);
    }

}

class Panel1 {

    Button b1, b2, b3, b4;

    public Panel1() {
        b1 = new Button("OK");
        b2 = new Button("Cancel");
        b3 = new Button("Submit");
        b4 = new Button("Delete");

        MyFrame.p1.add(b1);
        MyFrame.p1.add(b2);
        MyFrame.p1.add(b3);
        MyFrame.p1.add(b4);
    }

}

class Panel2 {

    List l1, l2, l3, l4;

    public Panel2() {

        l1 = new List();
        l2 = new List();
        l3 = new List();
        l4 = new List();
        
        
        l1.add("hii");
        l1.add("enw");
        
        l2.add("hgf");
        l2.add("hgf");
        
        l3.add("hgf");
        l3.add("hgf");
        
        l4.add("hgf");
        l4.add("hgf");

        MyFrame.p2.add(l1);
        MyFrame.p2.add(l2);
        MyFrame.p2.add(l3);
        MyFrame.p2.add(l4);
    }

}

class Gui {

    public static void main(String[] args) {
        MyFrame myframe = new MyFrame();
        myframe.show();
    }
}
