public class Circle {
    Double radius =1.0;
    public Circle(){
        radius=2.0;
    }
    public Circle(Double radius){
    this.radius = radius;
    }
    Double getRadius(){
        return radius;
    }
    void setRadius() {
        this.radius = radius;
    }
    double getArea() {
        double Area = Math.PI * (radius * radius);
         return Area;
    }
    double getCircumference(){
        double Circumference= 2*Math.PI*radius;
        return Circumference;
    }
    public String toString(){
        return "Circle[radius: "+radius+"]";
    }

    public static void main(String[] args) {
        Circle C1 = new Circle();
        System.out.println(C1.toString());
        System.out.println(C1.getRadius());
        System.out.println("Area: "+C1.getArea());
        System.out.println("Circumference: "+C1.getCircumference());
    }
}
