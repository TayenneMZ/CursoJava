package JogoXadrez.Pieces;

import JogoXadrez.BoardGame.Board;
import JogoXadrez.BoardGame.Position;
import JogoXadrez.Chess.ChessPiece;
import JogoXadrez.Chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //Above
        p.setValues(position.getRow() - 1, position.getColumn());

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
        }

        //Left
        p.setValues(position.getRow(), position.getColumn() - 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() - 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
        }

        //Right
        p.setValues(position.getRow(), position.getColumn() + 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
            p.setColumn(p.getColumn() + 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
        }

        //Below
        p.setValues(position.getRow() + 1, position.getColumn());

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() + 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
        }

        return matriz;
    }
}