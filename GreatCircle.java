// Floating-point numbers and the Math library. The great-circle distance is the length of the shortest path between two points (x1,y1) and (x2,y2) on the surface of a sphere, where the path is constrained to be along the surface
public class GreatCircle {
    public static void main(String[] args) {
        //The great-circle distance is the length of the shortest path between two points (x1,y1) and (x2,y2) on the surface of a sphere, where the path is constrained to be along the surface
        x1 = Double.parseDouble(args[0]);
        y1 = Double.parseDouble(args[1]);
        x2 = Double.parseDouble(args[2]);
        y2 = Double.parseDouble(args[3]);
        //return the length of the shortest path between two points (x1,y1) and (x2,y2) on the surface of a sphere, where the path is constrained to be along the surface
        double distance = Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println(distance);
    }
}
