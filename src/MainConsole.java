public class MainConsole {
    
    public MainConsole() {
    input bev = new input();
    double[] info =bev.paraInput();
    Paralelogramma para = new Paralelogramma();
    double area = para.paraArea(info);    
    System.out.println("Area: "+area);    
    }

}
