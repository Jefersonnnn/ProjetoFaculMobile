package univille.com.br.loggermarker.model;

class Logger{

    private int cdLogger;
    private String statusLogger;

    public Logger(){
        
    }

    public Logger(int cdLogger, String statusLogger) {
        this.cdLogger = cdLogger;
        this.statusLogger = statusLogger;
    }

    public int getCdLogger(){
        return cdLogger;
    }
    public void setCdLogger(int cdLogger) { this.cdLogger = cdLogger; }

    public String getStatusLogger(){
        return statusLogger;
    }
    public void setStatusLogger(String statusLogger){
        this.statusLogger = statusLogger;
    }

}