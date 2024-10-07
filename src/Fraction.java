public class Fraction implements Nombre<Fraction> {
    private final double numerateur, denominateur;

    public Fraction(double numerateur, double denominateur) {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    @Override
    public Fraction add(Fraction autre) {
        return new Fraction(this.numerateur * autre.denominateur + this.denominateur * autre.numerateur,
                this.denominateur * autre.denominateur);
    }

    @Override
    public Fraction sub(Fraction autre) {
        return new Fraction(this.numerateur * autre.denominateur - this.denominateur * autre.numerateur,
                this.denominateur * autre.denominateur);
    }

    @Override
    public Fraction mul(Fraction autre) {
        return new Fraction(this.numerateur * autre.numerateur,
                this.denominateur * autre.denominateur);
    }

    @Override
    public Fraction div(Fraction autre) {
        return new Fraction(this.numerateur * autre.denominateur,
                this.denominateur * autre.numerateur);

    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerateur=" + numerateur +
                ", denominateur=" + denominateur +
                '}';
    }
}
