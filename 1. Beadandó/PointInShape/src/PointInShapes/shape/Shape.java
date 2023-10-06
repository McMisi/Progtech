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
public abstract class Shape {
    protected Point center;

    public Shape(Point kozeppont) {
        this.center = kozeppont;
    }
    
    public abstract boolean isInTheShape(Point pont);
}
