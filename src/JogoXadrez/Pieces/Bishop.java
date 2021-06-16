package JogoXadrez.Pieces;

import JogoXadrez.BoardGame.Board;
import JogoXadrez.BoardGame.Piece;
import JogoXadrez.BoardGame.Position;
import JogoXadrez.Chess.ChessPiece;
import JogoXadrez.Chess.Color;

public class Bishop extends ChessPiece {
    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //Northwest
        p.setValues(position.getRow() - 1, position.getColumn() - 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() - 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
        }

        //Northeast
        p.setValues(position.getRow() - 1, position.getColumn() + 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
        }

        //Southeast
        p.setValues(position.getRow() + 1, position.getColumn() + 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
        }

        //Southwest
        p.setValues(position.getRow() + 1, position.getColumn() - 1);

        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() - 1);
        }

        if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
            matriz[p.getRow()][p.getColumn()] = true;
        }

        return matriz;
    }
}
