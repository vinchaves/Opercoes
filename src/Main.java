import classes.Contas;
import classes.OperacaoMatematica;
import classes.Soma;

import static classes.Contas.mostrarCalculo;

public class Main {
    public static void main(String[] args) {
        Contas contas = new Contas();

        contas.mostrarCalculo(new Soma());


        Soma s = new Soma();
        s.calcular(2,3);




    }
}
