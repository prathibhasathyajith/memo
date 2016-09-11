/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professionalpractise;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author prathibha
 */
public class memonew2 extends javax.swing.JFrame {
    
    
    
    int xmouse;
    int ymouse;
    
    public static String Q1 = null;
    public static String Q2 = null;
    public static String Q3 = null;
    public static String Q4 = null;
    public static String Q5 = null;
    
    String s1= "<html>&nbsp;&nbsp;How old are you?</html>";
    String s2= "<html>&nbsp;&nbsp;What is your birth month?</html>";
    String s3= "<html>&nbsp;&nbsp;What is your birth day?</html>";
    String s4= "<html>&nbsp;&nbsp;What is your favourite number?</html>";
    String s5= "<html>&nbsp;&nbsp;How many members are there <br> &nbsp;&nbsp;in your family?</html>";
    /**
     * Creates new form memonew2
     */
    public memonew2() {
        initComponents();
        
        lblinfo.setVisible(false);
        
        lblQuestion1.setVisible(false);
        lblQuestion2.setVisible(false);
        lblQuestion3.setVisible(false);
        lblQuestion4.setVisible(false);
        lblQuestion5.setVisible(false);
        lblinfo2.setVisible(false);
        jffans1.setVisible(false);
        jffans2.setVisible(false);
        jffans3.setVisible(false);
        jffans4.setVisible(false);
        jffans5.setVisible(false);
        
        lblQuestion1.setText(s1);
        lblQuestion2.setText(s2);
        lblQuestion3.setText(s3);
        lblQuestion4.setText(s4);
        lblQuestion5.setText(s5);
        
        showLabel(lblQuestion1,5000);
        showLabel(lblQuestion2,6000);
        showLabel(lblQuestion3,7000);
        showLabel(lblQuestion4,8000);
        showLabel(lblQuestion5,9000);
        
        showTextField(jffans1,5000);
        showTextField(jffans2,6000);
        showTextField(jffans3,7000);
        showTextField(jffans4,8000);
        showTextField(jffans5,9000);
        
        showLabel(lblinfo, 10000);
        
        HideLabel(lblHello, 1500);
        showLabel(lblinfo2, 1500);
        HideLabel(lblinfo2, 5000);
        
    }
    
