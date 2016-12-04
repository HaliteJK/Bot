public class Move {
    public Location loc;
    public Direction dir;

    public Move(Location loc_) {
        loc = loc_;
        dir = makeMove();
    }
    
    public Direction makeMove(){
    	if(site.strength == 0){
    		return Direction.fromInteger(0);
    	}
    	return Direction.randomDirection();
    }
}
