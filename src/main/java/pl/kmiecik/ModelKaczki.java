package pl.kmiecik;

class ModelKaczki extends Kaczka{

    public ModelKaczki() {
        latanieInterfejs=new NieLatam();
        kwakanieInterfajs=new Kwacz();
    }

    @Override
    void wyswietl() {
        System.out.println("Jestem modelem kaczki");
    }
}
