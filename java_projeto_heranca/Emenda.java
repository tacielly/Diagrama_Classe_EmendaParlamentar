public class Emenda extends FuncionalProgramatica {
    private int anoEmenda;
    private String tipoEmenda;
    private String autorEmenda;
    private String numeroEmenda;
    private String localidadeGasto;
    private String codigoEmenda;
    private boolean possuiApoiador;

    public Emenda(String funcao, String subfuncao, String programaOrcamentario,
                  String acaoOrcamentaria, String planoOrcamentario,
                  int anoEmenda, String tipoEmenda, String autorEmenda,
                  String numeroEmenda, String localidadeGasto, String codigoEmenda, boolean possuiApoiador) {

        super(funcao, subfuncao, programaOrcamentario, acaoOrcamentaria, planoOrcamentario);

        this.anoEmenda = anoEmenda;
        this.tipoEmenda = tipoEmenda;
        this.autorEmenda = autorEmenda;
        this.numeroEmenda = numeroEmenda;
        this.localidadeGasto = localidadeGasto;
        this.codigoEmenda = codigoEmenda;
        this.possuiApoiador = possuiApoiador;
    }

  
    public int getAnoEmenda() {
        return this.anoEmenda; 
    }
    public void setAnoEmenda(int anoEmenda) {
        this.anoEmenda = anoEmenda;
    }

    public String getTipoEmenda() { 
        return this.tipoEmenda; 
    }
    public void setTipoEmenda(String tipoEmenda) {
        this.tipoEmenda = tipoEmenda;
    }

    public String getAutorEmenda() { 
        return autorEmenda; 
    }
    public void setAutorEmenda(String autorEmenda) {
        this.autorEmenda = autorEmenda;
    }

    public String getNumeroEmenda() { 
        return this.numeroEmenda; 
    }
    public void setNumeroEmenda(String numeroEmenda) {
        this.numeroEmenda = numeroEmenda;
    }

    public String getLocalidadeGasto() { 
        return localidadeGasto; 
    }
    public void setLocalidadeGasto(String localidadeGasto) {
        this.localidadeGasto = localidadeGasto;
    }

    public String getCodigoEmenda() { 
        return codigoEmenda; 
    }
    public void setCodigoEmenda(String codigoEmenda) {
        this.codigoEmenda = codigoEmenda;
    }

    public boolean getPossuiApoiador() { 
        return possuiApoiador; 
    }
    public void setPossuiApoiador(boolean possuiApoiador) {
        this.possuiApoiador = possuiApoiador;
    }
}
