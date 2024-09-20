package chess;

import java.util.ArrayList;
import java.util.Collection;

public class PawnMoveCalculator {
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        Collection<ChessMove> validMoves = new ArrayList<>();

        int currRow;
        int currCol;

        if (board.getPiece(myPosition).getTeamColor().equals(ChessGame.TeamColor.WHITE)){
            for (int i = 0; i < 4; i++){
                currCol = myPosition.getColumn();
                currRow = myPosition.getRow();

                //Initial Move 2 space
                if (i == 0){
                    if (myPosition.getRow() == 2){
                        currRow +=1;
                        if (inBounds(new ChessPosition(currRow,currCol))){
                            if (isSpaceEmpty(board, new ChessPosition(currRow,currCol))){
                                currRow +=1;
                                if(inBounds(new ChessPosition(currRow,currCol))){
                                    if(isSpaceEmpty(board, new ChessPosition(currRow,currCol))){
                                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow,currCol), null);
                                        validMoves.add(move);
                                    }
                                }
                            }
                        }
                    }
                }

                //Regular Move
                if (i == 1){
                    currRow += 1;
                    if (inBounds(new ChessPosition(currRow, currCol))){
                        if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                            if (currRow == 8){
                                validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.QUEEN));
                                validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.ROOK));
                                validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.KNIGHT));
                                validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.BISHOP));
                            }
                            else {
                                ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                                validMoves.add(move);
                            }
                        }else {
                            if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                            } else {
                                ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            }
                        }

                    }
                }
                // Up Right
                if (i == 2){
                    currRow += 1;
                    currCol += 1;
                    if (inBounds(new ChessPosition(currRow,currCol))){
                        if (!isSpaceEmpty(board, new ChessPosition(currRow,currCol))){
                            if (!sameTeam(board,new ChessPosition(currRow,currCol), myPosition)){
                                if(currRow == 8){
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.QUEEN));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.ROOK));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.KNIGHT));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.BISHOP));
                                }
                                else {
                                    ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow,currCol), null);
                                    validMoves.add(move);
                                }
                            }
                        }
                    }
                }
                // Up Left
                if (i == 3){
                    currRow += 1;
                    currCol -= 1;
                    if (inBounds(new ChessPosition(currRow,currCol))){
                        if (!isSpaceEmpty(board, new ChessPosition(currRow,currCol))){
                            if (!sameTeam(board,new ChessPosition(currRow,currCol), myPosition)){
                                if(currRow == 8){
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.QUEEN));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.ROOK));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.KNIGHT));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.BISHOP));
                                }
                                else {
                                    ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow,currCol), null);
                                    validMoves.add(move);
                                }
                            }
                        }
                    }
                }


            }
        }
        // end white
        if (board.getPiece(myPosition).getTeamColor().equals(ChessGame.TeamColor.BLACK)){
            for (int i = 0; i < 4; i++){
                currCol = myPosition.getColumn();
                currRow = myPosition.getRow();

                //Initial Move 2 space
                if (i == 0){
                    if (myPosition.getRow() == 7){
                        currRow -=1;
                        if (inBounds(new ChessPosition(currRow,currCol))){
                            if (isSpaceEmpty(board, new ChessPosition(currRow,currCol))){
                                currRow -=1;
                                if(inBounds(new ChessPosition(currRow,currCol))){
                                    if(isSpaceEmpty(board, new ChessPosition(currRow,currCol))){
                                        ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow,currCol), null);
                                        validMoves.add(move);
                                    }
                                }
                            }
                        }
                    }
                }

                //Regular Move
                if (i == 1){
                    currRow -= 1;
                    if (inBounds(new ChessPosition(currRow, currCol))){
                        if (isSpaceEmpty(board, new ChessPosition(currRow, currCol))){
                            if (currRow == 1){
                                validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.QUEEN));
                                validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.ROOK));
                                validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.KNIGHT));
                                validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.BISHOP));
                            }
                            else {
                                ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                                validMoves.add(move);
                            }
                        }else {
                            if (sameTeam(board, new ChessPosition(currRow, currCol), myPosition)) {
                            } else {
                                ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow, currCol), null);
                            }
                        }

                    }
                }
                // Down Right
                if (i == 2){
                    currRow -= 1;
                    currCol += 1;
                    if (inBounds(new ChessPosition(currRow,currCol))){
                        if (!isSpaceEmpty(board, new ChessPosition(currRow,currCol))){
                            if (!sameTeam(board,new ChessPosition(currRow,currCol), myPosition)){
                                if(currRow == 1){
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.QUEEN));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.ROOK));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.KNIGHT));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.BISHOP));
                                }
                                else {
                                    ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow,currCol), null);
                                    validMoves.add(move);
                                }
                            }
                        }
                    }
                }
                // Down Left
                if (i == 3){
                    currRow -= 1;
                    currCol -= 1;
                    if (inBounds(new ChessPosition(currRow,currCol))){
                        if (!isSpaceEmpty(board, new ChessPosition(currRow,currCol))){
                            if (!sameTeam(board,new ChessPosition(currRow,currCol), myPosition)){
                                if(currRow == 1){
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.QUEEN));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.ROOK));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.KNIGHT));
                                    validMoves.add(new ChessMove(myPosition, new ChessPosition(currRow,currCol), ChessPiece.PieceType.BISHOP));
                                }
                                else {
                                    ChessMove move = new ChessMove(myPosition, new ChessPosition(currRow,currCol), null);
                                    validMoves.add(move);
                                }
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
        if (position.getColumn() > 8){
            return false;
        }
        if (position.getRow() < 1){
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
