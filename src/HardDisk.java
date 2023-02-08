public class HardDisk {
    private String SSD;
    private double sizeDisk;

    public HardDisk(String SSD, double sizeDisk) {
        this.SSD = SSD;
        this.sizeDisk = sizeDisk;
    }

    public String getSSD() {
        return SSD;
    }

    public void setSSD(String SSD) {
        this.SSD = SSD;
    }

    public double getSizeDisk() {
        return sizeDisk;
    }

    public void setSizeDisk(double sizeDisk) {
        this.sizeDisk = sizeDisk;
    }
}
