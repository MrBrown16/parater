public class Paralelogramma {
    
    double paraArea(double[] info){
        double sideA = info[0];
        double sideB = info[1];
        double angle = info[2];
        double area = sideA*sideB*Math.sin(Math.toRadians(angle));
        return area;
    }
    
}
