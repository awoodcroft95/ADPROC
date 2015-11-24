/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pipes_R_Us;

import java.util.ArrayList;

/**
 *
 * @author UP730799, UP733640
 */
public class Pipes_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Pipes_GUI
     */
    private double length;
    private double diameter;
    private int grade;
    private boolean insu;
    private boolean rein;
    private boolean chem;
    private int colour;
    private int numOfPipes;
    ArrayList<Pipe> userOrder = new ArrayList<Pipe>();
    private String orderText = "";
    private boolean orderSubmitted;
    private double orderCost;

    public Pipes_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Insulation = new javax.swing.JCheckBox();
        colourDropDown = new javax.swing.JComboBox();
        Rein = new javax.swing.JCheckBox();
        Chem = new javax.swing.JCheckBox();
        gradeSelection = new javax.swing.JComboBox();
        noOfPipesInput = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        addOrder = new javax.swing.JButton();
        lengthInput = new javax.swing.JTextField();
        diameterInput = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextPane9 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        orderBox = new javax.swing.JLabel();
        statusBox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Piper Order");

        colourDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No Colour(Grey)", "1 Colour", "2 Colour" }));

        gradeSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        submit.setText("Submit Order");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        addOrder.setText("Create Additonal Order");
        addOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderActionPerformed(evt);
            }
        });

        jTextPane9.setBackground(java.awt.SystemColor.control);
        jTextPane9.setBorder(null);
        jTextPane9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextPane9.setText("Pipe Order");
        jScrollPane9.setViewportView(jTextPane9);

        jLabel1.setText("Pipe Diameter(in)");

        jLabel2.setText("Pipe Length(m)");

        jLabel3.setText("Plastic Grade");

        jLabel4.setText("Colour");

        jLabel5.setText("Inner Insulation");

        jLabel6.setText("Outer Reinforcement");

        jLabel7.setText("Chemical Resistance");

        jLabel8.setText("Number Of Pipes");

        orderBox.setBackground(new java.awt.Color(255, 255, 255));
        orderBox.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        orderBox.setText("User Order");
        orderBox.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        orderBox.setAutoscrolls(true);
        orderBox.setOpaque(true);

        statusBox.setBackground(new java.awt.Color(255, 255, 255));
        statusBox.setAutoscrolls(true);
        statusBox.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        statusBox.setOpaque(true);
        statusBox.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(gradeSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(colourDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Insulation)
                                        .addComponent(Chem)
                                        .addComponent(lengthInput)
                                        .addComponent(diameterInput, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Rein))
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(submit)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(noOfPipesInput, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addOrder))
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(orderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diameterInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lengthInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gradeSelection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(colourDropDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Insulation, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rein, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Chem, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(noOfPipesInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submit)
                            .addComponent(addOrder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusBox, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                    .addComponent(orderBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        diameterInput.getAccessibleContext().setAccessibleName("Diamater Input");
        statusBox.getAccessibleContext().setAccessibleName("Status Box");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderActionPerformed
        if (isEmpty()) {
            statusBox.setText("Please enter values for length, diameter and number of pipes before adding an order.");
        } else {
            orderProcess();
            resetWindow();
        }
    }//GEN-LAST:event_addOrderActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        orderSubmitted = true;
        if (isEmpty()) {
            addOrder.setEnabled(false);
            submit.setEnabled(false);
        } else {
            orderProcess();
            resetWindow();
            addOrder.setEnabled(false);
            submit.setEnabled(false);
        }
    }//GEN-LAST:event_submitActionPerformed

    public void getInputs() {
        diameter = Double.parseDouble(diameterInput.getText());
        length = Double.parseDouble(lengthInput.getText());
        colour = colourDropDown.getSelectedIndex();
        grade = gradeSelection.getSelectedIndex() + 1;
        numOfPipes = Integer.parseInt(noOfPipesInput.getText());
        insu = Insulation.isSelected();
        chem = Chem.isSelected();
        rein = Rein.isSelected();
    }

    public boolean validInputs() {
        int nVC = 0; // nVC stand for not vaild count, it counts the number of non valid inputs if this is greater than 0 then this method returns false
        if (diameter < 0.1 || diameter > 30) {
            nVC = nVC + 1;
        }
        if (length < 0.05 || length > 20) {
            nVC = nVC + 1;
        }
        if (numOfPipes < 1) {
            nVC = nVC + 1;
        }
        if (nVC >= 1) {
            return false;
        } else {
            return true;
        }
    }

    public void orderProcess() {
        this.getInputs();
        if (validInputs()) {
            this.calcType();
            for (int i = 0; i < userOrder.size(); i++) {
                userOrder.get(i).calculateCost();
                orderWindowUpdate();
            }
        } else {
            statusBox.setText("Please enter valid inputs for diameter, length and number of pipes");
        }
    }

    public boolean isEmpty() {
        if ("".equals(diameterInput.getText())) {
            return true;
        } else if ("".equals(lengthInput.getText())) {
            return true;
        } else if ("".equals(noOfPipesInput.getText())) {
            return true;
        } else {
            return false;
        }
    }

    public void calcType() {
        if ((grade <= 3 & grade > 0) & (colour == 0) & (!insu) & (!rein)) {
            Pipe1 newPipe = new Pipe1(grade, chem, length, diameter, numOfPipes);
            userOrder.add(newPipe);
            this.statusBoxUpdate();
        } else if ((grade <= 4 & grade > 1) & (colour <= 1) & (!insu) & (!rein)) {
            Pipe2 newPipe = new Pipe2(grade, chem, colour, length, diameter, numOfPipes);
            userOrder.add(newPipe);
            this.statusBoxUpdate();
        } else if ((grade <= 5 & grade > 1) & (colour <= 2) & (!insu) & (!rein)) {
            Pipe3 newPipe = new Pipe3(grade, chem, colour, length, diameter, numOfPipes);
            userOrder.add(newPipe);
            this.statusBoxUpdate();
        } else if ((grade <= 5 & grade > 1) & (colour <= 2) & (!rein)) {
            Pipe4 newPipe = new Pipe4(grade, insu, chem, colour, length, diameter, numOfPipes);
            userOrder.add(newPipe);
            this.statusBoxUpdate();
        } else if ((grade <= 5 & grade > 2) & (colour <= 2)) {
            Pipe5 newPipe = new Pipe5(grade, insu, rein, chem, colour, length, diameter, numOfPipes);
            userOrder.add(newPipe);
            this.statusBoxUpdate();
        } else {
            statusBox.setText("<html>Not A Valid Pipe,  Please adjust your order </html>");
        }
    }

    public void orderWindowUpdate() {
        orderText = "";
        orderCost = 0.0;
        for (int i = 0; i < userOrder.size(); i++) {
            orderText = orderText + "<br> <br>" + userOrder.get(i).returnInfo();
            orderCost = orderCost + userOrder.get(i).getCost();
        }
        if (orderSubmitted) {
            orderBox.setText("<html>User Order" + "<br>" + orderText + "<br> Total Cost = £" + orderCost + "</html>");
        } else {
            orderBox.setText("<html>User Order" + "<br>" + orderText + "</html>");
        }
    }

    public void statusBoxUpdate() {
        statusBox.setText("Order Added");
    }

    public void resetWindow() {
        diameterInput.setText("");
        lengthInput.setText("");
        noOfPipesInput.setText("");
        colourDropDown.setSelectedIndex(0);
        gradeSelection.setSelectedIndex(0);
        Insulation.setSelected(false);
        Chem.setSelected(false);
        Rein.setSelected(false);
    }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pipes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pipes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pipes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pipes_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pipes_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Chem;
    private javax.swing.JCheckBox Insulation;
    private javax.swing.JCheckBox Rein;
    private javax.swing.JButton addOrder;
    private javax.swing.JComboBox colourDropDown;
    private javax.swing.JTextField diameterInput;
    private javax.swing.JComboBox gradeSelection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextPane jTextPane9;
    private javax.swing.JTextField lengthInput;
    private javax.swing.JTextField noOfPipesInput;
    private javax.swing.JLabel orderBox;
    private javax.swing.JLabel statusBox;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
