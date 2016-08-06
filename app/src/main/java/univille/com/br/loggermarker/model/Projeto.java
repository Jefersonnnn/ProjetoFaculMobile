public class Projeto{

    public Projeto(){
        
    }

    private int cdProjeto;
    private String nomeProjeto;
    private Date dataInicial;
    private Date dataFinal;
    private String situacaoProjeto;
    private int cdSubProjeto;

    public int getCdProjeto(){
        return cdProjeto;
    }

    public int getCdSubProjeto(){
        return cdSubProjeto;
    }

    public String getNomeProjeto(){
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto){
        this.nomeProjeto = nomeProjeto;
    }

    public Date getDataInicial(){
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial){
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal(){
        return dataFinal;
    }

    public void setDataFinal(){
        this.dataFinal = dataFinal;
    }

    public String getSituacaoProjeto(){
        return situacaoProjeto;
    }

    public void setSituacaoProjeto(String situacaoProjeto){
        this.situacaoProjeto = situacaoProjeto;
    }
}