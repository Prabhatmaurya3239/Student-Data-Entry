
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Student {
    JFrame f;

    JMenuItem a1, a2, a3, a4;
    String sname = null, srollno = null, scourse = null, sdepartment = null;
    String sp1 = null, sp2 = null;
    String result = null;
    String tag = null;
    String tag1 = null, tag2 = null;
    boolean grow = false;

    public Student() {
        // frame

        f = new JFrame("Student Data Entry");
        JFrame f2 = new JFrame("Saved Data Daitail");
        // label
        JLabel label = new JLabel("Student Data Entry");
        JLabel label2 = new JLabel("Saved Student Data");

        label2.setFont(new Font("Arial", Font.BOLD, 24)); // Specify font family, style, and size
        label2.setForeground(Color.BLACK);
        label2.setBounds(100, 5, 400, 50);
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Specify font family, style, and size
        label.setForeground(Color.BLACK);
        label.setBounds(100, 5, 400, 50);
        JLabel label3 = new JLabel("Salect Menu");
        label3.setBounds(120, 50, 150, 30);
        label3.setForeground(Color.DARK_GRAY);
        f.add(label);
        f.add(label3);
        f2.add(label2);
        // MenuBar
        JMenuBar m = new JMenuBar();
        m.setBounds(20, 50, 60, 30);
        f.add(m);
        // Menu
        JMenu m1 = new JMenu("UG");
        JMenu m2 = new JMenu("PG");
        m.add(m1);
        m.add(m2);

        // MenuItem
        JMenuItem a1 = new JMenuItem("UG");
        JMenuItem a2 = new JMenuItem("MASTER");
        JMenuItem a3 = new JMenuItem("PHD");
        JMenuItem a4 = new JMenuItem("Scientist");
        m1.add(a1);
        m2.add(a2);
        m2.add(a3);
        m2.add(a4);

        // Text Area
        JTextArea textarea = new JTextArea();
        textarea.setEditable(false);
        textarea.setFont(new Font("Arial", Font.PLAIN, 14));

        textarea.setBounds(20, 50, 400, 400);
        f2.add(textarea);

        f2.setLayout(null);
        f2.setSize(500, 500);

        // Buttons
        JButton save, clear, print, add;
        save = new JButton("Save");
        clear = new JButton("Clear");
        print = new JButton("Print");
        add = new JButton("Add");
        save.setBounds(140, 250, 90, 40);
        clear.setBounds(300, 250, 90, 40);
        print.setBounds(140, 250, 90, 40);
        add.setBounds(300, 250, 90, 40);
        save.setForeground(Color.BLACK);
        save.setBackground(Color.GREEN);
        clear.setForeground(Color.WHITE);
        clear.setBackground(Color.DARK_GRAY);
        print.setForeground(Color.WHITE);
        print.setBackground(Color.BLUE);
        add.setBackground(Color.YELLOW);
        save.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        clear.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        print.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        add.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));

        f.add(save);
        f.add(print);
        f.add(clear);
        f.add(add);
        print.setVisible(false);
        add.setVisible(false);

        // Text Field

        JTextField name, rollno, course, department;
        name = new JTextField();
        rollno = new JTextField();
        course = new JTextField();
        department = new JTextField();
        JTextField p1, p2;
        p1 = new JTextField();
        p2 = new JTextField();
        name.setEditable(false);
        rollno.setEditable(false);
        course.setEditable(false);
        department.setEditable(false);
        p1.setEditable(false);
        p2.setEditable(false);
        name.setBounds(140, 100, 300, 20);
        rollno.setBounds(140, 120, 300, 20);
        course.setBounds(140, 140, 300, 20);
        department.setBounds(140, 160, 300, 20);

        p1.setBounds(140, 180, 300, 20);
        p2.setBounds(140, 200, 300, 20);

        f.add(rollno);
        f.add(course);
        f.add(department);
        f.add(p1);
        f.add(p2);
        f.add(name);

        // sub Label

        JLabel lname, lrollno, coursel, departmentl, s1, s2;
        lname = new JLabel("NAME");
        lrollno = new JLabel("RollNO");

        coursel = new JLabel("COURSE");

        departmentl = new JLabel("DEPARTMENT");
        s1 = new JLabel("BRANCH");
        s2 = new JLabel("COLLAGE");
        lname.setBounds(30, 100, 120, 20);
        lrollno.setBounds(30, 120, 120, 20);
        coursel.setBounds(30, 140, 120, 20);
        departmentl.setBounds(30, 160, 120, 20);
        s1.setBounds(30, 180, 120, 20);
        s2.setBounds(30, 200, 120, 20);

        f.add(departmentl);
        f.add(coursel);
        f.add(lname);
        f.add(lrollno);
        f.add(s1);
        f.add(s2);

        // UG BUTTON WORK
        a1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "UG OPTION SELECTED");

                p2.setVisible(true);
                s2.setVisible(true);
                s1.setText("BRANCH");
                s2.setText("COLLEGE");
                tag = "UG STUDENT";
                tag1 = "BRANCH";
                tag2 = "COLLEGE";
                name.setEditable(true);
                rollno.setEditable(true);
                course.setEditable(true);
                department.setEditable(true);
                p1.setEditable(true);
                p2.setEditable(true);
                label3.setText(tag);

            }
        });
        // Master button work
        a2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(f, "PHD OPTION SELECTED");
                p2.setVisible(true);
                s2.setVisible(true);
                s1.setText("SPECIALIZATION");
                s2.setText("PROJECT");
                tag = "MASTER STUDENT";
                tag1 = "Specialization";
                tag2 = "Project";
                name.setEditable(true);
                rollno.setEditable(true);
                course.setEditable(true);
                department.setEditable(true);
                p1.setEditable(true);
                p2.setEditable(true);
                label3.setText(tag);

            }
        });
        // PHD button work
        a3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(f, "MASTER OPTION SELECTED");
                p2.setVisible(true);
                s2.setVisible(true);
                s1.setText("TOPIC");
                s2.setText("SUPERVISOR");
                tag = "PHD STUDENT";
                tag1 = "Topic";
                tag2 = "Supervisor";
                name.setEditable(true);
                rollno.setEditable(true);
                course.setEditable(true);
                department.setEditable(true);
                p1.setEditable(true);
                p2.setEditable(true);
                label3.setText(tag);

            }
        });
        // Scientist Button work
        a4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(f, "SCIENTIST OPTION SELECTED");
                p2.setVisible(false);
                s2.setVisible(false);
                s1.setText("AREA");
                tag = "SCIENTIST STUDENT";
                grow = true;
                tag1 = "Area";
                name.setEditable(true);
                rollno.setEditable(true);
                course.setEditable(true);
                department.setEditable(true);
                p1.setEditable(true);
                p2.setEditable(true);
                label3.setText(tag);

            }
        });
        // Save button
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Save Data");
                save.setVisible(false);
                clear.setVisible(false);
                print.setVisible(true);
                add.setVisible(true);
                sname = name.getText();
                srollno = rollno.getText();
                scourse = course.getText();
                sdepartment = department.getText();

                if (grow) {
                    sp1 = p1.getText();
                    result = "->\n      " + tag + "\n" + "  Name: " + sname + "\n" + " Rollno: " + srollno + "\n"
                            + " Course: " + scourse + "\n" + " Department: " + sdepartment + "\n " + tag1 + ": " + sp1;
                    grow = false;
                    p1.setText(null);
                    p1.setEditable(false);
                } else {
                    sp1 = p1.getText();
                    sp2 = p2.getText();
                    result = "->\n       " + tag + "\n  Name: " + sname + "\n" + "  Rollno: " + srollno + "\n"
                            + " Course: " + scourse + "\n" + " Department: " + sdepartment + "\n " + tag1 + ": " + sp1
                            + "\n " + tag2 + ": " + sp2;
                    p1.setText(null);
                    p2.setText(null);
                    p1.setEditable(false);
                    p2.setEditable(false);
                }

                name.setText(null);
                rollno.setText(null);
                course.setText(null);
                department.setText(null);
                name.setEditable(false);
                rollno.setEditable(false);
                course.setEditable(false);
                department.setEditable(false);
                label3.setText(null);
            }
        });

        // add button
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "ADD NOW...");
                print.setVisible(false);
                add.setVisible(false);
                save.setVisible(true);
                clear.setVisible(true);
                name.setEditable(true);
                rollno.setEditable(true);
                course.setEditable(true);
                department.setEditable(true);
                p1.setEditable(true);
                p2.setEditable(true);
                label3.setText("Salect Menu");

            }
        });
        // print button
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Showing now...");
                f2.setVisible(true);
                textarea.setText(result);

            }
        });
        // clear button
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setText(null);
                rollno.setText(null);
                course.setText(null);
                department.setText(null);
                p1.setText(null);
                p2.setText(null);
                label3.setText("SalectMenu");

            }
        });

        f.setLayout(null); // Not recommended, consider using layout managers
        f.setSize(500, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        f.setVisible(true);

    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new Student());

    }

}
