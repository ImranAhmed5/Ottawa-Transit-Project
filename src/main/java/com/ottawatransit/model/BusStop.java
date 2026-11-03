package com.ottawatransit.model;

public class BusStop {
    private final String id;
    private final String name;

    public BusStop(String id, String name) {
        this.id = id;
        this.name = name;

    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStop busStop = (BusStop) o;
        return id.equals(busStop.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
