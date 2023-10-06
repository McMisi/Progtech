/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PointInShapes;

import PointInShapes.exception.UnknownShapeTypeException;
import PointInShapes.exception.InvalidFormatException;
import PointInShapes.point.Point;
import java.io.FileNotFoundException;

/**
 *
 * @author gmisi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1 = new Point(2, 2);
        Shapes shapes = new Shapes();
        try {
            shapes.read("shapes2.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.exit(-1);
        }
        catch (UnknownShapeTypeException e) {
            System.out.println("Unknown type of shape!");
            System.exit(-1);
        }
        catch(InvalidFormatException e){
            System.out.println("Invalid format! \nCheck the input file!");
            System.exit(-1);
        }
        catch(IllegalArgumentException e) {
            System.out.println("Illegal argument!");
            System.exit(-1);
        }
        
        shapes.countOfShapeIncludeThePoint(p1);
    }
    
}
