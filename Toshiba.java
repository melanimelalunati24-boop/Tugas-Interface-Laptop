public class Toshiba implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public Toshiba() {
        this.volume = 50; // volume awal default
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Toshiba menyala... Menyajikan kualitas terbaik.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Toshiba dimatikan. Sampai jumpa!");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume Toshiba sudah maksimal (100%)!");
            } else {
                this.volume += 10;
                System.out.println("Volume Toshiba sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan laptop Toshiba terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume Toshiba sudah sunyi (0%)!");
            } else {
                this.volume -= 10;
                System.out.println("Volume Toshiba sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan laptop Toshiba terlebih dahulu!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
