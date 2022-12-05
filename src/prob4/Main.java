package prob4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the edge length of the tile");
        int edge= sc.nextInt();
        Tile ob = new Tile(edge);
        System.out.println("Enter the length and Width of the room");
        int length= sc.nextInt();
        int breadth=sc.nextInt();
        Floor f = new Floor(length,breadth);
        double a=f.totalTiles(ob);
        System.out.println("The total number of tiles needed is ");
        System.out.println(a);

    }
}