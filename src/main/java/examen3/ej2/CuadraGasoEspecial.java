package examen3.ej2;

import java.util.Random;

public class CuadraGasoEspecial implements ICuadraGas{

    private int tanque = 0;

    @Override
    public void llenarGas() {
        tanque = new Random().nextInt(50);
    }

    @Override
    public int getEstadoCombustible() {
        return tanque;
    }
}

