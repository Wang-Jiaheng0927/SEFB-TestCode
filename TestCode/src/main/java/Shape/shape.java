package Shape;//Abstract superclass from which Shape.circle and Shape.square inherit
import java.awt.*;

public abstract class shape {
    //protected field for subclasses to inherit
    protected Color color;
    protected Point p;

    public shape(Color color, Point p) {
        this.color = color;
        this.p = p;
    }

    //abstract method that subclasses have to determine
    public abstract void draw(Graphics g);
}
