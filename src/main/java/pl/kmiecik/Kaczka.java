package pl.kmiecik;

abstract class Kaczka {

    LatanieInterfejs latanieInterfejs;
    KwakanieInterfajs kwakanieInterfajs;

    void setLatanieInterfejs(LatanieInterfejs latanieInterfejs){
        this.latanieInterfejs=latanieInterfejs;
    }

    void setKwakanieInterfajs(KwakanieInterfajs kwakanieInterfajs){
        this.kwakanieInterfajs=kwakanieInterfajs;
    }


    void wykonajKwakanie() {
        kwakanieInterfajs.kwacz();
    }

    void wykonajLatanie() {
        latanieInterfejs.lec();
    }

    abstract void wyswietl();

}
