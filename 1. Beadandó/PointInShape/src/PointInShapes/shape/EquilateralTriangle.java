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
public class EquilateralTriangle extends RegularPolygon{
    private final Point vertex1, vertex2, vertex3;
    
    public EquilateralTriangle(Point center, double side) {
        super(center, side);
        vertex1 = new Point(center.x + side/2, center.y - side * Math.sqrt(3) / 6);
        vertex2 = new Point(center.x - side/2, center.y - side * Math.sqrt(3) / 6);
        vertex3 = new Point(center.x, center.y + side * Math.sqrt(3) * 2 / 6); 
    }
    
    @Override
    public boolean isInTheShape(Point point){
        //Ellenőrizzük az egyes oldalakra, hogy a pont felette, alatta, vagy rajta van, ha valamelyik feltételünk hamis, akkor a metódus hamis értékkel tér vissza
        return isAboveOrOnTheLine(vertex2, vertex1, point, "above") && isAboveOrOnTheLine(vertex2, vertex3, point, "below") && isAboveOrOnTheLine(vertex3, vertex1, point, "below");
    }
}
