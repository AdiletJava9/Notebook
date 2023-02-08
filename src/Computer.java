public class Computer {
 private Display display;
 private String brand;
 private String colorl;
 private RAM ram;
 private VodeoCard vodeoCard;
 private UsbPort usbPort;
 private Keyboard keyboard;
 private HardDisk hardDisk;

 public Computer(Display display, String brand, String colorl, RAM ram, VodeoCard vodeoCard, UsbPort usbPort, Keyboard keyboard, HardDisk hardDisk) {
  this.display = display;
  this.brand = brand;
  this.colorl = colorl;
  this.ram = ram;
  this.vodeoCard = vodeoCard;
  this.usbPort = usbPort;
  this.keyboard = keyboard;
  this.hardDisk = hardDisk;
 }

 public Display getDisplay() {
  return display;
 }

 public void setDisplay(Display display) {
  this.display = display;
 }

 public String getBrand() {
  return brand;
 }

 public void setBrand(String brand) {
  this.brand = brand;
 }

 public String getColorl() {
  return colorl;
 }

 public void setColorl(String colorl) {
  this.colorl = colorl;
 }

 public RAM getRam() {
  return ram;
 }

 public void setRam(RAM ram) {
  this.ram = ram;
 }

 public VodeoCard getVodeoCard() {
  return vodeoCard;
 }

 public void setVodeoCard(VodeoCard vodeoCard) {
  this.vodeoCard = vodeoCard;
 }

 public UsbPort getUsbPort() {
  return usbPort;
 }

 public void setUsbPort(UsbPort usbPort) {
  this.usbPort = usbPort;
 }

 public Keyboard getKeyboard() {
  return keyboard;
 }

 public void setKeyboard(Keyboard keyboard) {
  this.keyboard = keyboard;
 }

 public HardDisk getHardDisk() {
  return hardDisk;
 }

 public void setHardDisk(HardDisk hardDisk) {
  this.hardDisk = hardDisk;
 }







}