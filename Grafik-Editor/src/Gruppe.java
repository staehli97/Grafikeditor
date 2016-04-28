import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vmadmin on 31.03.2016.
 */
public class Gruppe extends Figur{
    private List<Figur> figuren = new ArrayList<Figur>();
    public Gruppe(int x, int y, int breite, int hoehe) {
        super(x, y, breite, hoehe);
    }

    @Override
    public void zeichne(Graphics g) {

    }

}
