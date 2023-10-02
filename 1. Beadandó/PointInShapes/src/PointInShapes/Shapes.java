/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PointInShapes;

import PointInShapes.shape.EquilateralTriangle;
import PointInShapes.exception.UnknownShapeTypeException;
import PointInShapes.exception.InvalidFormatException;
import PointInShapes.point.Point;
import PointInShapes.shape.Square;
import PointInShapes.shape.Circle;
import PointInShapes.shape.Shape;
import PointInShapes.shape.RegularHexagon;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author gmisi
 */
public class Shapes {
    protected ArrayList<Shape> shapes;

    public Shapes() {
        shapes = new ArrayList<>();
    }
    
    public void read(String filename) throws FileNotFoundException, UnknownShapeTypeException, InvalidFormatException {
        int row = 1;
        try (Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)))){
            
            int numShapes = sc.nextInt();
            
            if (sc.hasNext()) sc.nextLine();
            for (int i = 0; i < numShapes; i++) {
                
                Scanner line = new Scanner(sc.nextLine());
                
                String shapeName = line.next();
                double x = Double.parseDouble(line.next());
                double y = Double.parseDouble(line.next());
                double radiusOrSide = Double.parseDouble(line.next());
                
                if (radiusOrSide <= 0) {
                    throw new IllegalArgumentException();
                }
                
                Shape shape;
                switch (shapeName){
                    case "circle":
                        shape = new Circle(new Point(x, y), radiusOrSide);
                        break;
                    case "triangle":
                        shape = new EquilateralTriangle(new Point(x, y), radiusOrSide);
                        break;
                    case "square":
                        shape = new Square(new Point(x, y), radiusOrSide);
                        break;
                    case "hexagon":
                        shape = new RegularHexagon(new Point(x, y), radiusOrSide);
                        break;
                    default:
                        throw new UnknownShapeTypeException("Unknown type of shape!");
                }
                shapes.add(shape);
                row++;
            }
        } catch (NoSuchElementException | IndexOutOfBoundsException e) {
            throw new InvalidFormatException("Invalid format in row: " + row + ".");
        }
    }
    
    public void countOfShapeIncludeThePoint(Point point) {
        int count = 0;
        for (Shape shape : shapes) {
            if(shape.isInThShape(point)){
                count++;
            }
        }
        System.out.println("The point is contained by " + count + " shapes.");
    }
    
    
}
