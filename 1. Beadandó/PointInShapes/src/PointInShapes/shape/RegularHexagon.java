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
    public boolean isInThShape(Point point){
        //return (-1* Math.sqrt(3)*(pont.x - vertex2.x) - (pont.y - vertex2.y) <= 0 && Math.sqrt(3)*(pont.x - vertex2.x) - (pont.y - vertex2.y) >= 0 && pont.y >= vertex1.y && -1 * Math.sqrt(3)*(pont.x - (2 *oldal + vertex2.x)) - (pont.y - vertex2.y) >= 0 && Math.sqrt(3)*(pont.x - (2 * oldal + vertex2.x)) - (pont.y - vertex2.y) <= 0 && vertex1.y + 2 * Math.sqrt(3) / 2 * oldal >= pont.y);
        return isAboveOrOnTheLine(vertex1, vertex2, point, "above") && isAboveOrOnTheLine(vertex2, vertex3, point, "below") && isAboveOrOnTheLine(vertex3, vertex4, point, "below") && isAboveOrOnTheLine(vertex4, vertex5, point, "below") && isAboveOrOnTheLine(vertex5, vertex6, point, "above")&& isAboveOrOnTheLine(vertex6, vertex1, point, "above");
    }
    
}
