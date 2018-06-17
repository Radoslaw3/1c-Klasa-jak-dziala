import java.io.FileNotFoundException;
import java.io.IOException;

public class Menu {
    public void wyswietlMenu() {
        System.out.println("Zaczynamy Menu");

        PlikiBinarne plikiBinarne = new PlikiBinarne();

        Sklep sklep = new Sklep();

        try {
            sklep = plikiBinarne.wczytaj();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Blad podczas odczytu, startujemy z pustym sklepem");
            e.printStackTrace();
            sklep = new Sklep();
        }

        Auto nissanPrimera;
        nissanPrimera = new Auto(1,"Primera SRI",1600,117,"niebieski");
            sklep.dodajAuto(nissanPrimera);
        nissanPrimera = new Auto(2,"Primera GT",2000,150,"czerwony");
           sklep.dodajAuto(nissanPrimera);



        sklep.wyswietlAuta();


    }
}
