package lab6;

public class CherryMXBrandFactory extends Switch {
    SwitchComponentFactory switchComponentFactory;

    public CherryMXBrandFactory(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
        name= "CherryMX";
    }

    @Override
    void gatherParts() {
    }
}
