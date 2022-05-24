/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package muslimsguide;

/**
 *
 * @author SHISHIR
 */
public class Alarm extends javax.swing.JFrame {

    /**
     * Creates new form Alarm
     */
    public Alarm() {
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

        FajrTime = new javax.swing.JLabel();
        FajrText = new javax.swing.JLabel();
        AlarmTitlePanel = new javax.swing.JPanel();
        AlarmHeadline = new javax.swing.JLabel();
        FajrLabel = new javax.swing.JLabel();
        DhuhrText = new javax.swing.JLabel();
        DhuhrTime = new javax.swing.JLabel();
        ZuhrLabel = new javax.swing.JLabel();
        AsrTime = new javax.swing.JLabel();
        AsrText = new javax.swing.JLabel();
        AsrLabel = new javax.swing.JLabel();
        MaghribText = new javax.swing.JLabel();
        MaghribTime = new javax.swing.JLabel();
        MaghribLabel = new javax.swing.JLabel();
        IshaTime = new javax.swing.JLabel();
        IshaText = new javax.swing.JLabel();
        IshaLabel = new javax.swing.JLabel();
        AlarmPanel = new javax.swing.JPanel();
        FajrText1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FajrTime.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FajrTime.setForeground(new java.awt.Color(0, 0, 0));
        FajrTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FajrTime.setText("3:39 A.M");
        getContentPane().add(FajrTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        FajrText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FajrText.setForeground(new java.awt.Color(0, 0, 0));
        FajrText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FajrText.setText("Fajr");
        getContentPane().add(FajrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, 30));

        AlarmTitlePanel.setBackground(new java.awt.Color(0, 204, 204));
        AlarmTitlePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AlarmHeadline.setBackground(new java.awt.Color(0, 204, 204));
        AlarmHeadline.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        AlarmHeadline.setForeground(new java.awt.Color(0, 0, 0));
        AlarmHeadline.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AlarmHeadline.setText("Alarm");

        javax.swing.GroupLayout AlarmTitlePanelLayout = new javax.swing.GroupLayout(AlarmTitlePanel);
        AlarmTitlePanel.setLayout(AlarmTitlePanelLayout);
        AlarmTitlePanelLayout.setHorizontalGroup(
            AlarmTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlarmTitlePanelLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(AlarmHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(368, Short.MAX_VALUE))
        );
        AlarmTitlePanelLayout.setVerticalGroup(
            AlarmTitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlarmTitlePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AlarmHeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(AlarmTitlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 852, 60));

        FajrLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FajrLabel.setForeground(new java.awt.Color(0, 0, 0));
        FajrLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(FajrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 852, 84));

        DhuhrText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DhuhrText.setForeground(new java.awt.Color(0, 0, 0));
        DhuhrText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DhuhrText.setText("Dhuhr");
        getContentPane().add(DhuhrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        DhuhrTime.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        DhuhrTime.setForeground(new java.awt.Color(0, 0, 0));
        DhuhrTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DhuhrTime.setText("11:50 A.M");
        getContentPane().add(DhuhrTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, -1, -1));

        ZuhrLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ZuhrLabel.setForeground(new java.awt.Color(0, 0, 0));
        ZuhrLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(ZuhrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 144, 852, 84));

        AsrTime.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AsrTime.setForeground(new java.awt.Color(0, 0, 0));
        AsrTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AsrTime.setText("3:14 P.M");
        getContentPane().add(AsrTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, -1));

        AsrText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AsrText.setForeground(new java.awt.Color(0, 0, 0));
        AsrText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AsrText.setText("Asr");
        getContentPane().add(AsrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        AsrLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        AsrLabel.setForeground(new java.awt.Color(0, 0, 0));
        AsrLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(AsrLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 228, 852, 84));

        MaghribText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MaghribText.setForeground(new java.awt.Color(0, 0, 0));
        MaghribText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaghribText.setText("Maghrib");
        getContentPane().add(MaghribText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        MaghribTime.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MaghribTime.setForeground(new java.awt.Color(0, 0, 0));
        MaghribTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaghribTime.setText("6:34 P.M");
        getContentPane().add(MaghribTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 340, -1, -1));

        MaghribLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        MaghribLabel.setForeground(new java.awt.Color(0, 0, 0));
        MaghribLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaghribLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(MaghribLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 312, 852, 84));

        IshaTime.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        IshaTime.setForeground(new java.awt.Color(0, 0, 0));
        IshaTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IshaTime.setText("8:00 P.M");
        getContentPane().add(IshaTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        IshaText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        IshaText.setForeground(new java.awt.Color(0, 0, 0));
        IshaText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IshaText.setText("Isha");
        getContentPane().add(IshaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        IshaLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        IshaLabel.setForeground(new java.awt.Color(0, 0, 0));
        IshaLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        getContentPane().add(IshaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 396, 852, 84));

        AlarmPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout AlarmPanelLayout = new javax.swing.GroupLayout(AlarmPanel);
        AlarmPanel.setLayout(AlarmPanelLayout);
        AlarmPanelLayout.setHorizontalGroup(
            AlarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        AlarmPanelLayout.setVerticalGroup(
            AlarmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        getContentPane().add(AlarmPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 852, 420));

        FajrText1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        FajrText1.setForeground(new java.awt.Color(0, 0, 0));
        FajrText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FajrText1.setText("Fajr");
        getContentPane().add(FajrText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Alarm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Alarm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Alarm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Alarm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Alarm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlarmHeadline;
    private javax.swing.JPanel AlarmPanel;
    private javax.swing.JPanel AlarmTitlePanel;
    private javax.swing.JLabel AsrLabel;
    private javax.swing.JLabel AsrText;
    private javax.swing.JLabel AsrTime;
    private javax.swing.JLabel DhuhrText;
    private javax.swing.JLabel DhuhrTime;
    private javax.swing.JLabel FajrLabel;
    private javax.swing.JLabel FajrText;
    private javax.swing.JLabel FajrText1;
    private javax.swing.JLabel FajrTime;
    private javax.swing.JLabel IshaLabel;
    private javax.swing.JLabel IshaText;
    private javax.swing.JLabel IshaTime;
    private javax.swing.JLabel MaghribLabel;
    private javax.swing.JLabel MaghribText;
    private javax.swing.JLabel MaghribTime;
    private javax.swing.JLabel ZuhrLabel;
    // End of variables declaration//GEN-END:variables
}
