class Czekolada extends SkladnikDekorator{

  Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt()+5;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis()+" z Czekolada ";

    }
}
