public class Line {
    double length;
    Line(Point p1,Point p2){
        this.length=Math.sqrt(Math.pow(p1.xCord-p2.xCord,2)+Math.pow(p1.yCord-p2.yCord,2));
    }

}