    public void showLabel(JLabel label,int Time){
        Timer t = new Timer(Time, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(true);
            }
        });
        t.setRepeats(false);
        t.start();
        
    }
    
    public void showTextField(JTextField Tfield,int Time){
        Timer t = new Timer(Time, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Tfield.setVisible(true);
            }
        });
        t.setRepeats(false);
        t.start();
        
    }
    
    public String addZero(String s){
        String number="";
        
        switch(s){
            case "1 ":
                number="01";
                break;
            case "2 ":
                number="02";
                break;
            case "3 ":
                number="03";
                break;
            case "4 ":
                number="04";
                break;
            case "5 ":
                number="05";
                break;
            case "6 ":
                number="06"; 
                break;
            case "7 ":
                number="07"; 
                break;
            case "8 ":
                number="08";
                break;
            case "9 ":
                number="09";
                break;
            case "0 ":
                number="00";
                break;
            default:
                number=s;
                break;
            
                
        }
            
        return number;
    }
    
    public int addZero2(String s){
        String number="";
        int num=0;
        switch(s){
            case "1 ":
                number="1";
                break;
            case "2 ":
                number="2";
                break;
            case "3 ":
                number="3";
                break;
            case "4 ":
                number="4";
                break;
            case "5 ":
                number="5";
                break;
            case "6 ":
                number="6"; 
                break;
            case "7 ":
                number="7"; 
                break;
            case "8 ":
                number="8";
                break;
            case "9 ":
                number="9";
                break;
            case "0 ":
                number="0";
                break;
            default:
                number=s;
                break;
            
                
        }
        num= Integer.parseInt(number);
        return num;
    }
    
    public void HideLabel(JLabel label,int Time){
        Timer t = new Timer(Time, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(false);
            }
        });
        t.setRepeats(false);
        t.start();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblinfo = new javax.swing.JLabel();
        lblQuestion5 = new javax.swing.JLabel();
        lblQuestion4 = new javax.swing.JLabel();
        lblQuestion3 = new javax.swing.JLabel();
        lblQuestion2 = new javax.swing.JLabel();
        lblQuestion1 = new javax.swing.JLabel();
        lblHello = new javax.swing.JLabel();
        lblinfo2 = new javax.swing.JLabel();
        jffans5 = new javax.swing.JFormattedTextField();
        jffans4 = new javax.swing.JFormattedTextField();
        jffans3 = new javax.swing.JFormattedTextField();
        jffans2 = new javax.swing.JFormattedTextField();
        jffans1 = new javax.swing.JFormattedTextField();
        lblStart = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblinfo.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        lblinfo.setForeground(new java.awt.Color(255, 255, 255));
        lblinfo.setText("Answer all questions and click next...");
        getContentPane().add(lblinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        lblQuestion5.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        lblQuestion5.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion5.setText("how old are you??");
        getContentPane().add(lblQuestion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        lblQuestion4.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        lblQuestion4.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion4.setText("how old are you??");
        getContentPane().add(lblQuestion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        lblQuestion3.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        lblQuestion3.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion3.setText("how old are you??");
        getContentPane().add(lblQuestion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        lblQuestion2.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        lblQuestion2.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion2.setText("how old are you??");
        getContentPane().add(lblQuestion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        lblQuestion1.setFont(new java.awt.Font("Avenir Next", 1, 24)); // NOI18N
        lblQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        lblQuestion1.setText("how old are you??");
        getContentPane().add(lblQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        lblHello.setFont(new java.awt.Font("BadaBoom BB", 0, 60)); // NOI18N
        lblHello.setForeground(new java.awt.Color(255, 255, 255));
        lblHello.setText("Hello...!");
        getContentPane().add(lblHello, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 220, -1));

        lblinfo2.setFont(new java.awt.Font("Avenir Next", 0, 30)); // NOI18N
        lblinfo2.setForeground(new java.awt.Color(255, 255, 255));
        lblinfo2.setText("<html>Ok.. <br>You will show some questions in short while. <br> Answer all those questions :) </html>");
        getContentPane().add(lblinfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jffans5.setBackground(new java.awt.Color(51, 51, 51));
        jffans5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jffans5.setColumns(2);
        jffans5.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jffans5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jffans5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jffans5.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jffans5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jffans5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jffans5FocusLost(evt);
            }
        });
        jffans5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jffans5MouseEntered(evt);
            }
        });
        jffans5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jffans5ActionPerformed(evt);
            }
        });
        getContentPane().add(jffans5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 50, 30));

        jffans4.setBackground(new java.awt.Color(51, 51, 51));
        jffans4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jffans4.setColumns(2);
        jffans4.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jffans4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jffans4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jffans4.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jffans4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jffans4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jffans4FocusLost(evt);
            }
        });
        jffans4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jffans4MouseEntered(evt);
            }
        });
        jffans4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jffans4ActionPerformed(evt);
            }
        });
        getContentPane().add(jffans4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 50, 30));

        jffans3.setBackground(new java.awt.Color(51, 51, 51));
        jffans3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jffans3.setColumns(2);
        jffans3.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jffans3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jffans3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jffans3.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jffans3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jffans3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jffans3FocusLost(evt);
            }
        });
        jffans3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jffans3MouseEntered(evt);
            }
        });
        jffans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jffans3ActionPerformed(evt);
            }
        });
        getContentPane().add(jffans3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 50, 30));

        jffans2.setBackground(new java.awt.Color(51, 51, 51));
        jffans2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jffans2.setColumns(2);
        jffans2.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jffans2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jffans2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jffans2.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jffans2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jffans2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jffans2FocusLost(evt);
            }
        });
        jffans2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jffans2MouseEntered(evt);
            }
        });
        jffans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jffans2ActionPerformed(evt);
            }
        });
        getContentPane().add(jffans2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 50, 30));

        jffans1.setBackground(new java.awt.Color(51, 51, 51));
        jffans1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jffans1.setColumns(2);
        jffans1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jffans1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jffans1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jffans1.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jffans1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jffans1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jffans1FocusLost(evt);
            }
        });
        jffans1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jffans1MouseEntered(evt);
            }
        });
        jffans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jffans1ActionPerformed(evt);
            }
        });
        getContentPane().add(jffans1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 50, 30));

        lblStart.setFont(new java.awt.Font("28 Days Later", 0, 50)); // NOI18N
        lblStart.setText("NEXT");
        lblStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblStartMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStartMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStartMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStartMouseEntered(evt);
            }
        });
        getContentPane().add(lblStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        lblClose.setFont(new java.awt.Font("28 Days Later", 1, 24)); // NOI18N
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 20, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/professionalpractise/newimg/menu2.png"))); // NOI18N
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_backgroundMouseDragged

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_backgroundMousePressed

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        // TODO add your handling code here:
        lblClose.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        lblClose.setForeground(Color.LIGHT_GRAY);
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        // TODO add your handling code here:
        setCursor(Cursor.DEFAULT_CURSOR);
        lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.HAND_CURSOR);
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblStartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMousePressed
        // TODO add your handling code here:
        lblStart.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblStartMousePressed

    private void lblStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseClicked
        // TODO add your handling code here:
        
        try{
            int a1=Integer.parseInt(jffans1.getText());
            int a2=Integer.parseInt(jffans2.getText());
            int a3=Integer.parseInt(jffans3.getText());
            int a4=Integer.parseInt(jffans4.getText());
            int a5=Integer.parseInt(jffans5.getText());
            
            Q1=jffans1.getText();
            Q2=jffans2.getText();
            Q3=jffans3.getText();
            Q4=jffans4.getText();
            Q5=jffans5.getText();
            
            memonew3 mm3= new memonew3();
            this.dispose();
            mm3.setVisible(true);
            
            System.out.println(jffans1.getText());
            System.out.println(jffans2.getText());
            System.out.println(jffans3.getText());
            System.out.println(jffans4.getText());
            System.out.println(jffans5.getText());
        }catch(Exception e){
            System.out.println("e");
            MessageBox mb= new MessageBox("Please fill all fields", "Less info provided");
            mb.setVisible(true);
        }
        
        
        
