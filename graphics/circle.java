package graphics;
interface circleinterface
{
    void area(int r);
}
public class circle implements circleinterface{
    public void area(int r)
    {
        System.out.println("area of circle:"+(3.14*r*r));
    }
}