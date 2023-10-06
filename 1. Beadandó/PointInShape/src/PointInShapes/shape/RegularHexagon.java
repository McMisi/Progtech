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
public class RegularHexagon extends RegularPolygon {
    private final Point vertex1, vertex2, vertex3, vertex4, vertex5, vertex6;
    public RegularHexagon(Point center, double side) {
        super(center, side);
        vertex1 = new Point(center.x - side/2, center.y - side * Math.sqrt(3) / 2);
        vertex2 = new Point(center.x - side, center.y);
        vertex3 = new Point(center.x - side/2, center.y + side * Math.sqrt(3) / 2);
        vertex4 = new Point(center.x + side/2, center.y + side * Math.sqrt(3) / 2);
        vertex5 = new Point(center.x + side, center.y);
        vertex6 = new Point(center.x + side/2, center.y - side * Math.sqrt(3) / 2);
    }
    
    @Override
    public boolean isInTheShape(Point point){
        //Ellenőrizzük az egyes oldalakra, hogy a pont felette, alatta, vagy rajta van, ha valamelyik feltételünk hamis, akkor a metódus hamis értékkel tér vissza
        return isAboveOrOnTheLine(vertex1, vertex2, point, "above") && isAboveOrOnTheLine(vertex2, vertex3, point, "below") && isAboveOrOnTheLine(vertex3, vertex4, point, "below") && isAboveOrOnTheLine(vertex4, vertex5, point, "below") && isAboveOrOnTheLine(vertex5, vertex6, point, "above")&& isAboveOrOnTheLine(vertex6, vertex1, point, "above");
    }
    
}
