package prob4;

public class Floor {
    int floorLength;
    int floorBreadth;

    public Floor(int length, int breadth) {
        this.floorLength=length;
        this.floorBreadth=breadth;
    }
    double totalTiles(Tile t){
        double floorArea=floorLength*floorBreadth;
        double tileCount=floorArea/t.getArea();
        return tileCount;
    }
}
