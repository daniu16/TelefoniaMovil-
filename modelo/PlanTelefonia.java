package modelo;

public class PlanTelefonia {

    private int numCelular;
    private String operador;
    private int cantidadMinuto;
    private double valorMinuto;
    private double costoPlan;

    public PlanTelefonia(int pNumCelular, String pOperador, int pCantidadMinuto, double pValorMinuto) {
        this.numCelular = pNumCelular;
        this.operador = pOperador;
        this.cantidadMinuto = pCantidadMinuto;
        this.valorMinuto = pValorMinuto;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getCantidadMinuto() {
        return cantidadMinuto;
    }

    public void setCantidadMinuto(int cantidadMinuto) {
        this.cantidadMinuto = cantidadMinuto;
    }

    public double getValorMinuto() {
        return valorMinuto;
    }

    public void setValorMinuto(double valorMinuto) {
        this.valorMinuto = valorMinuto;
    }

    public double getCostoPlan() {
        return costoPlan;
    }

    public void setCostoPlan(double costoPlan) {
        this.costoPlan = costoPlan;
    }

    public String obtenerTotalPagar() {
        double total = cantidadMinuto * valorMinuto;
        if (operador.equals("Wom"))
        {
            costoPlan = total / 2; 
        } else {
            costoPlan = total;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Numero de celular: " + numCelular + "\n"+"Operador seleccionado: " + operador + "\n"+"Cantidad de minutos a comprar: " + cantidadMinuto + "\n"+"Precio de los minutos: " + valorMinuto + "\n"+"Costo del plan: " + costoPlan);

        return sb.toString();
    }

    public double getValorMinuto(int indexVendedor) {
        return 0;
    }
}




