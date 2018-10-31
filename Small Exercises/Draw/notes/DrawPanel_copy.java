import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class DrawPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private ArrayList<Point> points;
    private ArrayList<Color> colors;
    private ArrayList<Float> fontsizes;

    public DrawPanel() {
        points = new ArrayList<Point>();
        colors = new ArrayList<>();
        fontsizes = new ArrayList<>();

        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                points.add(new Point(e.getX(), e.getY()));
                colors.add(new Color((int)(Math.random() * 0x1000000)));
                fontsizes.add((float) (Math.random() * 25) + 15);
                repaint();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.red);

        for (int i = 0; i < points.size(); i++) {
            g2.setFont(g.getFont().deriveFont(fontsizes.get(i)));
            g2.setColor(colors.get(i));
            g2.drawString("26", points.get(i).x, points.get(i).y);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.add(new DrawPanel());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }

}