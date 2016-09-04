package univille.com.br.loggermarker.model;

import java.util.Date;

public class Projeto{

    private int cdProjeto;
    private String nomeProjeto;
    private Date dataInicial;
    private Date dataFinal;
    private int situacaoProjeto;

    public Projeto(){ }

      public Projeto(int cdProjeto, String nomeProjeto, Date dataInicial, Date dataFinal, int situacaoProjeto) {
        this.cdProjeto = cdProjeto;
        this.nomeProjeto = nomeProjeto;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.situacaoProjeto = situacaoProjeto;
    }

    public void setCdProjeto(int cdProjeto) { this.cdProjeto = cdProjeto;}
    public int getCdProjeto(){
        return cdProjeto;
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

    public int getSituacaoProjeto(){
        return situacaoProjeto;
    }
    public void setSituacaoProjeto(int situacaoProjeto){ this.situacaoProjeto = situacaoProjeto; }
}