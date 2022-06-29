package examen3.ej2;

import java.util.Random;

public class CuadraAdapter implements ICuadraGas{

    private CuadraElectrico cuadraElectrico;

    public CuadraAdapter(CuadraElectrico cuadraElectrico) {
        this.cuadraElectrico = cuadraElectrico;
    }

    @Override
    public void llenarGas() {
        cuadraElectrico.cargar();
    }

    @Override
    public int getEstadoCombustible() {
        return cuadraElectrico.getEstadoElectricidad();
    }
}
