/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PointInShapes.shape;

import PointInShapes.point.Point;
import java.util.ArrayList;

/**
 *
 * @author gmisi
 */
public abstract class RegularPolygon extends Shape {
    protected double side;
    
    protected ArrayList<Point> cs;
    
    protected boolean isAboveOrOnTheLine(Point vertex1, Point vertex2, Point point, String aboveOrBelow) {
        //System.out.println(vertex1.x + " " + vertex1.y);
        //System.out.println(vertex2.x + " " + vertex2.y);
        //System.out.println(point.x + " " + point.y);
        
        if (((vertex2.y-vertex1.y)/(vertex2.x-vertex1.x))*(point.x - vertex1.x) + vertex1.y == point.y) {return true;} 
        
        if (aboveOrBelow.equals("above")){
            if (vertex2.x - vertex1.x == 0){
                return vertex1.x >= point.x;
            }
            return ((vertex2.y-vertex1.y)/(vertex2.x-vertex1.x))*(point.x - vertex1.x) + vertex1.y < point.y;
        }
        else {
            if (vertex2.x - vertex1.x == 0){
                return vertex1.x <= point.x;
            }
            
            return ((vertex2.y-vertex1.y)/(vertex2.x-vertex1.x))*(point.x - vertex1.x) + vertex1.y > point.y;
        }
    }

    public RegularPolygon(Point center, double side) {
        super(center);
        this.side = side;
        cs = new ArrayList<>();
    }

    
}
