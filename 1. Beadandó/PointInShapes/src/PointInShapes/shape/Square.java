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
public class Square extends RegularPolygon{

    private final Point vertex1, vertex2, vertex3, vertex4;
    public Square(Point center, double side) {
        super(center, side);
        vertex1 = new Point(center.x - side / 2, center.y - side / 2);
        vertex2 = new Point(center.x - side / 2, center.y + side / 2);
        vertex3 = new Point(center.x + side / 2, center.y + side / 2);
        vertex4 = new Point(center.x + side / 2, center.y - side / 2);
    }
    
    @Override
    public boolean isInThShape(Point point){
        //System.out.println(isAboveOrOnTheLine(vertex1, vertex2, point, "below"));
        return isAboveOrOnTheLine(vertex1, vertex2, point, "below") && isAboveOrOnTheLine(vertex2, vertex3, point, "below") && isAboveOrOnTheLine(vertex3, vertex4, point, "above") && isAboveOrOnTheLine(vertex4, vertex1, point, "above");
        //return ((vertex1.x >= pont.x && vertex3.x <= pont.x) && (vertex1.y >= pont.y && vertex3.y <= pont.y));
    }
    
}
