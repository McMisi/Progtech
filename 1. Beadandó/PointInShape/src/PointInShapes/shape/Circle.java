/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PointInShapes.shape;

import PointInShapes.point.Point;

/**
 *
 * @author gmisi
 */
public class Circle extends Shape {
    private final double sugar;
    public Circle(Point kozeppont, double sugar) {
        super(kozeppont);
        this.sugar = sugar;
    }

    @Override
    public boolean isInTheShape(Point pont){
        return (pont.x - center.y)*(pont.x - center.y) + (pont.y - center.y)*(pont.y - center.y) <= sugar * sugar;
        //A kör egyenletének segítségével, ellenőrizzük, hogy a pont a körön, vagy a körön belül helyezkedik el
    }  
}
