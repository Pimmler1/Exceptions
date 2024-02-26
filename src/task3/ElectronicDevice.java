package task3;

public class ElectronicDevice {
    private String name;
    private int power;

    public ElectronicDevice(){}
    public ElectronicDevice(String name, int power) {
        this.name=name;
        this.power=power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        if(power<0){
            throw new IllegalWattException("power can not be negative!");
        } else {
            this.power = power;
        }
    }
}
