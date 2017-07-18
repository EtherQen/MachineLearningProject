/*
 * MazeRunner Project !!!!
 */
package agent;

import caracteristics.Position;

/**
 *
 * @author sminh
 */
public class ActualPosition implements Position{
    
    protected Integer x_pos, y_pos;
    
    ActualPosition(Integer x, Integer y){
        x_pos = x;
        y_pos = y;
    }
    
    @Override
    public Integer getX(){
        return x_pos;
    }
    
    @Override
    public Integer getY(){
        return y_pos;
    }
    
    public ActualPosition getActualPosition(){
        return new ActualPosition(x_pos, y_pos);
    }
}
