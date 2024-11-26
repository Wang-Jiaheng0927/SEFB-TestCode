package Shape;

import java.awt.*;

public class square extends shape {
    private int side;

    public square(int side, Color color, Point p) {
        super(color, p);
        this.side = side;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(p.x, p.y, side, side);
    }
}
