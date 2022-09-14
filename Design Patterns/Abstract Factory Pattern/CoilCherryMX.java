package lab6;

public class CoilCherryMX extends CoilSpring {

    int initialPressure;

    public CoilCherryMX(PressureCN pressureCN) {
        super(pressureCN);
        if(pressureCN == PressureCN.Light){
            this.initialPressure=45;
        }
        else if(pressureCN == PressureCN.Medium){
            this.initialPressure=55;
        }
        else if(pressureCN == PressureCN.Heavy){
            this.initialPressure=60;
        }
        else if(pressureCN == PressureCN.SuperHeavy){
            this.initialPressure=80;
        }
    }

    @Override
    public String toString() {
        return "CherryCoil{" +
                "initialPressure=" + initialPressure +
                '}';
    }
}