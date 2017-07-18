/*
 * MazeRunner Project !!!!
 */
package agent;

import agent.ActualPosition;
import java.util.ArrayList;
import java.util.List;
import maze.MazePosition;

/**
 *
 * @author sminh
 */
public class Directions {
    
    Integer availableDirection(ActualPosition actualPosition){
        Integer count = 0;
        MazePosition mazePosition = new MazePosition(actualPosition);
        List<Integer> directionList = new ArrayList<>();
        directionList.add(mazePosition.getUp(mazePosition));
        directionList.add(mazePosition.getDown(mazePosition));
        directionList.add(mazePosition.getLeft(mazePosition));
        directionList.add(mazePosition.getRight(mazePosition));
        for(Integer i : directionList){
            if(i != 0){count++;}
        }
        return count;
    }
}
