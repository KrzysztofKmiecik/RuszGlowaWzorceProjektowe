package pl.kmiecik;

class WarunkiBiezaceWyswietl implements Observer,WyswietlElement{

  private float temperatura;
  private float wilgotnosc;
  private Podmiot podmiot;

    public WarunkiBiezaceWyswietl(Podmiot podmiot) {
        this.podmiot = podmiot;
        podmiot.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
        this.temperatura=temp;
        this.wilgotnosc=wilgotnosc;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("warunki biezace " + temperatura + " stopni C oraz "+wilgotnosc+ "% wilgotnosci");

    }
}
