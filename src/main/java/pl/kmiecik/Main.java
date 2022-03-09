package pl.kmiecik;

class Main {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezaceWyswietl warunkiBiezaceWyswietl = new WarunkiBiezaceWyswietl(danePogodowe);
        PrognozaWyswietl prognozaWyswietl = new PrognozaWyswietl(danePogodowe);

        //  danePogodowe.skasujObserwatora(warunkiBiezaceWyswietl);

        danePogodowe.ustawOdczyty(26.6f, 65, 1013.1f);
        danePogodowe.ustawOdczyty(27.7f, 70, 997.0f);
        danePogodowe.ustawOdczyty(25.5f, 95, 997.0f);

    }
}
