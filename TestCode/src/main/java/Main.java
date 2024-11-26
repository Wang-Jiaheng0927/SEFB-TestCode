import java.awt.*;
import java.awt.event.*;
import individuals.*;

public class Main {				// A class called Main
    public static void main(String[] args){// The program entry point

        //Setting the Frame and Drawing
        Frame frame = new Frame("Wild Reserve Cuddle Warning System");
        Drawing drawing = new Drawing();

        drawing.setSize(600,600);
        drawing.setBackground(Color.BLACK);

        frame.add(drawing);

        frame.setLayout(null);
        frame.setSize(700,700);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}

