package main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.RenderingHints;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class MainUtamaBaru extends JFrame {

    private JLabel lbTime;
    private JLabel lbDate;

    public MainUtamaBaru() {
        initComponents();
        setClock();
    }

    private void initComponents() {
        setTitle("MyApp - Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 530);
        setMinimumSize(new Dimension(900, 530));
        setLocationRelativeTo(null);

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(Color.WHITE);

        JPanel sidebar = createSidebar();
        JPanel content = createContent();

        root.add(sidebar, BorderLayout.WEST);
        root.add(content, BorderLayout.CENTER);

        add(root);
    }

    private JPanel createSidebar() {
        JPanel sidebar = new JPanel(null);
        sidebar.setPreferredSize(new Dimension(150, 530));
        sidebar.setBackground(new Color(246, 248, 251));
        sidebar.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, new Color(230, 234, 240)));

        JLabel menuIcon = new JLabel("≡");
        menuIcon.setFont(new Font("SansSerif", Font.BOLD, 16));
        menuIcon.setForeground(new Color(60, 70, 80));
        menuIcon.setHorizontalAlignment(SwingConstants.CENTER);
        menuIcon.setBounds(122, 30, 18, 18);
        sidebar.add(menuIcon);

        RoundedPanel profileCard = new RoundedPanel(12, new Color(222, 243, 255));
        profileCard.setLayout(null);
        profileCard.setBounds(10, 65, 128, 50);

        AvatarLabel avatar = new AvatarLabel();
        avatar.setBounds(16, 12, 26, 26);
        profileCard.add(avatar);

        JLabel name = new JLabel("Perry ...");
        name.setFont(new Font("SansSerif", Font.BOLD, 12));
        name.setForeground(new Color(45, 52, 60));
        name.setBounds(50, 10, 65, 16);
        profileCard.add(name);

        JLabel role = new JLabel("Administr...");
        role.setFont(new Font("SansSerif", Font.PLAIN, 9));
        role.setForeground(new Color(80, 90, 100));
        role.setBounds(50, 25, 70, 14);
        profileCard.add(role);

        JLabel arrow = new JLabel("⌄");
        arrow.setFont(new Font("SansSerif", Font.BOLD, 12));
        arrow.setForeground(new Color(60, 70, 80));
        arrow.setBounds(112, 15, 15, 15);
        profileCard.add(arrow);

        sidebar.add(profileCard);

        JPanel line = new JPanel();
        line.setBackground(new Color(222, 227, 235));
        line.setBounds(10, 136, 128, 1);
        sidebar.add(line);

        sidebar.add(createSidebarMenu("▣  Shipment", 158, true));
        sidebar.add(createSidebarMenu("♟  Courier", 192, false));
        sidebar.add(createSidebarMenu("◇  Parcel", 226, false));

        CircleButton leftArrow = new CircleButton("←");
        leftArrow.setBounds(16, 244, 45, 45);
        sidebar.add(leftArrow);

        JLabel settings = new JLabel("⚙ Settings");
        settings.setFont(new Font("SansSerif", Font.BOLD, 11));
        settings.setForeground(new Color(45, 52, 60));
        settings.setBounds(22, 462, 100, 18);
        sidebar.add(settings);

        RoundedPanel timePanel = new RoundedPanel(4, new Color(238, 241, 246));
        timePanel.setLayout(null);
        timePanel.setBounds(10, 488, 128, 31);

        lbTime = new JLabel("22:03:57", SwingConstants.CENTER);
        lbTime.setFont(new Font("SansSerif", Font.BOLD, 12));
        lbTime.setForeground(new Color(40, 45, 50));
        lbTime.setBounds(0, 4, 128, 14);
        timePanel.add(lbTime);

        lbDate = new JLabel("08/06/2025", SwingConstants.CENTER);
        lbDate.setFont(new Font("SansSerif", Font.PLAIN, 8));
        lbDate.setForeground(new Color(90, 95, 100));
        lbDate.setBounds(0, 18, 128, 10);
        timePanel.add(lbDate);

        sidebar.add(timePanel);

        return sidebar;
    }

    private JLabel createSidebarMenu(String text, int y, boolean active) {
        JLabel label = new JLabel(text);
        label.setFont(new Font("SansSerif", Font.BOLD, 11));
        label.setForeground(active ? new Color(35, 42, 50) : new Color(70, 78, 88));
        label.setBounds(22, y, 110, 22);
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
        return label;
    }

    private JPanel createContent() {
        JPanel content = new JPanel(null);
        content.setBackground(Color.WHITE);

        JLabel title = new JLabel("☵ Shipment Management");
        title.setFont(new Font("SansSerif", Font.PLAIN, 20));
        title.setForeground(new Color(50, 55, 60));
        title.setBounds(12, 38, 330, 28);
        content.add(title);

        JTextField search = createSearchField();
        search.setBounds(12, 80, 168, 24);
        content.add(search);

        JButton createButton = new JButton("+  Create New Shipment");
        createButton.setFont(new Font("SansSerif", Font.PLAIN, 11));
        createButton.setForeground(new Color(22, 135, 75));
        createButton.setBackground(new Color(214, 250, 226));
        createButton.setFocusPainted(false);
        createButton.setBorder(BorderFactory.createEmptyBorder());
        createButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        createButton.setBounds(192, 80, 154, 24);
        content.add(createButton);

        JComboBox<String> typeBox = new JComboBox<>(new String[]{
            "Shipment Type", "Domestic", "International"
        });
        styleComboBox(typeBox);
        typeBox.setBounds(358, 80, 154, 24);
        content.add(typeBox);

        JComboBox<String> statusBox = new JComboBox<>(new String[]{
            "Shipment Status", "Waiting Confirmation", "Confirmed", "Delivered"
        });
        styleComboBox(statusBox);
        statusBox.setBounds(524, 80, 154, 24);
        content.add(statusBox);

        JTable table = createTable();
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(12, 114, 720, 307);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(210, 218, 228)));
        scrollPane.getViewport().setBackground(Color.WHITE);
        content.add(scrollPane);

        JButton previous = createPageButton("‹", false);
        previous.setBounds(338, 432, 20, 20);
        content.add(previous);

        JButton pageOne = createPageButton("1", true);
        pageOne.setBounds(362, 432, 20, 20);
        content.add(pageOne);

        JButton next = createPageButton("›", false);
        next.setBounds(386, 432, 20, 20);
        content.add(next);

        JLabel pageInfo = new JLabel("1/1", SwingConstants.CENTER);
        pageInfo.setFont(new Font("SansSerif", Font.PLAIN, 11));
        pageInfo.setForeground(new Color(60, 65, 70));
        pageInfo.setBounds(352, 455, 45, 18);
        content.add(pageInfo);

        CircleButton rightArrow = new CircleButton("→");
        rightArrow.setBounds(690, 244, 45, 45);
        content.add(rightArrow);

        return content;
    }

    private JTextField createSearchField() {
        JTextField field = new JTextField("⌕  Search");
        field.setFont(new Font("SansSerif", Font.PLAIN, 11));
        field.setForeground(new Color(120, 130, 140));
        field.setBackground(Color.WHITE);
        field.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(210, 218, 228)),
                new EmptyBorder(0, 8, 0, 8)
        ));

        field.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (field.getText().equals("⌕  Search")) {
                    field.setText("");
                    field.setForeground(new Color(40, 45, 50));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (field.getText().trim().isEmpty()) {
                    field.setText("⌕  Search");
                    field.setForeground(new Color(120, 130, 140));
                }
            }
        });

        return field;
    }

    private void styleComboBox(JComboBox<String> comboBox) {
        comboBox.setFont(new Font("SansSerif", Font.PLAIN, 11));
        comboBox.setForeground(new Color(55, 65, 75));
        comboBox.setBackground(Color.WHITE);
        comboBox.setBorder(BorderFactory.createLineBorder(new Color(210, 218, 228)));
        comboBox.setFocusable(false);
    }

    private JTable createTable() {
        String[] columns = {
            "Tracking Number",
            "Destination",
            "Type",
            "Status",
            "Date Creat...",
            "Date Edited",
            "Action"
        };

        Object[][] data = {
            {
                "CTF1",
                "jln3, city, state 40124, Indonesia",
                "Domestic",
                "Waiting Confirmation",
                "08-06-2025",
                "08-06-2025",
                "✎     ■"
            }
        };

        DefaultTableModel model = new DefaultTableModel(data, columns) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(model);
        table.setRowHeight(34);
        table.setFont(new Font("SansSerif", Font.PLAIN, 11));
        table.setForeground(new Color(45, 52, 60));
        table.setBackground(Color.WHITE);
        table.setGridColor(new Color(232, 236, 242));
        table.setShowGrid(true);
        table.setSelectionBackground(new Color(245, 248, 252));
        table.setSelectionForeground(new Color(45, 52, 60));

        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("SansSerif", Font.BOLD, 11));
        header.setForeground(new Color(35, 42, 50));
        header.setBackground(new Color(247, 249, 252));
        header.setPreferredSize(new Dimension(header.getWidth(), 34));
        header.setBorder(BorderFactory.createLineBorder(new Color(220, 226, 235)));

        table.getColumnModel().getColumn(0).setPreferredWidth(110);
        table.getColumnModel().getColumn(1).setPreferredWidth(190);
        table.getColumnModel().getColumn(2).setPreferredWidth(80);
        table.getColumnModel().getColumn(3).setPreferredWidth(130);
        table.getColumnModel().getColumn(4).setPreferredWidth(95);
        table.getColumnModel().getColumn(5).setPreferredWidth(95);
        table.getColumnModel().getColumn(6).setPreferredWidth(70);

        DefaultTableCellRenderer normalRenderer = new DefaultTableCellRenderer();
        normalRenderer.setBorder(new EmptyBorder(0, 6, 0, 6));
        normalRenderer.setFont(new Font("SansSerif", Font.PLAIN, 11));

        for (int i = 0; i < table.getColumnCount(); i++) {
            if (i != 3) {
                table.getColumnModel().getColumn(i).setCellRenderer(normalRenderer);
            }
        }

        table.getColumnModel().getColumn(3).setCellRenderer(new StatusRenderer());
        table.getColumnModel().getColumn(6).setCellRenderer(new ActionRenderer());

        return table;
    }

    private JButton createPageButton(String text, boolean active) {
        JButton button = new JButton(text);
        button.setFont(new Font("SansSerif", Font.BOLD, 11));
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.setBorder(BorderFactory.createLineBorder(new Color(230, 234, 240)));

        if (active) {
            button.setBackground(new Color(30, 120, 220));
            button.setForeground(Color.WHITE);
        } else {
            button.setBackground(new Color(248, 250, 252));
            button.setForeground(new Color(170, 178, 188));
        }

        return button;
    }

    private void setClock() {
        Timer timer = new Timer(1000, e -> {
            Date now = new Date();

            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            lbTime.setText(timeFormat.format(now));
            lbDate.setText(dateFormat.format(now));
        });

        timer.start();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainUtamaBaru().setVisible(true);
        });
    }

    private static class RoundedPanel extends JPanel {

        private final int radius;
        private final Color backgroundColor;

        public RoundedPanel(int radius, Color backgroundColor) {
            this.radius = radius;
            this.backgroundColor = backgroundColor;
            setOpaque(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(backgroundColor);
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

            g2.dispose();
            super.paintComponent(g);
        }
    }

    private static class CircleButton extends JButton {

        public CircleButton(String text) {
            super(text);
            setFont(new Font("SansSerif", Font.PLAIN, 30));
            setForeground(Color.WHITE);
            setFocusPainted(false);
            setBorderPainted(false);
            setContentAreaFilled(false);
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(new Color(58, 58, 58));
            g2.fillOval(0, 0, getWidth(), getHeight());

            g2.dispose();
            super.paintComponent(g);
        }
    }

    private static class AvatarLabel extends JLabel {

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(new Color(220, 225, 230));
            g2.fillOval(0, 0, getWidth(), getHeight());

            g2.setColor(Color.WHITE);
            g2.fillOval(8, 6, 10, 10);
            g2.fillOval(5, 16, 16, 12);

            g2.dispose();
        }
    }

    private static class StatusRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(
                JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column
        ) {
            JPanel panel = new JPanel(new GridBagLayout());
            panel.setBackground(Color.WHITE);

            JLabel label = new JLabel(value == null ? "" : value.toString());
            label.setFont(new Font("SansSerif", Font.PLAIN, 10));
            label.setForeground(new Color(155, 115, 20));
            label.setOpaque(true);
            label.setBackground(new Color(246, 224, 165));
            label.setBorder(new EmptyBorder(2, 8, 2, 8));

            panel.add(label);

            return panel;
        }
    }

    private static class ActionRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(
                JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column
        ) {
            JLabel label = new JLabel(value == null ? "" : value.toString(), SwingConstants.CENTER);
            label.setFont(new Font("SansSerif", Font.BOLD, 13));
            label.setForeground(new Color(25, 30, 35));
            label.setBackground(Color.WHITE);
            label.setOpaque(true);
            return label;
        }
    }
}