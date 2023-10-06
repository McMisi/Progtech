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
public abstract class RegularPolygon extends Shape {
    protected double side;
    
    protected boolean isAboveOrOnTheLine(Point vertex1, Point vertex2, Point point, String aboveOrBelow) {
        if (((vertex2.y-vertex1.y)/(vertex2.x-vertex1.x))*(point.x - vertex1.x) + vertex1.y == point.y) {return true;} //Vízszintes egyenes esetén
        if (aboveOrBelow.equals("above")){ //Vizsgáljuk, hogy a megadott pont az egyenes fölött, vagy rajta van-e
            if (vertex2.x - vertex1.x == 0){ //Függőleges egyenes esetén
                return vertex1.x >= point.x;
            }
            return ((vertex2.y-vertex1.y)/(vertex2.x-vertex1.x))*(point.x - vertex1.x) + vertex1.y < point.y;
        }
        else { //Vizsgáljuk, hogy a megadott pont az egyenes alatt, vagy rajta van-e
            if (vertex2.x - vertex1.x == 0){ //Függőleges egyenes esetén
                return vertex1.x <= point.x;
            }
            return ((vertex2.y-vertex1.y)/(vertex2.x-vertex1.x))*(point.x - vertex1.x) + vertex1.y > point.y;
        }
    }

    public RegularPolygon(Point center, double side) {
        super(center);
        this.side = side;
    }
}
