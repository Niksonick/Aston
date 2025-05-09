package Module5.Builder;

public class Computer {

    private String SSD;
    private String RAM;
    private boolean isBluetoothEnabled;

    public Computer(ComputerBuilder builder) {
        this.SSD = SSD;
        this.RAM = RAM;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }
}
