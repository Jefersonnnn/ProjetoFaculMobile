package univille.com.br.loggermarker.model;

import java.util.Date;

public class Instalacao {

    private int    cdInstalacao;
    private int    cdLogger;
    private Date   dataInicial;
    private Date   dataFinal;
    private double latitude;
    private double longitude;
    private int    numCasa;
    private String rua;
    private int    situacaoInstalacao;
    private int    imgSituacao;

    public Instalacao(){};

    public Instalacao(int cdLogger, Date dataInicial, double latitude, double longitude, int numCasa, String rua, int imgSituacao) {

        this.dataInicial = dataInicial;
        this.latitude    = latitude;
        this.longitude   = longitude;
        this.numCasa     = numCasa;
        this.rua         = rua;
        this.cdLogger    = cdLogger;
        this.imgSituacao = imgSituacao;

        this.cdInstalacao = 1;
    }


    public int getCdInstalacao() {
        return cdInstalacao;
    }

    public int getCdLogger(){return cdLogger;}

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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(int numCasa) {
        this.numCasa = numCasa;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getSituacaoInstalacao() {
        return situacaoInstalacao;
    }

    public void setSituacaoInstalacao(int situacaoInstalacao) {
        this.situacaoInstalacao = situacaoInstalacao;
    }

    public int getImgSituacao() {
        return imgSituacao;
    }

    public void setImgSituacao(int imgSituacao) {
        this.imgSituacao = imgSituacao;
    }
}