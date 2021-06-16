package JogoXadrez.Chess;

import JogoXadrez.BoardGame.BoardException;

public class ChessExecption extends BoardException {
    private static final long serialVersionUID = 1L;

    public ChessExecption(String message) {
        super(message);
    }
}
