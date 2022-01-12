package at.seya.OO.remote;
import at.seya.OO.car.Tire;

import java.util.ArrayList;
import java.util.List;

public class Remote {
    private List<Battery> batteries;

    public Remote() {
        this.batteries = new ArrayList<>();
    }

    public void addBatteries(Battery batteries) {this.batteries.add(batteries);}

    public List<Battery> getBatteries() {
        return batteries;
    }
}
