package lab6;

public class GateronBrandFactory extends Switch {
    SwitchComponentFactory switchComponentFactory;

    public GateronBrandFactory(SwitchComponentFactory switchComponentFactory) {
        this.switchComponentFactory = switchComponentFactory;
        name= "Gateron";
    }

    @Override
    void gatherParts() {
    }
}
