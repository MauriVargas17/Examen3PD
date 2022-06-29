package examen3.ej2;

public class Client {
    public static void main(String[] args){
        CuadraAdapter e1 = new CuadraAdapter(new CuadraElectrico());
        CuadraGasolina g1 = new CuadraGasolina();

        e1.llenarGas();
        System.out.println(e1.getEstadoCombustible());
        g1.llenarGas();
        System.out.println(g1.getEstadoCombustible());
    }
}
