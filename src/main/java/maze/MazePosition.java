/*
 * MazeRunner Project !!!!
 */
package maze;

import agent.ActualPosition;
import caracteristics.Position;

/**
 *
 * @author sminh
 */
public class MazePosition implements Position{
    
    protected Integer global_x, global_y;
    Maze myMaze = new Maze();
    
    public MazePosition(ActualPosition actualPosition){
        global_x = actualPosition.getX() + 1;
        global_y = actualPosition.getY() + 1;
    }
    
    @Override
    public Integer getX(){
        return global_x;
    }
    
    @Override
    public Integer getY(){
        return global_y;
    }
    
    public Integer getUp(MazePosition position){
        return myMaze.getElement(position.getX(), position.global_y - 1);
    }
    
    public Integer getDown(MazePosition position){
        return myMaze.getElement(position.getX(), position.global_y + 1);
    }
    
    public Integer getLeft(MazePosition position){
        return myMaze.getElement(position.getX() - 1, position.global_y);
    }
    
    public Integer getRight(MazePosition position){
        return myMaze.getElement(position.getX() + 1, position.global_y);
    }
}
