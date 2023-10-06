public interface Cell
{
    Drawer getDrawer();
    Cell nextCellState(Snake snake, Cell[][] map, int x, int y);
}
