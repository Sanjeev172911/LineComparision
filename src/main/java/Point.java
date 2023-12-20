class Point {
    int xCord;
    int yCord;
    public Point(int x,int y){
        this.xCord=x;
        this.yCord=y;
    }

    public Point(){
        System.out.println("this is the point constructor");
    }

    public boolean compare(Point p1){
        if(p1.xCord==this.xCord && p1.yCord==this.yCord) return true;
        return false;
    }

}

