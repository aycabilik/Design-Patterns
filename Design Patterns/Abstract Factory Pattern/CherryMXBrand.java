package lab6;

public class CherryMXBrand extends SwitchMaker implements SwitchComponentFactory{
    @Override
    Switch createSwitch(String type) {
        Switch cherrySwitch = new CherryMXBrandFactory(this);
        cherrySwitch.keyCap = createKeyCap();
        cherrySwitch.placeKeyCap();
        cherrySwitch.placeStem();
        cherrySwitch.placeCoilSpring();

        if(type.equals(null)){
            return null;
        }
        else if(type.equals("linear")){
            cherrySwitch.coilSpring= createCoilSpring(PressureCN.Light);
            cherrySwitch.stem= new StemCherryMXLinear();
        }
        else if(type.equals("tactile")){
            cherrySwitch.coilSpring= createCoilSpring(PressureCN.Medium);
            cherrySwitch.stem= new StemCherryMXTactile();
        }
        else if(type.equals("clicky")){
            cherrySwitch.coilSpring= createCoilSpring(PressureCN.Heavy);
            cherrySwitch.stem= new StemCherryMXClicky();
        }
        else{
            cherrySwitch.coilSpring= createCoilSpring(PressureCN.SuperHeavy);
            cherrySwitch.stem= new StemCherryMXLinear();
        }

      return cherrySwitch;
    }

    @Override
    Switch assembleSwitch(String type) {
        return createSwitch(type);
    }

    @Override
    public KeyCap createKeyCap() {
        return new KeyCapCherryMX();
    }

    @Override
    public Stem createStem() {
        return null;
    }

    @Override
    public CoilSpring createCoilSpring(PressureCN pressureCN) {
        return new CoilCherryMX(pressureCN);
    }
}
