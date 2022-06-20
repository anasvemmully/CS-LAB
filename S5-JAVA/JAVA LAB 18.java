// Create an interface volume with member variable pi and 
// method readdata() and dispvolume(). create two classes 
// sphere and cylinder to implement this interface.Write
// a Java program to find the volume

import java.util.Scanner;

interface volume {
    double pi = 3.14;
    void readdata(); // interface method (does not have a body)
    void dispvolume(); // interface method (does not have a body)
  }

public class pg18{
    public static void main(String args[]){
        Sphere sphere = new Sphere();
        sphere.readdata();
        sphere.dispvolume();

        Cylinder cylinder = new Cylinder();
        cylinder.readdata();
        cylinder.dispvolume();
    }
}

class Sphere implements volume{

    int r;
    public void readdata(){
        System.out.println("Enter the radius for the sphere: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
    }
    public void dispvolume(){
        double v;
        v = pi*r*r*r*1.34;
        System.out.println("Volume : "+ v);    
    }    
}
class Cylinder implements volume{
    int r,h;
    public void readdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height for the cylinder: ");
        r=sc.nextInt();
        h=sc.nextInt();
        sc.close();
    }
    public void dispvolume(){
        double v;
        v = pi*r*r*h;
        System.out.println("Volume : "+ v);
    }
}