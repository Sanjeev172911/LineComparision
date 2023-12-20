public class Line {
    double length;
    Point p1;
    Point p2;
    Line(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
        this.length=Math.sqrt(Math.pow(p1.xCord-p2.xCord,2)+Math.pow(p1.yCord-p2.yCord,2));
    }

    public boolean isEqual(Line line2){
        if(this.p1.compare(line2.p1) && this.p2.compare(line2.p2)) return true;
        else if(this.p1.compare(line2.p2) && this.p2.compare(line2.p1)) return true;
        else return false;
    }

    public void compareLine(Line line2){
        if(this.length==line2.length) System.out.println("Both Lines are Equal in length");
        else if(this.length>line2.length) System.out.println("Length of 1st line is Greater than other line");
        else System.out.println("Length of 1st line is smaller than other line");
    }

}
