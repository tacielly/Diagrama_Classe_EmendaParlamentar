public class Valor extends Emenda {
    private int valorEmpenhado;
    private int valorPago;
    private int valorLiquidado;
    private double valorRestosInscritos;
    private double valorRestosCancelados;
    private double valorRestosPagos;

    public Valor(String funcao, String subfuncao, String programaOrcamentario,
                 String acaoOrcamentaria, String planoOrcamentario,
                 int anoEmenda, String tipoEmenda, String autorEmenda,
                String numeroEmenda, String localidadeGasto, String codigoEmenda, boolean possuiApoiador,
                 int valorEmpenhado, int valorPago, int valorLiquidado,
                 double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos) {

        super(funcao, subfuncao, programaOrcamentario, acaoOrcamentaria, planoOrcamentario,
              anoEmenda, tipoEmenda, autorEmenda, numeroEmenda, localidadeGasto, codigoEmenda, possuiApoiador);

        this.valorEmpenhado = valorEmpenhado;
        this.valorPago = valorPago;
        this.valorLiquidado = valorLiquidado;
        this.valorRestosInscritos = valorRestosInscritos;
        this.valorRestosCancelados = valorRestosCancelados;
        this.valorRestosPagos = valorRestosPagos;
    }

    public int getValorEmpenhado() { 
        return this.valorEmpenhado;
    }

    public void setValorEmpenhado(int valorEmpenhado) {
        this.valorEmpenhado = valorEmpenhado;
    }

    public int getValorPago() { 
        return this.valorPago; 
    }

    public void setValorPago(int valorPago) {
        this.valorPago = valorPago;
    }

    public int getValorLiquidado() {
        return this.valorLiquidado; 
    }

    public void setValorLiquidado(int valorLiquidado) {
        this.valorLiquidado = valorLiquidado;
    }

    public double getValorRestosInscritos() {
        return this.valorRestosInscritos;
    }

    public void setValorRestosInscritos(double valorRestosInscritos) {
        this.valorRestosInscritos = valorRestosInscritos;
    }

    public double getValorRestosCancelados() {
        return this.valorRestosCancelados; 
    }

    public void setValorRestosCancelados(double valorRestosCancelados) {
        this.valorRestosCancelados = valorRestosCancelados;
    }

    public double getValorRestosPagos() {
        return this.valorRestosPagos; 
    }

    public void setValorRestosPagos(double valorRestosPagos) {
        this.valorRestosPagos = valorRestosPagos;
    }
}
