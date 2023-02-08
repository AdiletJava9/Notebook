public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer(new Display(15, "Kyrgyzstan", "IPC"), "HP" +
                "", "Black", new RAM(8, "SSD"),
                new VodeoCard("nvidia", 2), new UsbPort(3.3, "677876483"), new Keyboard("no" +
                "", "no" +
                ""), new HardDisk("disk", 512.0));
        Computer[] computers = new Computer[]{computer};
        for (Computer n : computers) {
            System.out.println("COMPUTER:" + "" + n.getBrand() + "\nCOLOR:" + "" + n.getColorl() + "\n" +
                    "VIDEOCARD:" + "brand," + n.getVodeoCard().getBrand() + " " + "size," + n.getVodeoCard().getSize() + "\n" +
                    "DISPLAY:" + "diogonal," + n.getDisplay().getDiogonal() + " country," + n.getDisplay().getCountry() + " typeMatric," + n.getDisplay().getTypeMAtric() + "\n" +
                    "USB:" + "TypePort," + n.getUsbPort().getTypePort() + " ID," + n.getUsbPort().getID() + " \n" +
                    "HARDDISK:" + "SSD," + n.getHardDisk().getSSD() + " SizeDisk," + n.getHardDisk().getSizeDisk());

        }


    }
}