public class FuncionalProgramatica {
    private String funcao;
    private String subfuncao;
    private String programaOrcamentario;
    private String acaoOrcamentaria;
    private String planoOrcamentario;

    public FuncionalProgramatica(String funcao, String subfuncao, String programaOrcamentario,
                                 String acaoOrcamentaria, String planoOrcamentario) {
        this.funcao = funcao;
        this.subfuncao = subfuncao;
        this.programaOrcamentario = programaOrcamentario;
        this.acaoOrcamentaria = acaoOrcamentaria;
        this.planoOrcamentario = planoOrcamentario;
    }

    
    public String getFuncao() { 
        return this.funcao; 
    }
    public void setFuncao(String funcao) { 
        this.funcao = funcao;
    }

    public String getSubfuncao() { 
        return this.subfuncao;
    }
    public void setSubfuncao(String subfuncao) {  
        this.subfuncao = subfuncao;
    }

    public String getProgramaOrcamentario() { 
        return this.programaOrcamentario; 
    }
    public void setProgramaOrcamentario(String programaOrcamentario) {
        this.programaOrcamentario = programaOrcamentario;
    }

    public String getAcaoOrcamentaria() { 
        return this.acaoOrcamentaria; 
    }
    public void setAcaoOrcamentaria(String acaoOrcamentaria) {
        this.acaoOrcamentaria = acaoOrcamentaria;
    }

    public String getPlanoOrcamentario() { 
        return this.planoOrcamentario; 
    }
    public void setPlanoOrcamentario(String planoOrcamentario) {
        this.planoOrcamentario = planoOrcamentario;
    }
}
