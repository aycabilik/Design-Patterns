package lab6;

public class CoilGateron extends CoilSpring {

    int initialPressure;

    public CoilGateron(PressureCN pressureCN) {
        super(pressureCN);
        if(pressureCN == PressureCN.Light){
            this.initialPressure=50;
        }
    }

    @Override
    public String toString() {
        return "CherryCoil{" +
                "initialPressure=" + initialPressure +
                '}';
    }
}
