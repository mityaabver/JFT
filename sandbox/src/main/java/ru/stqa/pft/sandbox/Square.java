package ru.stqa.pft.sandbox;

/**
 * Created by DA.Averyanov on 26.01.2017.
 */
public class Square {

    public double l;

    public Square(double len) {
        this.l = len;
    }

    public double area() {
        return this.l * this.l;
    }
}
