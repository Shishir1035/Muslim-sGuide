package muslimsguide;

/**
 *
 * @author SHISHIR
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
        AlarmClock Fajr,Dhuhr,Asr,Maghrib,Isha;
        Fajr = new AlarmClock();
        Fajr.initalarm("Fajr",3,38);
        
        Dhuhr = new AlarmClock();
        Dhuhr.initalarm("Dhuhr",11,50);
        
        Asr = new AlarmClock();
        Asr.initalarm("Asr",3,14);
        
        Maghrib = new AlarmClock();
        Maghrib.initalarm("Maghrib",6,34);
        
        Isha = new AlarmClock();
        Isha.initalarm("Isha",1,11);
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

        HadithText = new javax.swing.JLabel();
        HadithLabel = new javax.swing.JLabel();
        DateText = new javax.swing.JLabel();
        ZillaText = new javax.swing.JLabel();
        IftarText = new javax.swing.JLabel();
        SahriText = new javax.swing.JLabel();
        CurrentWaqt = new javax.swing.JLabel();
        RemainingTimeText = new javax.swing.JLabel();
        AlarmButton = new javax.swing.JButton();
        TasbihButton = new javax.swing.JButton();
        QHButton = new javax.swing.JButton();
        MosqueButton = new javax.swing.JButton();
        CommunityButton = new javax.swing.JButton();
        HomeBGimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HadithText.setBackground(new java.awt.Color(153, 153, 255));
        HadithText.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        HadithText.setForeground(new java.awt.Color(255, 255, 255));
        HadithText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HadithText.setText("Daily Hadith Goes Here");
        getContentPane().add(HadithText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 40));

        HadithLabel.setBackground(new java.awt.Color(0, 0, 0));
        HadithLabel.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(HadithLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 852, 60));

        DateText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        DateText.setForeground(new java.awt.Color(0, 204, 153));
        DateText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DateText.setText("Date : 17 / 5 / 2022");
        getContentPane().add(DateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 50));

        ZillaText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ZillaText.setForeground(new java.awt.Color(0, 204, 153));
        ZillaText.setText("Zilla : Sylhet");
        getContentPane().add(ZillaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, 50));

        IftarText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        IftarText.setForeground(new java.awt.Color(0, 204, 153));
        IftarText.setText("Iftar : 6 : 30 pm");
        getContentPane().add(IftarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 160, 40));

        SahriText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SahriText.setForeground(new java.awt.Color(0, 204, 153));
        SahriText.setText("Sahri : 4 : 30");
        getContentPane().add(SahriText, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 226, 120, 30));

        CurrentWaqt.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        CurrentWaqt.setForeground(new java.awt.Color(0, 255, 153));
        CurrentWaqt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentWaqt.setText("Isha");
        getContentPane().add(CurrentWaqt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 350, 50));

        RemainingTimeText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        RemainingTimeText.setForeground(new java.awt.Color(204, 0, 0));
        RemainingTimeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemainingTimeText.setText("Remaining Time : XX : XX");
        getContentPane().add(RemainingTimeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 170, 370, 50));

        AlarmButton.setBackground(new java.awt.Color(0, 153, 102));
        AlarmButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        AlarmButton.setText("Alarm");
        AlarmButton.setBorder(new javax.swing.border.MatteBorder(null));
        AlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlarmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AlarmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 122, 70));

        TasbihButton.setBackground(new java.awt.Color(0, 153, 102));
        TasbihButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        TasbihButton.setText("Tasbih");
        TasbihButton.setToolTipText("");
        TasbihButton.setBorder(new javax.swing.border.MatteBorder(null));
        TasbihButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasbihButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TasbihButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 122, 70));

        QHButton.setBackground(new java.awt.Color(0, 153, 102));
        QHButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        QHButton.setText("Quran & Hadith");
        QHButton.setBorder(new javax.swing.border.MatteBorder(null));
        QHButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        QHButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QHButtonActionPerformed(evt);
            }
        });
        getContentPane().add(QHButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 122, 70));

        MosqueButton.setBackground(new java.awt.Color(0, 153, 102));
        MosqueButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        MosqueButton.setText("Mosque");
        MosqueButton.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(MosqueButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 122, 70));

        CommunityButton.setBackground(new java.awt.Color(0, 153, 102));
        CommunityButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        CommunityButton.setText("Community");
        CommunityButton.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(CommunityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 122, 70));

        HomeBGimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muslimsguide/Hnet.com-image (1).png"))); // NOI18N
        getContentPane().add(HomeBGimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 852, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlarmButtonActionPerformed
        // TODO add your handling code here:
        Alarm lrm = new Alarm();
        lrm.show();
//        dispose();
    }//GEN-LAST:event_AlarmButtonActionPerformed

    private void TasbihButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasbihButtonActionPerformed
        // TODO add your handling code here:
        Tasbih tasbh = new Tasbih();
        tasbh.show();
//        dispose();
    }//GEN-LAST:event_TasbihButtonActionPerformed

    private void QHButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QHButtonActionPerformed
        // TODO add your handling code here:
        QuranHadith qh = new QuranHadith();
        qh.show();
//        dispose();
    }//GEN-LAST:event_QHButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlarmButton;
    private javax.swing.JButton CommunityButton;
    private javax.swing.JLabel CurrentWaqt;
    private javax.swing.JLabel DateText;
    private javax.swing.JLabel HadithLabel;
    private javax.swing.JLabel HadithText;
    private javax.swing.JLabel HomeBGimg;
    private javax.swing.JLabel IftarText;
    private javax.swing.JButton MosqueButton;
    private javax.swing.JButton QHButton;
    private javax.swing.JLabel RemainingTimeText;
    private javax.swing.JLabel SahriText;
    private javax.swing.JButton TasbihButton;
    private javax.swing.JLabel ZillaText;
    // End of variables declaration//GEN-END:variables
}
