package lab3;

public class Fans implements Observer {

    private String fanName;


    public Fans(String fanName) {
        this.fanName = fanName;
    }

    @Override
    public void update(String name, String chat) {
        System.out.println(this.fanName+ " has received " + name+"'s tweet    :: " + chat);

    }
    public String toString() {
        return fanName;
    }
}
