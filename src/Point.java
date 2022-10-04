public class Point {

    private int x;
    private int y;

    // constructor setter
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // constructor one value
    public Point(int oneValue)
    {
        x = oneValue;
        y = oneValue;
    }

    // constructor no parameter
    public Point()
    {
        x = 0;
        y = 0;
    }

    // getter method for x
    public int getX()
    {
        return x;
    }

    // getter method for y
    public int getY()
    {
        return y;
    }

    // setter method for x
    public void setX(int newX)
    {
        x = newX;
    }

    // setter method for y
    public void setY(int newY)
    {
        y = newY;
    }

    // coordinate method
    public String coordinate()
    {
        return "(" + x + ", " + y + ")";
    }

    // quadrant method
    public String quadrant()
    {
        if (x > 0 && y > 0)
        {
            return "I";
        }
        if (x > 0 && y < 0)
        {
            return "IV";
        }
        if (x < 0 && y > 0)
        {
            return "II";
        }
        if (x < 0 && y < 0)
        {
            return "III";
        }
        if (x == 0 && y == 0)
        {
            return "origin";
        }
        if ((x == 0 && (y > 0 || y < 0)) || ((x > 0 || x < 0) && y == 0))
        {
            return "on an axis";
        }
        return "0";
    }
}
