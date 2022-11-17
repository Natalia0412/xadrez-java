package application;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public class Program {
    public static void main(String[] args) {
        Position ps=new Position(3,5);
        System.out.println(ps);
        Board board =new Board(8,8);

    }
}
