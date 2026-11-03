package com.ottawatransit.model;

public class Connection {
    private final BusStop from;
    private final BusStop to;
    public final int travelTimeMinutes;


    public Connection(BusStop from, BusStop to, int travelTimeMinutes){
        this.from = from;
        this.to = to;
        this.travelTimeMinutes = travelTimeMinutes;
    }

    public BusStop getFrom() {
        return from;
    }
    public BusStop getTo() {
        return to;
    }
    public int getTravelTimeMinutes() {
        return travelTimeMinutes;
    }
}

