package com.ottawatransit;

import com.ottawatransit.model.BusStop;
import com.ottawatransit.model.Connection;
import com.ottawatransit.model.TransitNetwork;

public class Main {
    public static void main(String[] args) {
        TransitNetwork network = new TransitNetwork();

        BusStop a = new BusStop("A", "Stop A");
        BusStop b = new BusStop("B", "Stop B");
        BusStop c = new BusStop("C", "Stop C");
        BusStop d = new BusStop("D", "Stop D");

        network.addStop(a);
        network.addStop(b);
        network.addStop(c);
        network.addStop(d);

        network.addConnection(a, b, 5);
        network.addConnection(b, c, 7);
        network.addConnection(b, d, 4);
        network.addConnection(d, c, 3);

        for (BusStop stop : network.getAllStops()) {
            System.out.println(stop + " connects to:");

            for (Connection conn : network.getConnections(stop)) {
                System.out.println(" -->" + conn.getTo() + " (" + conn.getTravelTimeMinutes() + " min)");
            }
        }
    }
}
