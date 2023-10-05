public class EmptyCell implements Cell
{
    Cell up;
    Cell down;
    Cell left;
    Cell rigth;
    Direction snakeDirection;
    public EmptyCell(Cell up, Cell down, Cell left, Cell rigth, Direction snakeDirection) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.rigth = rigth;
        this.snakeDirection = snakeDirection;
    }
    @Override
    public Drawer drawer()
    {
        return g -> {};    
    }
    public CellEnum current()
    {
        return CellEnum.EMPTY;
    }
    public CellEnum next()
    {
        CellEnum next = CellEnum.EMPTY;
        switch(snakeDirection.getDirection())
        {
            case DOWN:
                if(up.current() == CellEnum.HEAD) next = CellEnum.HEAD;
            case LEFT:
                if(rigth.current() == CellEnum.HEAD) next = CellEnum.HEAD;
            case RIGHT:
                if(left.current() == CellEnum.HEAD) next = CellEnum.HEAD;
            case UP:
                if(down.current() == CellEnum.HEAD) next = CellEnum.HEAD;
        }
        return next;
    }    
}
