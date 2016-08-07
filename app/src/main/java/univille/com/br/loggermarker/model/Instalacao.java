public class Instalacao{

    public Instalacao(){

    }

    private int cdInstalacao;
    private int cdLogger;
    private Date dataInicial;
    private Date dataFinal;
    private float latitude;
    private float longitude;
    private int numCasa;
    private String rua;
    private int situacaoInstalacao;
    private int vazamento;

    public int getCdInstalacao(){
        return cdInstalacao;
    }

    public int getCdLogger(){
        return cdLogger;
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

    public float getLatitude(){
        return latitude;
    }

    public void setLatitude(float latitude){
        this.latitude = latitude;
    }

    public float getLongitude(){
        return longitude;
    }

    public void setLongitude(float longitude){
        this.longitude = longitude;
    }

    public int getNumCasa(){
        return numCasa;
    }

    public void setNumCasa(int numCasa){
        this.numCasa = numCasa;
    }

    public String getRua(){
        return rua;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public int getSituacaoInstalacao(){
        return situacaoInstalacao;
    }

    public void setSituacaoInstalacao(int situacaoInstalacao){
        this.situacaoInstalacao = situacaoInstalacao;
    }

    public int getVazamento(){
        return vazamento;
    }

    public void setVazamento(int vazamento){
        this.vazamento = vazamento;
    }
}