package entities;

public class DolarProgram {
    public double dolarpreco;
    public double dolarpedido;
    public double valortotal;

    public double getValortotal() {
        double valortotal = (dolarpedido * dolarpreco)  * 1.06;
        return valortotal;
    }
}
