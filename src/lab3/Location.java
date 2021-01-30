package lab3;

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

    /** сравнение позиций **/
    public boolean equals(Object obj) {

        // Проверим, является ли объект Location
        if (obj instanceof Location) {

            Location other = (Location) obj;
            if (xCoord == other.xCoord && yCoord == other.yCoord) {
                return true;
            }
        }

        return false;
    }

    /** получение хеш-кода для каждой позиции **/
    public int hashCode() {

        // случайное число
        int result = 13;

        // второе случайное число и вычисление
        result = 17 * result + xCoord;
        result = 17 * result + yCoord;

        return result;
    }
}