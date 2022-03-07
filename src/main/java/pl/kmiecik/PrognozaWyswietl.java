package pl.kmiecik;

class PrognozaWyswietl implements Observer,WyswietlElement{

  private float temperatura;
  private float wilgotnosc;
  private Podmiot podmiot;

    public PrognozaWyswietl(Podmiot podmiot) {
        this.podmiot = podmiot;
        podmiot.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temperatura=temp+10;
        this.wilgotnosc=wilgotnosc+10;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("PROGNOZA " + temperatura + " stopni C oraz "+wilgotnosc+ "% wilgotnosci");

    }
}
