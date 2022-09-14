package lab6;

public abstract class CoilSpring {

    PressureCN pressureCN;

    public CoilSpring(PressureCN pressureCN) {
        this.pressureCN = pressureCN;
    }

    @Override
    public String toString() {
        return "CoilSpring{" +
                "pressureCN=" + pressureCN +
                '}';
    }
}
