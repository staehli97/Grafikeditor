import java.awt.*;

/**
 * Created by vmadmin on 26.03.2016.
 */
public class Ellipse extends Figur {
    public Ellipse(int x, int y, int breite, int hoehe) {
        super(x, y, breite, hoehe);
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawOval(super.x, super.y, super.breite, super.hoehe);
    }
}
