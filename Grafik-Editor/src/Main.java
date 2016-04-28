/**
 * Created by vmadmin on 24.03.2016.
 */
public class Main {
    private static  final Display display= new Display();
    public static void main(String[] args) {
        

        Kreis k= new Kreis(50,50,20,20);
        Rechteck r= new Rechteck(180,140,100,200);
        Linie l= new Linie(100,100,50,100);
        Ellipse e= new Ellipse(300,350,80,100);
        display.hinzufuegen(r);
        display.hinzufuegen(k);
        display.hinzufuegen(l);
        display.hinzufuegen(e);

    }
}
