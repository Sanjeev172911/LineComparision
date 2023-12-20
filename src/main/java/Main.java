import java.util.Scanner;

public class Main {
    public static Line takeInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of 1st point ");
        int p1X=input.nextInt();
        int p1Y=input.nextInt();

        System.out.println("Enter the Co-ordinates of 2nd point ");
        int p2X=input.nextInt();
        int p2Y=input.nextInt();

        Point p1=new Point(p1X,p1Y);
        Point p2=new Point(p2X,p2Y);

        return new Line(p1,p2);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line\n" +
                "Comparison Computation");

        Line line1=takeInput();
        Line line2=takeInput();

        System.out.println("Length of 1st line "+line1.length);

        boolean isSameLine=line1.isEqual(line2);

        if(isSameLine) System.out.println("Both the lines are same");
        else System.out.println("Lines are not same");

        line1.compareLine(line2);
    }
}
