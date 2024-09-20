package chess;

import java.util.ArrayList;
import java.util.Collection;

public class RookMoveCalculator {

    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition){
        Collection<ChessMove> validMoves = new ArrayList<>();

        int currRow;
        int currCol;

        //Right, Left, Up, Down

        for (int i = 0; i < 4; i++){
            currRow = myPosition.getRow();
            currCol = myPosition.getColumn();

            //Right
            if (i == 0){
                while (currCol < 8){
                    currCol += 1;
                    if (inBounds(new ChessPosition(currRow, currCol))){
                        if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }
                        else {
                            if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)){
                                break;
                            }
                            else{
                                ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                                validMoves.add(move);
                                break;
                            }
                        }
                    }
                }
            }
            // Left
            if (i == 1){
                while (currCol > 1){
                    currCol -= 1;
                    if (inBounds(new ChessPosition(currRow, currCol))){
                        if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }else {
                            if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                                break;
                            } else {
                                ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                                validMoves.add(move);
                                break;
                            }
                        }

                    }
                }

            }
            // Down
            if (i == 2){
                while (currRow > 1){
                    currRow -= 1;
                    if (inBounds(new ChessPosition(currRow, currCol))){
                        if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }else {
                            if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                                break;
                            } else {
                                ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                                validMoves.add(move);
                                break;
                            }
                        }

                    }
                }

            }
            // Up

            if (i == 3){
                while (currRow < 8){
                    currRow += 1;
                    if (inBounds(new ChessPosition(currRow, currCol))){
                        if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                            ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            validMoves.add(move);
                        }else {
                            if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                                break;
                            } else {
                                ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                                validMoves.add(move);
                                break;
                            }
                        }

                    }
                }

            }


        }

        return validMoves;
    }


    private Boolean inBounds(ChessPosition position){
        if (position.getRow() > 8){
            return false;
        }
        if (position.getRow() < 1){
            return false;
        }
        if (position.getColumn() > 8){
            return false;
        }
        if (position.getColumn() < 1){
            return false;
        }
        return true;
    }

    private Boolean isSpaceEmpty(ChessBoard board, ChessPosition position){
        if (board.getPiece(position) == null){
            return true;
        }
        return false;
    }

    private Boolean sameTeam(ChessBoard board, ChessPosition newPosition, ChessPosition position){
        if (board.getPiece(position).getTeamColor().equals(ChessGame.TeamColor.WHITE) == board.getPiece(newPosition).getTeamColor().equals(ChessGame.TeamColor.WHITE)){
            return true;
        }
        if (board.getPiece(position).getTeamColor().equals(ChessGame.TeamColor.BLACK) == board.getPiece(newPosition).getTeamColor().equals(ChessGame.TeamColor.BLACK)){
            return true;
        }
        return false;
    }

}
