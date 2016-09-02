package univille.com.br.loggermarker.model;

import java.util.Date;

public class SubProjeto{

    private int cdSubProjeto;
    private String subProjetoNome;
    private int cdInstalacao;
    private Date dataInicial;
    private Date dataFinal;
    private String situacaoSubProjeto;

    public SubProjeto(){ }

    public SubProjeto(int cdSubProjeto, String subProjetoNome, int cdInstalacao, Date dataInicial, Date dataFinal, String situacaoSubProjeto) {
        this.cdSubProjeto = cdSubProjeto;
        this.subProjetoNome = subProjetoNome;
        this.cdInstalacao = cdInstalacao;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.situacaoSubProjeto = situacaoSubProjeto;
    }

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
        this.dataInicial = dataInicial;
    }

     public Date getDataFinal(){
        return dataFinal;
    }
    public void setDataFinal(Date dataFinal){
        this.dataFinal = dataFinal;
    }

    public String getSituacaoSubProjeto(){
        return situacaoSubProjeto;
    }
    public void setSituacaoSubProjeto(String situacaoSubProjeto){
        this.situacaoSubProjeto = situacaoSubProjeto;
    }
}