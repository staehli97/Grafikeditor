import java.awt.*;

/**
 * Created by vmadmin on 24.03.2016.
 */
public class Linie extends Figur {

    public Linie(int x, int y, int breite, int hoehe) {
        super(x, y, breite, hoehe);
    }

    @Override
    public void zeichne(Graphics g) {
        g.drawLine(super.x, super.y, super.breite, super.hoehe);
    }
}
