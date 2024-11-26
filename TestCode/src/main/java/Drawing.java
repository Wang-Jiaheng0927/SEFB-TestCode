import java.awt.*;
import Shape.*;

public class Drawing extends Canvas {
    // Field of three dots
    private circle k_c; // circle dot for keepers
    private circle k_l; // circle dot for lions
    private square m_s; //square dot for monitors

    public Drawing() {
        k_c = new circle(2, Color.BLUE, new Point());
        k_l = new circle(3, Color.RED, new Point());
        m_s = new square(3, Color.BLACK, new Point());
    }

    @Override
    public void paint(Graphics g) {
        k_c.draw(g);
        k_l.draw(g);
        m_s.draw(g);
    }
}
