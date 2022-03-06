package pl.kmiecik;

class DzikaKaczka extends Kaczka {


    public DzikaKaczka() {
        latanieInterfejs = new LatamBoMamSkrzydla();
        kwakanieInterfajs = new Kwacz();
    }

    @Override
    void wyswietl() {
        System.out.println("Jestem dzika kaczka");
    }
}
