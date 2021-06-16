package JogoXadrez.BoardGame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMoves(Position position){
        /*Hook methods
        Tenho um método concreto utilizando um método abstrato*/
        System.out.print("");
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] matriz = possibleMoves();

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                if (matriz[linha][coluna]){
                    return true;
                }
            }
        }

        return false;
    }
}
