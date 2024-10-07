public class NDouble implements Nombre<NDouble>{
    private final double valeur;

    public NDouble(double valeur) {
        this.valeur = valeur;
    }
    @Override
    public NDouble add(NDouble autre) {
        return new NDouble(this.valeur + autre.valeur);
    }

    @Override
    public NDouble sub(NDouble autre) {
        return new NDouble(this.valeur - autre.valeur);
    }

    @Override
    public NDouble mul(NDouble autre) {
        return new NDouble(this.valeur * autre.valeur);
    }

    @Override
    public NDouble div(NDouble autre) {
        assert autre.valeur != 0.0;
        return new NDouble(this.valeur / autre.valeur);
    }

    @Override
    public String toString() {
        return "NDouble{" +
                "valeur=" + valeur +
                '}';
    }
}
