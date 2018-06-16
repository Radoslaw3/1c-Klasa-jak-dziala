import java.util.ArrayList;
import java.util.Collections;

public class Sklep {
//    public Collections<Auto> auta;
    private ArrayList auta;

    void dodajAuto(Auto jakiesAuto){
        this.auta = new ArrayList<>();
        auta.add(jakiesAuto);

    }


    public void wyswietlAuta() {
        for(Object temp : auta ){
            System.out.println(temp);
        }


    }
}
