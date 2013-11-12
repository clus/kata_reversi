
public class Reversi {
	
	private Reversi reversi = new Reversi();
	private Player blackPlayer = new Player();
	private Player whitePlayer = new Player();
	
	public String[] afficherInitialGrid(){
		String[] initialGrid= {
				"........",
				"........",
				"........",
				"...BW...",
				"...WB...",
				"........",
				"........",
				"........"};		
		return initialGrid;
	}
	
	public String afficherGridForTurnToBlack(){
		String gridForTurnToBlack= 
				"........\n" +
				"........\n" +
				"....0...\n" +
				"...BW0..\n" +
				"..0WB...\n" +
				"...0....\n" +
				"........\n" +
				"........\n" ;	
		return gridForTurnToBlack;
	}


	public String afficherLegalMoves(String input) {
		return afficherGridForTurnToBlack() ;
		
	}
	
	public String chooseMove() {
		if(blackPlayer.turnToMove()) {
			
		}
			
	}

	public String afficherResultMove(String input) {
		return chooseMove();
	}
	

	
	
	
	
	public Reversi(){
		reversi.afficherInitialGrid();
		blackPlayer.setCouleur("B");
		whitePlayer.setCouleur("W");
					
	}
}
