class BitaSmietana extends SkladnikDekorator{

    Napoj napoj;

    public BitaSmietana(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt()+1;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis()+" z Bita smietana";
    }
}
