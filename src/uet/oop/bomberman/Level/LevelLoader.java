package uet.oop.bomberman.Level;

import uet.oop.bomberman.Board;
import uet.oop.bomberman.Exceptions.LoadLevelException;

public abstract class LevelLoader {

    protected int width = 20, height = 20; // default values just for testing
    protected int level;
    protected Board board;

    public LevelLoader(Board board, int level) throws LoadLevelException {
        this.board = board;
        loadLevel(level);
    }

    public abstract void loadLevel(int level) throws LoadLevelException;

    public abstract void createEntities();

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLevel() {
        return level;
    }

}
