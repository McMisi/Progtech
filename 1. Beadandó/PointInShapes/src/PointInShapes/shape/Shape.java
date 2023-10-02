/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PointInShapes.shape;

import PointInShapes.point.Point;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gmisi
 */
public abstract class Shape {
    protected Point center;
    public ArrayList<Shape> shapes = new ArrayList<>();

    public Shape(Point kozeppont) {
        this.center = kozeppont;
    }
    
   public abstract boolean isInThShape(Point pont);
}
