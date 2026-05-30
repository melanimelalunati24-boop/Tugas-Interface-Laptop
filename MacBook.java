public class MacBook implements Laptop {
    private int volume;
    private boolean isPowerOn;

    public MacBook() {
        this.volume = 40; // volume awal default
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("MacBook menyala... macOS siap digunakan. *Suara Chime*");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("MacBook dimatikan. Sistem aman.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume MacBook sudah maksimal (100%)!");
            } else {
                this.volume += 5; // MacBook naik per 5% agar lebih presisi
                System.out.println("Volume MacBook sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan MacBook terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume MacBook sudah sunyi (0%)!");
            } else {
                this.volume -= 5;
                System.out.println("Volume MacBook sekarang: " + this.getVolume() + "%");
            }
        } else {
            System.out.println("Nyalakan MacBook terlebih dahulu!");
        }
    }

    public int getVolume() {
        return this.volume;
    }
}
