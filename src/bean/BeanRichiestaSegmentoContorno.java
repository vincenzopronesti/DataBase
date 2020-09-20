package bean;

public class BeanRichiestaSegmentoContorno {
    private int idFil;
    private String satellite;
    private int idSeg;
    
    public BeanRichiestaSegmentoContorno(int idFil, String satellite, int idSeg) {
        this.idFil = idFil;
        this.satellite = satellite;
        this.idSeg = idSeg;
    }

    public int getIdFil() {
        return idFil;
    }

    public void setIdFil(int idFil) {
        this.idFil = idFil;
    }

    public int getIdSeg() {
        return idSeg;
    }

    public void setIdSeg(int idSeg) {
        this.idSeg = idSeg;
    }

    public String getSatellite() {
        return satellite;
    }

    public void setSatellite(String satellite) {
        this.satellite = satellite;
    }
}
