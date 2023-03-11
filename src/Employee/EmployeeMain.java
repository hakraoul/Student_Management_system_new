package Employee;

import multiUserLogin.User;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//Mail
import javax.mail.MessagingException;


public class EmployeeMain extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public EmployeeMain() {
        initComponents();
        HomePane.setVisible(true);
        displayUserPanel.setVisible(true);
        userDataPane.setVisible(false);
        displayJDPane.setVisible(false);
        permissionFormPane.setVisible(false);
        permissionpanel.setVisible(false);
        changePWForm.setVisible(false);
        changepasswordPanel.setVisible(false);
        userName.setText(user.username);
    }

    public String email;
    public String password;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        homePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JDPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        changePwPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        closePanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        permissionPanel = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        changePWForm = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tfoldpassword = new javax.swing.JTextField();
        tfNewpassword = new javax.swing.JPasswordField();
        tfconfirmNewPw = new javax.swing.JPasswordField();
        btnChangepw = new javax.swing.JButton();
        btnCancelChange = new javax.swing.JButton();
        changepasswordPanel = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        permissionFormPane = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        tfSubject = new javax.swing.JTextField();
        tfDurattion = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        permissionpanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        displayUserPanel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        HomePane = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        userDataPane = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        departmentLabel = new javax.swing.JLabel();
        positionLabel = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        displayJDPane = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel2.setText("jLabel2");

        jLabel14.setText("jLabel14");

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("G");

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("11");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Human Resource Management System");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("For the brighter Future");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(204, 204, 204))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(290, 290, 290))))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel1))))
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 70));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form/icons8-menu-24.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        homePanel.setOpaque(false);
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homePanelMouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form/icons8-home-page-30.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Home");

        javax.swing.GroupLayout homePanelLayout = new javax.swing.GroupLayout(homePanel);
        homePanel.setLayout(homePanelLayout);
        homePanelLayout.setHorizontalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        homePanelLayout.setVerticalGroup(
                homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(homePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(homePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        JDPanel.setOpaque(false);
        JDPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JDPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JDPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JDPanelMouseExited(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/icons8-profiles-30.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Job Description");

        javax.swing.GroupLayout JDPanelLayout = new javax.swing.GroupLayout(JDPanel);
        JDPanel.setLayout(JDPanelLayout);
        JDPanelLayout.setHorizontalGroup(
                JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JDPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addGap(0, 30, Short.MAX_VALUE))
        );
        JDPanelLayout.setVerticalGroup(
                JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JDPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(JDPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        changePwPanel.setOpaque(false);
        changePwPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePwPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePwPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePwPanelMouseExited(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/icons8-pen-squared-30.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Change Password");

        javax.swing.GroupLayout changePwPanelLayout = new javax.swing.GroupLayout(changePwPanel);
        changePwPanel.setLayout(changePwPanelLayout);
        changePwPanelLayout.setHorizontalGroup(
                changePwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(changePwPanelLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        changePwPanelLayout.setVerticalGroup(
                changePwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(changePwPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(changePwPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        closePanel.setOpaque(false);
        closePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closePanelMouseExited(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form/icons8-macos-close-30.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Logout");

        javax.swing.GroupLayout closePanelLayout = new javax.swing.GroupLayout(closePanel);
        closePanel.setLayout(closePanelLayout);
        closePanelLayout.setHorizontalGroup(
                closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(closePanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)
                                .addGap(0, 102, Short.MAX_VALUE))
        );
        closePanelLayout.setVerticalGroup(
                closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(closePanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(closePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(19, Short.MAX_VALUE))
        );

        permissionPanel.setOpaque(false);
        permissionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                permissionPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                permissionPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                permissionPanelMouseExited(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/icons8-sent-30.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Permission");

        javax.swing.GroupLayout permissionPanelLayout = new javax.swing.GroupLayout(permissionPanel);
        permissionPanel.setLayout(permissionPanelLayout);
        permissionPanelLayout.setHorizontalGroup(
                permissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(permissionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        permissionPanelLayout.setVerticalGroup(
                permissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(permissionPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(permissionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(16, 16, 16))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(changePwPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(closePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addComponent(permissionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JDPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(permissionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(changePwPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(closePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(154, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 210, 570));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form/icons8-menu-24.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap(170, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8)
                                .addContainerGap(530, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, -1, 560));

        changePWForm.setOpaque(false);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setText("Old Password");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setText("New Password");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel29.setText("Confirm Password");

        tfoldpassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfNewpassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        tfconfirmNewPw.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnChangepw.setText("Change");
        btnChangepw.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangepwMouseClicked(evt);
            }
        });

        btnCancelChange.setText("Cancel");
        btnCancelChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelChangeMouseClicked(evt);
            }
        });
        btnCancelChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changePWFormLayout = new javax.swing.GroupLayout(changePWForm);
        changePWForm.setLayout(changePWFormLayout);
        changePWFormLayout.setHorizontalGroup(
                changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(changePWFormLayout.createSequentialGroup()
                                .addGroup(changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(changePWFormLayout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addGroup(changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel27)
                                                        .addComponent(jLabel28)
                                                        .addComponent(jLabel29))
                                                .addGap(77, 77, 77)
                                                .addGroup(changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tfoldpassword)
                                                        .addComponent(tfNewpassword)
                                                        .addComponent(tfconfirmNewPw, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                                        .addGroup(changePWFormLayout.createSequentialGroup()
                                                .addGap(230, 230, 230)
                                                .addComponent(btnChangepw, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(97, 97, 97)
                                                .addComponent(btnCancelChange, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(108, Short.MAX_VALUE))
        );
        changePWFormLayout.setVerticalGroup(
                changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(changePWFormLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(tfoldpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel28)
                                        .addComponent(tfNewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel29)
                                        .addComponent(tfconfirmNewPw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                                .addGroup(changePWFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnChangepw, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCancelChange, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(122, 122, 122))
        );

        jPanel1.add(changePWForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 71, 790, 560));

        changepasswordPanel.setOpaque(false);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/bg_OOP.png"))); // NOI18N
        jLabel26.setText("jLabel26");

        javax.swing.GroupLayout changepasswordPanelLayout = new javax.swing.GroupLayout(changepasswordPanel);
        changepasswordPanel.setLayout(changepasswordPanelLayout);
        changepasswordPanelLayout.setHorizontalGroup(
                changepasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(changepasswordPanelLayout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        changepasswordPanelLayout.setVerticalGroup(
                changepasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(changepasswordPanelLayout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 564, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanel1.add(changepasswordPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 71, 790, 570));

        permissionFormPane.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Username");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Suject");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Duration");

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Message");

        jScrollPane2.setViewportView(jTextPane2);

        btnSubmit.setText("submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    btnSubmitMouseClicked(evt);
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        javax.swing.GroupLayout permissionFormPaneLayout = new javax.swing.GroupLayout(permissionFormPane);
        permissionFormPane.setLayout(permissionFormPaneLayout);
        permissionFormPaneLayout.setHorizontalGroup(
                permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(permissionFormPaneLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addGroup(permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSubmit)
                                        .addGroup(permissionFormPaneLayout.createSequentialGroup()
                                                .addGroup(permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel23)
                                                        .addComponent(jLabel24)
                                                        .addComponent(jLabel25))
                                                .addGap(103, 103, 103)
                                                .addGroup(permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfDurattion, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(118, Short.MAX_VALUE))
        );
        permissionFormPaneLayout.setVerticalGroup(
                permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(permissionFormPaneLayout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel23)
                                        .addComponent(tfSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(tfDurattion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(permissionFormPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel25)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btnSubmit)
                                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(permissionFormPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 71, 790, 560));

        permissionpanel.setOpaque(false);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/bg_OOP.png"))); // NOI18N

        javax.swing.GroupLayout permissionpanelLayout = new javax.swing.GroupLayout(permissionpanel);
        permissionpanel.setLayout(permissionpanelLayout);
        permissionpanelLayout.setHorizontalGroup(
                permissionpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(permissionpanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        permissionpanelLayout.setVerticalGroup(
                permissionpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, permissionpanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(permissionpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 71, 790, 560));

        displayUserPanel.setOpaque(false);

        userName.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        userName.setText("hello");

        javax.swing.GroupLayout displayUserPanelLayout = new javax.swing.GroupLayout(displayUserPanel);
        displayUserPanel.setLayout(displayUserPanelLayout);
        displayUserPanelLayout.setHorizontalGroup(
                displayUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayUserPanelLayout.createSequentialGroup()
                                .addGap(0, 514, Short.MAX_VALUE)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        displayUserPanelLayout.setVerticalGroup(
                displayUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayUserPanelLayout.createSequentialGroup()
                                .addContainerGap(253, Short.MAX_VALUE)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250))
        );

        jPanel1.add(displayUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 71, 790, 560));

        HomePane.setOpaque(false);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Form/bg_OOP_.png"))); // NOI18N
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout HomePaneLayout = new javax.swing.GroupLayout(HomePane);
        HomePane.setLayout(HomePaneLayout);
        HomePaneLayout.setHorizontalGroup(
                HomePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomePaneLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        HomePaneLayout.setVerticalGroup(
                HomePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(HomePaneLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(HomePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 790, 560));

        userDataPane.setBackground(new java.awt.Color(255, 255, 255));
        userDataPane.setOpaque(false);

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameLabel.setText("1");

        idLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        idLabel.setText("2");

        departmentLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        departmentLabel.setText("3");

        positionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        positionLabel.setText("4");

        salaryLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salaryLabel.setText("5");

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailLabel.setText("6");

        javax.swing.GroupLayout userDataPaneLayout = new javax.swing.GroupLayout(userDataPane);
        userDataPane.setLayout(userDataPaneLayout);
        userDataPaneLayout.setHorizontalGroup(
                userDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userDataPaneLayout.createSequentialGroup()
                                .addContainerGap(264, Short.MAX_VALUE)
                                .addGroup(userDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(userDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(positionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(departmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(userDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                                                .addComponent(salaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(164, Short.MAX_VALUE))
        );
        userDataPaneLayout.setVerticalGroup(
                userDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userDataPaneLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(usernameLabel)
                                .addGap(28, 28, 28)
                                .addComponent(idLabel)
                                .addGap(30, 30, 30)
                                .addComponent(departmentLabel)
                                .addGap(33, 33, 33)
                                .addComponent(positionLabel)
                                .addGap(31, 31, 31)
                                .addComponent(salaryLabel)
                                .addGap(33, 33, 33)
                                .addComponent(emailLabel)
                                .addContainerGap(182, Short.MAX_VALUE))
        );

        jPanel1.add(userDataPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 71, 790, 560));

        displayJDPane.setOpaque(false);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employee/bg_OOP_JD.png"))); // NOI18N

        javax.swing.GroupLayout displayJDPaneLayout = new javax.swing.GroupLayout(displayJDPane);
        displayJDPane.setLayout(displayJDPaneLayout);
        displayJDPaneLayout.setHorizontalGroup(
                displayJDPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(displayJDPaneLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        displayJDPaneLayout.setVerticalGroup(
                displayJDPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(displayJDPaneLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(displayJDPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 790, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {
        if(x==0){
            jPanel2.show();
            jPanel2.setSize(x,552);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i=0;i<=x;i++){
                            Thread.sleep(1);
                            jPanel2.setSize(i,552);
                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=210;
        }
    }

    private void closePanelMouseExited(java.awt.event.MouseEvent evt) {
        resestlabelcolor(closePanel);
    }

    private void closePanelMouseEntered(java.awt.event.MouseEvent evt) {
        labelColor(closePanel);
    }

    private void closePanelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        System.exit(0);
    }

    private void changePwPanelMouseExited(java.awt.event.MouseEvent evt) {
        resestlabelcolor(changePwPanel);
    }

    private void changePwPanelMouseEntered(java.awt.event.MouseEvent evt) {
        labelColor(changePwPanel);
    }

    private void changePwPanelMouseClicked(java.awt.event.MouseEvent evt) {
        HomePane.setVisible(false);
        displayUserPanel.setVisible(false);
        userDataPane.setVisible(false);
        displayJDPane.setVisible(false);
        permissionFormPane.setVisible(false);
        permissionpanel.setVisible(false);
        changePWForm.setVisible(true);
        changepasswordPanel.setVisible(true);
    }

    private void JDPanelMouseExited(java.awt.event.MouseEvent evt) {
        resestlabelcolor(JDPanel);
    }

    private void JDPanelMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        labelColor(JDPanel);
    }

    private void JDPanelMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        HomePane.setVisible(false);
        displayUserPanel.setVisible(false);
        userDataPane.setVisible(true);
        displayJDPane.setVisible(true);
        permissionFormPane.setVisible(false);
        permissionpanel.setVisible(false);
        changePWForm.setVisible(false);
        changepasswordPanel.setVisible(false);
        //Set value
        usernameLabel.setText(user.username);
        idLabel.setText(user.ID);
        departmentLabel.setText(user.department);
        positionLabel.setText(user.position);
        salaryLabel.setText(user.salary);
        emailLabel.setText(user.email);

    }

    private void homePanelMouseExited(java.awt.event.MouseEvent evt) {
        resestlabelcolor(homePanel);
    }

    private void homePanelMouseEntered(java.awt.event.MouseEvent evt) {
        labelColor(homePanel);
    }

    private void homePanelMouseClicked(java.awt.event.MouseEvent evt) {
        //user = getAuthenticatedUser("da@gmail.com","12345");
        HomePane.setVisible(true);
        displayUserPanel.setVisible(true);
        userDataPane.setVisible(false);
        displayJDPane.setVisible(false);
        permissionFormPane.setVisible(false);
        permissionpanel.setVisible(false);
        changePWForm.setVisible(false);
        changepasswordPanel.setVisible(false);
        userName.setText(user.username);
    }

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {
        //resestlabelcolor(jLabel2);
    }

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {
        //labelColor(jLabel2);
    }

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {
        if(x==210){
            jPanel2.setSize(210,552);
            Thread th = new Thread(){
                @Override
                public void run(){
                    try{
                        for(int i=210;i>=0;i--){
                            Thread.sleep(1);
                            jPanel2.setSize(i,552);
                        }
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };th.start();
            x=0;
        }
    }

    private void permissionPanelMouseExited(java.awt.event.MouseEvent evt) {
        resestlabelcolor(permissionPanel);
    }

    private void permissionPanelMouseEntered(java.awt.event.MouseEvent evt) {
        labelColor(permissionPanel);
    }

    private void permissionPanelMouseClicked(java.awt.event.MouseEvent evt) {
        HomePane.setVisible(false);
        displayUserPanel.setVisible(false);
        userDataPane.setVisible(false);
        displayJDPane.setVisible(false);
        permissionFormPane.setVisible(true);
        permissionpanel.setVisible(true);
        changePWForm.setVisible(false);
        changepasswordPanel.setVisible(false);

        tfUsername.setText(user.username);

    }

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnSubmitMouseClicked(java.awt.event.MouseEvent evt) throws MessagingException {
        // TODO add your handling code here:
        String reason = jTextPane2.getText();
        String subject = tfSubject.getText();
        String duration = tfDurattion.getText();
        String name = tfUsername.getText();
        EmailPermission.main("curryhak12@gmail.com",reason,subject,duration,name);
    }

    private void btnCancelChangeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnChangepwMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        String oldPassword = tfoldpassword.getText();
        String confirmPasword = tfconfirmNewPw.getText();
        String NewPassword = tfNewpassword.getText();

        if(oldPassword.equals(user.password)){
            if(NewPassword.equals(confirmPasword)){
                final String DB_URL = "jdbc:mysql://localhost/oop";
                final String USERNAME = "root";
                final String PASSWORD = "";

                try{
                    Connection conn = DriverManager.getConnection(DB_URL, USERNAME,PASSWORD);
                    //Connection to database successfull...

                    Statement stmt = conn.createStatement();
                    String sql = "update user set password ='"+NewPassword+"' where email='"+user.email+"'";
                    PreparedStatement preparedStatement = conn.prepareStatement(sql);
                    preparedStatement.executeUpdate();
                    JOptionPane.showMessageDialog(this, "updated successfully");
                    stmt.close();
                    conn.close();

                }catch (Exception e){
                    e.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(this,"Please confirm password again...");
                tfconfirmNewPw.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"Old password don't match...");
            tfoldpassword.setText("");
        }
    }

    private void btnCancelChangeMouseClicked(java.awt.event.MouseEvent evt) {
        JOptionPane.showMessageDialog(this,"Change has been canceled!!!");
        tfoldpassword.setText("");
        tfconfirmNewPw.setText("");
        tfNewpassword.setText("");
    }
    int x = 210;
    //Sets the image to be displayed as an icon
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeMain().setVisible(true);
            }
        });
    }
    public static void setData(String email,String password){
        GetData obj = new GetData();
        user = obj.getAuthenticatedEmployee(email,password);
        user.email = email;
        user.password = password;
    }
    public static User user;



    // Variables declaration - do not modify
    private javax.swing.JPanel HomePane;
    private javax.swing.JPanel JDPanel;
    private javax.swing.JButton btnCancelChange;
    private javax.swing.JButton btnChangepw;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JPanel changePWForm;
    private javax.swing.JPanel changePwPanel;
    private javax.swing.JPanel changepasswordPanel;
    private javax.swing.JPanel closePanel;
    private javax.swing.JLabel departmentLabel;
    private javax.swing.JPanel displayJDPane;
    private javax.swing.JPanel displayUserPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JPanel permissionFormPane;
    private javax.swing.JPanel permissionPanel;
    private javax.swing.JPanel permissionpanel;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField tfSubject;
    private javax.swing.JTextField tfDurattion;
    private javax.swing.JTextField tfoldpassword;
    private javax.swing.JTextField tfNewpassword;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JTextField tfconfirmNewPw;
    private javax.swing.JPanel userDataPane;
    private javax.swing.JLabel userName;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration
    private void labelColor(JPanel label){
        label.setBackground(new Color(0,102,255));
    }
    private void resestlabelcolor(JPanel label){
        label.setBackground(new Color(0,153,255));
    }
}
