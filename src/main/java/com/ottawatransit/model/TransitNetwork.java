package com.ottawatransit.model;

import java.util.*;

public class TransitNetwork {
    private final Map<BusStop, List<Connection>> adjacencyList = new HashMap<>();

    public void addStop(BusStop stop) {
        adjacencyList.putIfAbsent(stop, new ArrayList<>());
    }

    public void addConnection(BusStop from, BusStop to, int travelTimeMinutes) {
        adjacencyList.get(from).add(new Connection(from, to, travelTimeMinutes));
    }

    public List<Connection> getConnections(BusStop stop) {
        return adjacencyList.getOrDefault(stop, Collections.emptyList());
    }

    public Set<BusStop> getAllStops() {
        return adjacencyList.keySet();
    }
}
