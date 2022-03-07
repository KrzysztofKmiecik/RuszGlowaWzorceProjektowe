package pl.kmiecik;

public interface Podmiot {
    void zarejestrujObserwatora(Observer observer);
    void skasujObserwatora(Observer observer);
    void powiadomObserwatorow();
}
