package Shape;

import java.awt.*;

public class circle extends shape {
    private int radius;

    public circle(int radius, Color color, Point p) {
        super(color, p);
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(p.x, p.y, radius * 2, radius * 2);
    }
}
