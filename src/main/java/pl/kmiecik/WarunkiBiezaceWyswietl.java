package pl.kmiecik;

import java.util.Observable;
import java.util.Observer;

class WarunkiBiezaceWyswietl implements Observer, WyswietlElement {

    private float temperatura;
    private float wilgotnosc;
    private Observable observable;

    public WarunkiBiezaceWyswietl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void wyswietl() {
        System.out.println("warunki biezace " + temperatura + " stopni C oraz " + wilgotnosc + "% wilgotnosci");

    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe) o;
            this.temperatura = danePogodowe.podajTemperature();
            this.wilgotnosc = danePogodowe.podakWilgotnosc();
            wyswietl();
        }
    }
}
