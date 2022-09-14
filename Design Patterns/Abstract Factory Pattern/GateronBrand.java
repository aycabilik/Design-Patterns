package lab6;

public class GateronBrand extends SwitchMaker implements SwitchComponentFactory{
    @Override
    Switch createSwitch(String type) {
        Switch gateronSwitch = new GateronBrandFactory(this);
        gateronSwitch.keyCap = createKeyCap();
        gateronSwitch.placeKeyCap();
        gateronSwitch.placeStem();
        gateronSwitch.placeCoilSpring();


        if(type.equals(null)){
            return null;
        }
        else if(type.equals("linear")){
            gateronSwitch.coilSpring= createCoilSpring(PressureCN.Light);
            gateronSwitch.stem= new StemGateronLinear();
        }
        else if(type.equals("tactile")){
            gateronSwitch.coilSpring= createCoilSpring(PressureCN.Light);
            gateronSwitch.stem= new StemGateronTactile();
        }
        else if(type.equals("clicky")){
            gateronSwitch.coilSpring= createCoilSpring(PressureCN.Light);
            gateronSwitch.stem= new StemGateronClicky();
        }
        else{
            gateronSwitch.coilSpring= createCoilSpring(PressureCN.Light);
            gateronSwitch.stem= new StemGateronLinear();
        }

        return gateronSwitch;
    }

    @Override
    Switch assembleSwitch(String type) {
        return createSwitch(type);
    }

    @Override
    public KeyCap createKeyCap() {
        return new KeyCapGateron();
    }

    @Override
    public Stem createStem() {
        return null;
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return new CoilGateron(pressureCN);
    }
}
