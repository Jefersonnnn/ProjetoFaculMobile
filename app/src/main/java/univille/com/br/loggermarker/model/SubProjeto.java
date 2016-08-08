public class SubProjeto{

    public SubProjeto(){

    }

    private int cdSubProjeto;
    private String subProjetoNome;
    private int cdInstalacao;
    private Date dataInicial;
    private Date dataFinal;
    private int situacaoSubProjeto;

    public int getCdSubProjeto(){
        return cdSubProjeto;
    }

    public String getSubProjetoNome(){
        return subProjetoNome;
    }

    public void setSubProjetoNome(String subProjetoNome){
        this.subProjetoNome = subProjetoNome;
    }

    public int getCdInstalacao(){
        return cdInstalacao;
    }

    public Date getDataInicial(){
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial){
        this.dataInicial = dataInicial
    }

     public Date getDataFinal(){
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal){
        this.dataFinal = dataFinal
    }

    public int getSituacaoSubProjeto(){
        return situacaoSubProjeto;
    }

    public void setSituacaoSubProjeto(int situacaoSubProjeto){
        this.situacaoSubProjeto = situacaoSubProjeto;
    }
}