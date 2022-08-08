package studentmanagement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainForm extends javax.swing.JFrame {
    
    private QLSVPanel mStudentPanel;
    private GPAManagementPanel mGPAPanel;
    
    public MainForm() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH); //Phong to toi da kich thuoc cua mainForm
        //loginDialog dialog = new loginDialog(this, true);
        //dialog.setVisible(true);  // Hien thi hop thoai dang nhap
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        tbrLogout = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        QLSVbigIcon = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        GPAiconBig = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        tbrAboutUs = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        tplMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        HeThong = new javax.swing.JMenu();
        mnuLogout = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        Thoat = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnQuanLy = new javax.swing.JMenu();
        muQLSV = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuManageGPA = new javax.swing.JMenuItem();
        TroGiup = new javax.swing.JMenu();
        NoiDung = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        gioithieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phần mềm Quản lý sinh viên");

        jToolBar1.setBackground(new java.awt.Color(0, 51, 255));
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator11);

        tbrLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/logout-icon-32.png"))); // NOI18N
        tbrLogout.setText("Đăng xuất");
        tbrLogout.setFocusable(false);
        tbrLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLogout.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                tbrLogoutAncestorRemoved(evt);
            }
        });
        tbrLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLogout);
        jToolBar1.add(jSeparator6);

        QLSVbigIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/10207-man-student-light-skin-tone-icon-32.png"))); // NOI18N
        QLSVbigIcon.setText("Quán lý sinh viên");
        QLSVbigIcon.setFocusable(false);
        QLSVbigIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        QLSVbigIcon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        QLSVbigIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QLSVbigIconActionPerformed(evt);
            }
        });
        jToolBar1.add(QLSVbigIcon);
        jToolBar1.add(jSeparator8);

        GPAiconBig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/gpa-icon-32.png"))); // NOI18N
        GPAiconBig.setText("Quản lý điểm");
        GPAiconBig.setFocusable(false);
        GPAiconBig.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GPAiconBig.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        GPAiconBig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GPAiconBigActionPerformed(evt);
            }
        });
        jToolBar1.add(GPAiconBig);
        jToolBar1.add(jSeparator9);

        tbrAboutUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/Actions-help-about-icon-32.png"))); // NOI18N
        tbrAboutUs.setText("Giới thiệu");
        tbrAboutUs.setFocusable(false);
        tbrAboutUs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrAboutUs.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrAboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrAboutUsActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrAboutUs);
        jToolBar1.add(jSeparator10);

        tplMainBoard.setBackground(new java.awt.Color(255, 255, 255));

        HeThong.setBackground(new java.awt.Color(255, 153, 0));
        HeThong.setText("Hệ thống");

        mnuLogout.setBackground(new java.awt.Color(255, 153, 0));
        mnuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/logout-icon-16.png"))); // NOI18N
        mnuLogout.setText("Đăng xuất");
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        HeThong.add(mnuLogout);
        HeThong.add(jSeparator1);

        Thoat.setBackground(new java.awt.Color(255, 153, 0));
        Thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/Actions-edit-delete-icon-16.png"))); // NOI18N
        Thoat.setText("Thoát");
        Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatActionPerformed(evt);
            }
        });
        HeThong.add(Thoat);
        HeThong.add(jSeparator12);

        jMenuBar1.add(HeThong);

        mnQuanLy.setText("Quản lý");

        muQLSV.setBackground(new java.awt.Color(255, 153, 0));
        muQLSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/10207-man-student-light-skin-tone-icon-16.png"))); // NOI18N
        muQLSV.setText("Quản lý sinh viên");
        muQLSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muQLSVActionPerformed(evt);
            }
        });
        mnQuanLy.add(muQLSV);
        mnQuanLy.add(jSeparator2);

        mnuManageGPA.setBackground(new java.awt.Color(255, 153, 0));
        mnuManageGPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/gpa-icon.png"))); // NOI18N
        mnuManageGPA.setText("Quản lý điểm");
        mnuManageGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageGPAActionPerformed(evt);
            }
        });
        mnQuanLy.add(mnuManageGPA);

        jMenuBar1.add(mnQuanLy);

        TroGiup.setText("Trợ giúp");

        NoiDung.setBackground(new java.awt.Color(255, 153, 0));
        NoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/Actions-help-about-icon-16.png"))); // NOI18N
        NoiDung.setText("Nội dung");
        NoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoiDungActionPerformed(evt);
            }
        });
        TroGiup.add(NoiDung);
        TroGiup.add(jSeparator3);

        gioithieu.setBackground(new java.awt.Color(255, 153, 0));
        gioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconset4/Help-icon-16.png"))); // NOI18N
        gioithieu.setText("Giới thiệu");
        gioithieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gioithieuActionPerformed(evt);
            }
        });
        TroGiup.add(gioithieu);

        jMenuBar1.add(TroGiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tplMainBoard)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ThoatActionPerformed

    private void tbrAboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrAboutUsActionPerformed
        AboutUsDialog aboutUsDialog = new AboutUsDialog(this, true);
        aboutUsDialog.setVisible(true);
    }//GEN-LAST:event_tbrAboutUsActionPerformed

    private void muQLSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muQLSVActionPerformed
        if(mStudentPanel == null){
        mStudentPanel = new QLSVPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/iconset4/10207-man-student-light-skin-tone-icon-16.png"));
        tplMainBoard.addTab("Quản lý sinh viên", icon, mStudentPanel, "Quản lý sinh viên");
        }
        tplMainBoard.setSelectedComponent(mStudentPanel);   
    }//GEN-LAST:event_muQLSVActionPerformed

    private void mnuManageGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageGPAActionPerformed
        if(mGPAPanel == null){
            mGPAPanel = new  GPAManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/iconset4/gpa-icon.png"));
            tplMainBoard.addTab("Quản lý điểm", icon,mGPAPanel,"Quản lý điểm" );
        }
        tplMainBoard.setSelectedComponent(mGPAPanel);
    }//GEN-LAST:event_mnuManageGPAActionPerformed

    private void tbrLogoutAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbrLogoutAncestorRemoved

    }//GEN-LAST:event_tbrLogoutAncestorRemoved

    private void tbrLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLogoutActionPerformed
        this.dispose();  // Dong cua so
        new loginDialog(this, true).setVisible(true);
    }//GEN-LAST:event_tbrLogoutActionPerformed

    private void QLSVbigIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QLSVbigIconActionPerformed
        if(mStudentPanel == null){
        mStudentPanel = new QLSVPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/iconset4/10207-man-student-light-skin-tone-icon-16.png"));
        tplMainBoard.addTab("Quản lý sinh viên", icon, mStudentPanel, "Quản lý sinh viên");
        }
        tplMainBoard.setSelectedComponent(mStudentPanel);
    }//GEN-LAST:event_QLSVbigIconActionPerformed

    private void GPAiconBigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GPAiconBigActionPerformed
        if(mGPAPanel == null){
            mGPAPanel = new  GPAManagementPanel();
            ImageIcon icon = new ImageIcon(getClass().getResource("/iconset4/gpa-icon.png"));
            tplMainBoard.addTab("Quản lý điểm", icon,mGPAPanel,"Quản lý điểm" );
        }
        tplMainBoard.setSelectedComponent(mGPAPanel);
    }//GEN-LAST:event_GPAiconBigActionPerformed

    private void gioithieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gioithieuActionPerformed
        AboutUsDialog aboutUsDialog = new AboutUsDialog(this, true);
        aboutUsDialog.setVisible(true);
    }//GEN-LAST:event_gioithieuActionPerformed

    private void NoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoiDungActionPerformed
        IntroContent introContent =  new IntroContent(this, true);
        introContent.setVisible(true);
    }//GEN-LAST:event_NoiDungActionPerformed

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        this.dispose();  // Dong cua so
        new loginDialog(this, true).setVisible(true);
    }//GEN-LAST:event_mnuLogoutActionPerformed
    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GPAiconBig;
    private javax.swing.JMenu HeThong;
    private javax.swing.JMenuItem NoiDung;
    private javax.swing.JButton QLSVbigIcon;
    private javax.swing.JMenuItem Thoat;
    private javax.swing.JMenu TroGiup;
    private javax.swing.JMenuItem gioithieu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnQuanLy;
    private javax.swing.JMenuItem mnuLogout;
    private javax.swing.JMenuItem mnuManageGPA;
    private javax.swing.JMenuItem muQLSV;
    private javax.swing.JButton tbrAboutUs;
    private javax.swing.JButton tbrLogout;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
