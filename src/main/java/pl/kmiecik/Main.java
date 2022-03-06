package pl.kmiecik;

class Main {
    public static void main(String[] args) {

/*        Kaczka kaczka = new DzikaKaczka();
        kaczka.wykonajKwakanie();
        kaczka.wykonajLatanie();*/

        Kaczka kaczka2 =new ModelKaczki();
        kaczka2.wykonajKwakanie();
        kaczka2.wykonajLatanie();
        LatanieInterfejs rakieta=new LecZNapedemRakietowym();
        kaczka2.setLatanieInterfejs(rakieta);
        kaczka2.wykonajKwakanie();
        kaczka2.wykonajLatanie();

    }
}
