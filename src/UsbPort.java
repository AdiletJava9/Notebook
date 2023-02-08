public class UsbPort {
    private double typePort;
    private String id;

    public UsbPort(double typePort, String id) {
        this.typePort = typePort;
        this.id = id;
    }

    public double getTypePort() {
        return typePort;
    }

    public void setTypePort(double typePort) {
        this.typePort = typePort;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

}
