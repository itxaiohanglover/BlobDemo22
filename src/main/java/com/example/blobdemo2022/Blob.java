package com.example.blobdemo2022;

public class Blob {
    double x,y;
    double r;

    public Blob(double nx, double ny) {
        x = nx;
        y = ny;
        r = 50;
    }

    public void move(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public boolean contains(double cx, double cy) {
        return dist(cx,cy,x,y) <= r;
    }

    private double dist(double x1,double y1,double x2, double y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
}
