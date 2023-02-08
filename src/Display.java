public class Display {
    private int diogonal;
    private String country;
    private String typeMAtric;

    public Display(int diogonal, String country, String typeMAtric) {
        this.diogonal = diogonal;
        this.country = country;
        this.typeMAtric = typeMAtric;
    }

    public int getDiogonal() {
        return diogonal;
    }

    public void setDiogonal(int diogonal) {
        this.diogonal = diogonal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTypeMAtric() {
        return typeMAtric;
    }

    public void setTypeMAtric(String typeMAtric) {
        this.typeMAtric = typeMAtric;
    }
}
