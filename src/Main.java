import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    }

    public static < N extends Nombre< N > > Nombre< N > somme( ArrayList< N > tableau ) {
        if (tableau.isEmpty()) {
            return null;
        }
        N total = tableau.get(0);
        for (int i = 1; i < tableau.size(); ++i) {
            total = total.add(tableau.get(i));
        }
        return total;
    }
}