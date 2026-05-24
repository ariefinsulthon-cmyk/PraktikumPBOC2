/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;
    
import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Cursor;
    import java.awt.Font;
    import java.text.SimpleDateFormat;
    import java.util.Date;
    import java.util.Locale;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;
    import javax.swing.Timer;
    import javax.swing.SwingConstants;
    import javax.swing.BorderFactory;
/**
 *
 * @author USER
 */
public class MainUtama extends javax.swing.JFrame {
    
    private JPanel main;
    private JPanel sidebar;
    private JPanel header;
    private JPanel content;
    private JLabel lbProfileName;
    private JLabel lbDate;

    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainUtama.class.getName());

    /**
     * Creates new form MainUtama
     */
    public MainUtama() {
        initComponents();
        setDate();
    }

    private void initComponents() {
        setTitle("Aplikasi Perpustakaan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 720);
        setLocationRelativeTo(null);

        main = new JPanel(new BorderLayout());
        main.setBackground(Color.WHITE);

        sidebar = new JPanel();
        sidebar.setBackground(new Color(33, 91, 242));
        sidebar.setLayout(null);
        sidebar.setPreferredSize(new java.awt.Dimension(250, 720));

        JLabel title = new JLabel("PERPUSTAKAAN");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("SansSerif", Font.BOLD, 20));
        title.setBounds(25, 30, 200, 30);
        sidebar.add(title);

        JLabel subtitle = new JLabel("Menu Utama");
        subtitle.setForeground(new Color(220, 230, 255));
        subtitle.setFont(new Font("SansSerif", Font.PLAIN, 13));
        subtitle.setBounds(25, 60, 200, 25);
        sidebar.add(subtitle);

        addMenuButton("Dashboard", 120);
        addMenuButton("Data Anggota", 170);
        addMenuButton("Data Buku", 220);
        addMenuButton("Peminjaman", 270);
        addMenuButton("Pengembalian", 320);
        addMenuButton("Laporan", 370);
        addMenuButton("Logout", 600);

        JPanel rightPanel = new JPanel(new BorderLayout());
        rightPanel.setBackground(Color.WHITE);

        header = new JPanel(new BorderLayout());
        header.setBackground(Color.WHITE);
        header.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));
        header.setPreferredSize(new java.awt.Dimension(850, 75));

        JLabel pageTitle = new JLabel("Dashboard");
        pageTitle.setFont(new Font("SansSerif", Font.BOLD, 22));
        pageTitle.setForeground(new Color(40, 40, 40));

        JPanel profilePanel = new JPanel(new BorderLayout());
        profilePanel.setBackground(Color.WHITE);

        lbProfileName = new JLabel("Nama User");
        lbProfileName.setFont(new Font("SansSerif", Font.BOLD, 14));
        lbProfileName.setForeground(new Color(80, 80, 80));
        lbProfileName.setHorizontalAlignment(SwingConstants.RIGHT);

        lbDate = new JLabel("Tanggal");
        lbDate.setFont(new Font("SansSerif", Font.PLAIN, 11));
        lbDate.setForeground(new Color(120, 120, 120));
        lbDate.setHorizontalAlignment(SwingConstants.RIGHT);

        profilePanel.add(lbProfileName, BorderLayout.NORTH);
        profilePanel.add(lbDate, BorderLayout.SOUTH);

        header.add(pageTitle, BorderLayout.WEST);
        header.add(profilePanel, BorderLayout.EAST);

        content = new JPanel();
        content.setBackground(new Color(245, 247, 251));
        content.setBorder(BorderFactory.createEmptyBorder(25, 25, 25, 25));
        content.setLayout(new BorderLayout());

        JLabel welcome = new JLabel("Selamat Datang di Sistem Perpustakaan", SwingConstants.CENTER);
        welcome.setFont(new Font("SansSerif", Font.BOLD, 24));
        welcome.setForeground(new Color(50, 50, 50));

        JLabel desc = new JLabel("Silakan pilih menu di sebelah kiri.", SwingConstants.CENTER);
        desc.setFont(new Font("SansSerif", Font.PLAIN, 15));
        desc.setForeground(new Color(100, 100, 100));

        JPanel card = new JPanel(new BorderLayout());
        card.setBackground(Color.WHITE);
        card.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(230, 230, 230)),
                BorderFactory.createEmptyBorder(40, 40, 40, 40)
        ));

        card.add(welcome, BorderLayout.CENTER);
        card.add(desc, BorderLayout.SOUTH);

        content.add(card, BorderLayout.CENTER);

        rightPanel.add(header, BorderLayout.NORTH);
        rightPanel.add(content, BorderLayout.CENTER);

        main.add(sidebar, BorderLayout.WEST);
        main.add(rightPanel, BorderLayout.CENTER);

        add(main);
    }

    private void addMenuButton(String text, int y) {
        JButton button = new JButton(text);
        button.setBounds(20, y, 210, 38);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.setFont(new Font("SansSerif", Font.BOLD, 14));
        button.setForeground(Color.WHITE);
        button.setBackground(new Color(33, 91, 242));

        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(20, 70, 200));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(33, 91, 242));
            }
        });

        sidebar.add(button);
    }

    private void setDate() {
        Timer timer = new Timer(1000, e -> {
            Date now = new Date();
            SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", new Locale("id", "ID"));
            SimpleDateFormat formatTanggal = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            lbDate.setText(formatHari.format(now) + ", " + formatTanggal.format(now));
        });

        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainUtama().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
