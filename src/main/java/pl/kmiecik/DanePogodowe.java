package pl.kmiecik;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class DanePogodowe implements Podmiot {

    List<Observer> obserwatorzy;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
        this.obserwatorzy = new ArrayList<>();
    }

    @Override
    public void zarejestrujObserwatora(Observer observer) {
        obserwatorzy.add(observer);
    }

    @Override
    public void skasujObserwatora(Observer observer) {

      /*  int index = obserwatorzy.indexOf(observer);
        if (index >= 0) {
            obserwatorzy.remove(observer);
        }*/

        Boolean aBoolean = Optional.of(obserwatorzy.remove(observer)).orElseGet(() -> false);
        System.out.println(aBoolean);
    }

    @Override
    public void powiadomObserwatorow() {

      /*  for (int i = 0; i < obserwatorzy.size() ; i++) {
            Observer observer = obserwatorzy.get(i);
            observer.aktualizacja(this.temperatura,this.wilgotnosc,this.cisnienie);
        }*/

       /* for(Observer observer:obserwatorzy){
            observer.aktualizacja(this.temperatura,this.wilgotnosc,this.cisnienie);
        }*/

        obserwatorzy.forEach(observer -> observer.aktualizacja(this.temperatura, this.wilgotnosc, this.cisnienie));

    }

    public void odczytyZmiana() {
        powiadomObserwatorow();
    }


    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }
}
