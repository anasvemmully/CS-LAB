// Write a java program to find the 
// volume of cube, rectangular box, 
// cylinder using function overloading.

import java.util.*;

class solid{

    int volume(int a){
        return a*a*a;
    }
    int volume(int a,int b,int h){
        return a*b*h;
    }
    double volume(int r,int h){
        return 3.14*r*r*h;
    }

}

public class pg17 {
    public static void main(String[] args){
    int a,v,l,b,h,r;
       Scanner sc =new Scanner(System.in);
       System.out.println("Choose option to find the volume of one of the following : \n1.Cube\n2.Cuboid\n3.Cylinder\n");
       solid shape = new solid();
       switch (sc.nextLine()) {
           case "1":
                System.out.println("\nEnter the side of the cube : ");
                a = sc.nextInt();
                v = shape.volume(a);
                System.out.println("\nVolume of cube  : " + v);
                sc.close();
               break;
            case "2":
                System.out.println("\nEnter the length of the cuboid : ");
                l = sc.nextInt();
                System.out.println("\nEnter the breadth of the cuboid : ");
                b = sc.nextInt();
                System.out.println("\nEnter the height of the cuboid : ");
                h = sc.nextInt();
                v = shape.volume(l,b,h);
                System.out.println("\nVolume of cuboid  : " + v);
                sc.close();
                break;
            case "3":
                System.out.println("\nEnter the radius of the cylinder : ");
                r = sc.nextInt();
                System.out.println("\nEnter the height of the cylinder : ");
                h = sc.nextInt();
                double vo = shape.volume(r,h);
                System.out.println("\nVolume of cuboid  : " + vo);
                sc.close();
                break;
           default:
                System.out.println("\nInvalid Option");
                sc.close();
                break;
       }

    }
}
