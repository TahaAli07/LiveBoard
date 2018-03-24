package com.example.taha.liveboard;

import java.util.ArrayList;
import java.util.List;

public class Segment {

    private List<Point> points = new ArrayList<Point>();
    private int color;

    // Required default constructor for Firebase serialization / deserialization
    @SuppressWarnings("unused")
    private Segment() {
    }

    public Segment(int color) {
        this.color = color;
    }

    public void addPoint(int x, int y) {
        Point p = new Point(x, y);
        points.add(p);
    }

    public List<Point> getPoints() {
        return points;
    }

    public int getColor() {
        return color;
    }
}
