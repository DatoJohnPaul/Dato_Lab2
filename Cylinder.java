class Cylinder {
    double radius, height, area;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    void area() {
        area = 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    void displayArea() {
        System.out.println("Area of the cylinder: " + area);
    }
}

class CylinderVol extends Cylinder {

    CylinderVol(double r, double h) {
        super(r, h);
    }

    void volume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of the cylinder: " + volume);
    }
}
public class Main {
    public static void main(String[] args) {
        
        CylinderVol cylinder = new CylinderVol(5, 10);
       
        cylinder.area();
        cylinder.displayArea();
       
        cylinder.volume();
    }
}