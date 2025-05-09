package Module5.Builder;

public class ComputerBuilder {

    private String SSD;
    private String RAM;
    private boolean isBluetoothEnabled;

    public ComputerBuilder(String SSD, String RAM) {
        this.SSD = SSD;
        this.RAM = RAM;
    }

    public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
        this.isBluetoothEnabled = isBluetoothEnabled;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }
}
