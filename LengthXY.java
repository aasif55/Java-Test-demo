import java.util.*;

public class LengthXY {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the pointx1 = ");
        int x1=scan.nextInt();
        System.out.println("Enter the pointy1 = ");
        int y1=scan.nextInt();
        System.out.println("(x1,y1) Coordinates of the lines are: " + x1 + ", " +y1);

        System.out.println("Enter the pointx2 = ");
        int x2=scan.nextInt();
        System.out.println("Enter the pointy2 = ");
        int y2=scan.nextInt();
        System.out.println("(x2,y2) Coordinates of the lines are: " + x2 + ", " +y2);

        double length = (double)Math.sqrt((Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
        System.out.println("Length of the line is: "+length);
    }
}