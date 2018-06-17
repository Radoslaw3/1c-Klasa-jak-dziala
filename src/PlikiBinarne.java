import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PlikiBinarne {

    public void zapisz(){

    }

    public Sklep wczytaj() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("sklep.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Sklep sklep = (Sklep) ois.readObject();

        ois.close();
        fis.close();

        return sklep;
    }

}