//            System.out.println(jffans1.getText());
//            System.out.println(jffans2.getText());
//            System.out.println(jffans3.getText());
//            System.out.println(jffans4.getText());
//            System.out.println(jffans5.getText());
        
        lblStart.setForeground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_lblStartMouseClicked

    private void lblStartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseExited
        // TODO add your handling code here:
        setCursor(Cursor.DEFAULT_CURSOR);
        lblStart.setForeground(Color.black);
    }//GEN-LAST:event_lblStartMouseExited

    private void lblStartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStartMouseEntered
        // TODO add your handling code here:
        String num = jffans5.getText();
        jffans5.setText(addZero(num));
        setCursor(Cursor.HAND_CURSOR);
        lblStart.setForeground(Color.white);
    }//GEN-LAST:event_lblStartMouseEntered

    private void jffans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jffans1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jffans1ActionPerformed

    private void jffans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jffans2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jffans2ActionPerformed

    private void jffans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jffans3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jffans3ActionPerformed

    private void jffans4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jffans4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jffans4ActionPerformed

    private void jffans5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jffans5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jffans5ActionPerformed

    private void jffans2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans2FocusLost
        //TODO add your handling code here:
        //int num= Integer.parseInt(jffans2.getText());
        
        String num = jffans2.getText();
        addZero(num);
        int x=0;
        if (!"  ".equals(num)) {
            x = addZero2(num);
        }
        //System.out.println(x);
        if (!(x > 0 && x <= 12)) {
            //jffans2.setText("");
        }
        else{
            jffans2.setText(addZero(num));
            
            
        }
