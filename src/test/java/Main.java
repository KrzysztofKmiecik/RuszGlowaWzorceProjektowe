import javax.print.attribute.standard.MediaSize;

class Main {
    public static void main(String[] args) {
      /*  Napoj mojeExpresso=new Expresso();
        mojeExpresso=new Czekolada(mojeExpresso);
        mojeExpresso=new BitaSmietana(mojeExpresso);*/

        Napoj mojeExpresso=new BitaSmietana(new Czekolada(new Expresso()));

        String opis = mojeExpresso.getOpis();
        double koszt = mojeExpresso.koszt();
        System.out.println("opis " + opis + "  koszt: " + koszt);

    }
}
