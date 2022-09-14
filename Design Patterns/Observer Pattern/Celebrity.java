package lab3;

import java.util.ArrayList;

public class Celebrity implements Subject {

    private String celName;
    private ArrayList<Observer> fans;


    public Celebrity(String celName) {
        this.celName = celName;
        fans= new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        fans.add(o);
        System.out.println(o+ " has started following "+this.celName);

    }

    @Override
    public void removeObserver(Observer o) {
        fans.remove(o);
        System.out.println(o+ "has stopped following "+ this.celName);

    }

    @Override
    public void notifyObservers(String chat) {
        for (int i= 0; i< fans.size(); i++){
            fans.get(i).update(this.celName,chat);
        }
        System.out.println();
    }


    public void chatting(String chat){
        System.out.println();
        System.out.println(this.celName+ " has tweeted :: "+ chat);
        System.out.println();
    }
}
