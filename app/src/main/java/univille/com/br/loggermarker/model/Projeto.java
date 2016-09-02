package univille.com.br.loggermarker.model;

import java.util.Date;

public class Projeto{

    private int cdProjeto;
    private String nomeProjeto;
    private Date dataInicial;
    private Date dataFinal;
    private String situacaoProjeto;
    private int cdSubProjeto;

    public Projeto(){ }

    public Projeto(int cdProjeto, String nomeProjeto, Date dataInicial, Date dataFinal, String situacaoProjeto, int cdSubProjeto) {
        this.cdProjeto = cdProjeto;
        this.nomeProjeto = nomeProjeto;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.situacaoProjeto = situacaoProjeto;
        this.cdSubProjeto = cdSubProjeto;
    }

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
    public void setSituacaoProjeto(String situacaoProjeto){ this.situacaoProjeto = situacaoProjeto; }
}