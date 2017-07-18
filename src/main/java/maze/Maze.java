/*
 * MazeRunner Project !!!!
 */
package maze;


/**
 *
 * @author sminh
 */
public class Maze {
    
    public static final Integer AGENT = 5;
    public static final Integer GOAL = 10;
    
    public Integer[][] myMaze;
    
    public Maze(){
        
        myMaze[0][0] = 1;
        
        for(int i = 0; i < 5; i++){
            for(int j = 0 ; j < 5; j++){
                myMaze[i][j] = 1;
            }
        }
        
        myMaze[1][1] = AGENT;
        myMaze[2][1] = 0;
        
        myMaze[1][2] = 0;
        myMaze[2][2] = 0;
        myMaze[3][2] = 0;
        
        myMaze[1][3] = 0;
        myMaze[3][3] = GOAL;    
    }
    public Integer getElement(Integer x, Integer y){
        return myMaze[x][y];
    }
}
