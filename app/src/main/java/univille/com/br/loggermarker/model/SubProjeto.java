package univille.com.br.loggermarker.model;

import java.util.Date;

public class SubProjeto{

    private int cdSubProjeto;
    private int cdProjeto;
    private String subProjetoNome;
    private Date dataInicial;
    private Date dataFinal;
    private int situacaoSubProjeto;

    public SubProjeto(int cdSubProjeto, int cdProjeto, String subProjetoNome, Date dataInicial, Date dataFinal, int situacaoSubProjeto) {
        this.cdSubProjeto = cdSubProjeto;
        this.cdProjeto = cdProjeto;
        this.subProjetoNome = subProjetoNome;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.situacaoSubProjeto = situacaoSubProjeto;
    }

    public SubProjeto(){ }

    public int getCdSubProjeto() {
        return cdSubProjeto;
    }

    public void setCdSubProjeto(int cdSubProjeto) {
        this.cdSubProjeto = cdSubProjeto;
    }

    public int getCdProjeto() {
        return cdProjeto;
    }

    public void setCdProjeto(int cdProjeto) {
        this.cdProjeto = cdProjeto;
    }

    public String getSubProjetoNome() {
        return subProjetoNome;
    }

    public void setSubProjetoNome(String subProjetoNome) {
        this.subProjetoNome = subProjetoNome;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getSituacaoSubProjeto() {
        return situacaoSubProjeto;
    }

    public void setSituacaoSubProjeto(int situacaoSubProjeto) {
        this.situacaoSubProjeto = situacaoSubProjeto;
    }



}