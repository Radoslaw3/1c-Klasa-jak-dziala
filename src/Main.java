public class Main {
    public static void main(String[] args) {
        System.out.println("Zaczynamy Main");

        Menu menu = new Menu();

        Auto nissanPrimera = new Auto(1,"Primera",2000,150,"niebieski");
        System.out.println(nissanPrimera);

        Sklep sklep = new Sklep();
        sklep.dodajAuto(nissanPrimera);

        sklep.wyswietlAuta();


        //        public int metoda1(){
//            int m1_wartosc = 10;
//
//            return;
//        }

    }
}
