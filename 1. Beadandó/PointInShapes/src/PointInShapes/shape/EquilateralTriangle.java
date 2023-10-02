/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PointInShapes.shape;

import PointInShapes.point.Point;
import PointInShapes.shape.RegularPolygon;
import java.util.ArrayList;
import java.util.Arrays;

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
    public boolean isInThShape(Point point){
        //return (Math.sqrt(3)*(pont.x - vertex2.x) - (pont.y - vertex2.y) >= 0 && -1*Math.sqrt(3)*(pont.x - vertex1.x) - (pont.y - vertex1.y) >= 0 && vertex1.y <= pont.y);
        //System.out.println(folottealatta(vertex1, vertex2, pont) + " " + !folottealatta(vertex2, vertex3, pont) + " " + !folottealatta(vertex3, vertex1, pont));
        return isAboveOrOnTheLine(vertex2, vertex1, point, "above") && isAboveOrOnTheLine(vertex2, vertex3, point, "below") && isAboveOrOnTheLine(vertex3, vertex1, point, "below");
    }
    
    
    
}
