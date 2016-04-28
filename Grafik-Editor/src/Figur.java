import java.awt.*;

/**
 * Created by vmadmin on 26.03.2016.
 */
public abstract class Figur {
    protected int x;
    protected int y;
    protected int breite;
    protected int hoehe;

    public Figur(int x, int y, int breite, int hoehe) {
        this.x = x;
        this.y = y;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }
    public abstract void zeichne(Graphics g);


}
