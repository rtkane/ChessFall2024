package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KnightMoveCalculator {
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
        Collection<ChessMove> validMoves = new ArrayList<>();

        int currRow;
        int currCol;

        //Up-right,
        for (int i = 0; i < 8; i++){
            currRow = myPosition.getRow();
            currCol = myPosition.getColumn();

            // Up 2 Right 1
            if (i == 0){
                currRow += 2;
                currCol += 1;
                if (inBounds(new ChessPosition(currRow, currCol))){
                    if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                        validMoves.add(move);
                    }else {
                        if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                        } else {
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                    }

                }
            }

            // Up 1 Right 2
            if (i == 1){
                currRow += 1;
                currCol += 2;

                if (inBounds(new ChessPosition(currRow, currCol))){
                    if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                        validMoves.add(move);
                    }else {
                        if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                        } else {
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                    }

                }
            }
            // Up 1 Right 2
            if (i == 2){
                currRow -= 1;
                currCol += 2;


                if (inBounds(new ChessPosition(currRow, currCol))){
                    if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                        validMoves.add(move);
                    }else {
                        if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                        } else {
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                    }

                }
            }
            // Down 2 Right 1
            if (i == 3){
                currRow -= 2;
                currCol += 1;

                if (inBounds(new ChessPosition(currRow, currCol))){
                    if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                        validMoves.add(move);
                    }else {
                        if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                        } else {
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                    }

                }
            }
            // Down 2 Left 1
            if (i == 4){
                currRow -= 2;
                currCol -= 1;


                if (inBounds(new ChessPosition(currRow, currCol))){
                    if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                        validMoves.add(move);
                    }else {
                        if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                        } else {
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                    }

                }
            }
            // Down 1 Left 2
            if (i == 5){
                currRow -= 1;
                currCol -= 2;

                if (inBounds(new ChessPosition(currRow, currCol))){
                    if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                        validMoves.add(move);
                    }else {
                        if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                        } else {
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                    }

                }
            }
            // Up 1 Left 2
            if (i == 6){
                currRow += 1;
                currCol -= 2;


                if (inBounds(new ChessPosition(currRow, currCol))){
                    if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                        validMoves.add(move);
                    }else {
                        if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                        } else {
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                    }

                }
            }
            // Up 2 Left 1
            if (i == 7){
                currRow += 2;
                currCol -= 1;

                if (inBounds(new ChessPosition(currRow, currCol))){
                    if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                        validMoves.add(move);
                    }else {
                        if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                        } else {
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                    }

                }
            }


        }

        return validMoves;
    }
    private Boolean inBounds(ChessPosition position) {
        if (position.getRow() > 8) {
            return false;
        }
        if (position.getRow() < 1) {
            return false;
        }
        if (position.getColumn() > 8) {
            return false;
        }
        if (position.getColumn() < 1) {
            return false;
        }
        return true;
    }

    private Boolean isSpaceEmpty(ChessBoard board, ChessPosition position) {
        if (board.getPiece(position) == null) {
            return true;
        }
        return false;
    }

    private Boolean sameTeam(ChessBoard board, ChessPosition newPosition, ChessPosition position) {
        if (board.getPiece(position).getTeamColor().equals(ChessGame.TeamColor.WHITE) == board.getPiece(newPosition).getTeamColor().equals(ChessGame.TeamColor.WHITE)) {
            return true;
        }
        if (board.getPiece(position).getTeamColor().equals(ChessGame.TeamColor.BLACK) == board.getPiece(newPosition).getTeamColor().equals(ChessGame.TeamColor.BLACK)) {
            return true;
        }
        return false;
    }
}
