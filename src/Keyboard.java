public class Keyboard {
   private   String backlight;
   private  String additionalDigits;

    public Keyboard(String backlight, String additionalDigits) {
        this.backlight = backlight;
        this.additionalDigits = additionalDigits;
    }

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    public String getAdditionalDigits() {
        return additionalDigits;
    }

    public void setAdditionalDigits(String additionalDigits) {
        this.additionalDigits = additionalDigits;
    }
}
