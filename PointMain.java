import java.util.Scanner;

class PointInput{
    int x,y;

    PointInput(){
        x=0;
        y=0;
    }

    PointInput(int x, int y){
        this.x=x;
        this.y=y;
    }

    void getData(){
        
        Scanner s= new Scanner(System.in);
        System.out.print("Enter x coordinate:");
        this.x=s.nextInt();
        System.out.print("Enter y coordinate:");
        this.y=s.nextInt();
        
    }

    double linesegment(PointInput p1, PointInput p2){

        int dx,dy;
        dx=p2.x-p1.x;
        dy=p2.y-p1.y;
        double m=(double)dy/dx;
        return m;
    }
    
}

public class PointMain {

    public static void main(String [] args){

        PointInput p0 = new PointInput();
        System.out.println("Coordinates are:("+p0.x+","+p0.y+")");
        PointInput p=new PointInput();
        p.getData();
        System.out.println("Coordinates are: ("+p.x+","+p.y+")");
        PointInput p1 = new PointInput();
        p1.getData();
        System.out.println("Coordinates are: ("+p1.x+","+p1.y+")");
        PointInput p2 = new PointInput();
        double gradient1 = p2.linesegment(p0, p);
        System.out.println("Gradient is:"+gradient1);
        PointInput p3 = new PointInput();
        double gradient2 = p3.linesegment(p0, p1);
        System.out.println("Gradient is:"+gradient2);
    }
    
}
