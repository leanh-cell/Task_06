import java.awt.geom.Area;

public class Rectangle {
    float length=1.0f;
    float width=1.0f;
    public Rectangle(){
        length=5.0f;
        width=3.0f;
    }
    public Rectangle(float length,float width){
        this.width=width;
        this.length=length;
    }
    float getLength(){
        return length;
    }
    void setLength(float length){
        this.length=length;
    }
    float getWidth(){
        return width;
    }
    void setWidth(float width){
        this.width=width;
    }
    double getArea(){
      double Area = length*width;
        return Area;
    }
    double getPerimeter(){
        double Perimeter=(length+width)*2;
        return Perimeter;
    }
    public String toString(){
        return  "Rectangle[ length= "+length+" , Width= "+width+"]";
    }

    public static void main(String[] args) {
        Rectangle R1 =new Rectangle();
        System.out.println("the area rectangle is: "+R1.getArea());
        System.out.println("the perimeter is: "+R1.getPerimeter());
        System.out.println(R1.toString());
    }

}