//        if (0>num && num>13){
//            System.out.println("hiii");
//        }
    }//GEN-LAST:event_jffans2FocusLost

    private void jffans1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans1FocusLost
        // TODO add your handling code here:
        String num = jffans1.getText();
        addZero(num);
        
        jffans1.setText(addZero(num));
    }//GEN-LAST:event_jffans1FocusLost

    private void jffans3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans3FocusLost
        // TODO add your handling code here:
        String num = jffans3.getText();
        addZero(num);
        int x=0;
        if (!"  ".equals(num)) {
            x = addZero2(num);
        }
        
        //System.out.println(x);
        if (!(x > 0 && x <= 31)) {
            //jffans3.setText("");
            
        }
        else{
            jffans3.setText(addZero(num));
            
        }
        
        
    }//GEN-LAST:event_jffans3FocusLost

    private void jffans4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans4FocusLost
        // TODO add your handling code here:
        String num = jffans4.getText();
        addZero(num);
        
        jffans4.setText(addZero(num));
    }//GEN-LAST:event_jffans4FocusLost

    private void jffans5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans5FocusLost
        // TODO add your handling code here:
        String num = jffans5.getText();
        //addZero(num);
        
        jffans5.setText(addZero(num));
    }//GEN-LAST:event_jffans5FocusLost

    private void jffans1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans1FocusGained
        // TODO add your handling code here:
        //jffans1.setText("");
    }//GEN-LAST:event_jffans1FocusGained

    private void jffans2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans2FocusGained
        // TODO add your handling code here:
        //jffans2.setText("");
    }//GEN-LAST:event_jffans2FocusGained

    private void jffans3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans3FocusGained
        // TODO add your handling code here:
        //jffans3.setText("");
    }//GEN-LAST:event_jffans3FocusGained

    private void jffans4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans4FocusGained
        // TODO add your handling code here:
        //jffans4.setText("");
    }//GEN-LAST:event_jffans4FocusGained

    private void jffans5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jffans5FocusGained
        // TODO add your handling code here:
       // jffans5.setText("");
    }//GEN-LAST:event_jffans5FocusGained

    private void jffans1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jffans1MouseEntered
        // TODO add your handling code here:
        jffans1.requestFocus();
    }//GEN-LAST:event_jffans1MouseEntered

    private void jffans2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jffans2MouseEntered
        // TODO add your handling code here:
         jffans2.requestFocus();
    }//GEN-LAST:event_jffans2MouseEntered

    private void jffans3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jffans3MouseEntered
        // TODO add your handling code here:
         jffans3.requestFocus();
    }//GEN-LAST:event_jffans3MouseEntered

    private void jffans4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jffans4MouseEntered
        // TODO add your handling code here:
         jffans4.requestFocus();
    }//GEN-LAST:event_jffans4MouseEntered

    private void jffans5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jffans5MouseEntered
        // TODO add your handling code here:
         jffans5.requestFocus();
    }//GEN-LAST:event_jffans5MouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("mac".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(memonew2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(memonew2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(memonew2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(memonew2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new memonew2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JFormattedTextField jffans1;
    private javax.swing.JFormattedTextField jffans2;
    private javax.swing.JFormattedTextField jffans3;
    private javax.swing.JFormattedTextField jffans4;
    private javax.swing.JFormattedTextField jffans5;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHello;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblQuestion3;
    private javax.swing.JLabel lblQuestion4;
    private javax.swing.JLabel lblQuestion5;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblinfo;
    private javax.swing.JLabel lblinfo2;
    // End of variables declaration//GEN-END:variables
}
