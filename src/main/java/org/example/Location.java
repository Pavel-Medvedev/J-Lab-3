package org.example;
/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    public boolean equals(Location other){
        return other==null || this==null?false:this==other?true:this.xCoord == other.xCoord && this.yCoord == other.yCoord;
    }
    @Override
    public int hashCode() {
        return 174017*this.xCoord+this.yCoord;
    }
}