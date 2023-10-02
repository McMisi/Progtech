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
    protected double sugar;
    public Circle(Point kozeppont, double sugar) {
        super(kozeppont);
        this.sugar = sugar;
    }

    @Override
    public boolean isInThShape(Point pont){
        return (pont.x - center.y)*(pont.x - center.y) + (pont.y - center.y)*(pont.y - center.y) <= sugar * sugar;
    }
    
    
}
