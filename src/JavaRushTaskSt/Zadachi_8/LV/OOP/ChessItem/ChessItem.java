package JavaRushTaskSt.Zadachi_8.LV.OOP.ChessItem;

public class ChessItem {
        int x;
        int y;
        int worth;

    public static void main(String[] args) {

    }
}

class King extends ChessItem
{
    void kingMove()
    {
        // код, решающий,
        // как пойдет король
    }
}

class Knight extends ChessItem
{
    void knightMove()
    {
        // код, решающий,
        // как пойдет конь
    }
}
class Queen extends ChessItem
{
    void queenMove()
    {
        // код, решающий,
        // как пойдет ферзь
    }
}
class Rook extends ChessItem
{
    void rookMove()
    {
        // код, решающий,
        // как пойдет ладья
    }
}
class Bishop extends ChessItem
{
    void bishopMove()
    {
        // код, решающий,
        // как пойдет слон
    }
}
class Pawn extends ChessItem
{
    void pawnMove()
    {
        // код, решающий,
        // как пойдет пешка
    }
}