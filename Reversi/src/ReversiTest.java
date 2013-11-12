import static org.junit.Assert.*;

import org.junit.Test;


public class ReversiTest {

	@Test
	public void legalMovesForPlayerBlack() {
		String input = 
				"........\n" +
				"........\n" +
				"........\n" +
				"...BW...\n" +
				"...WB...\n" +
				"........\n" +
				"........\n" +
				"........\n" ;
		
		String output = 
				"........\n" +
				"........\n" +
				"....0...\n" +
				"...BW0..\n" +
				"..0WB...\n" +
				"...0....\n" +
				"........\n" +
				"........\n" ;
		
		Reversi reversi = new Reversi();
		assertEquals(output, reversi.afficherLegalMoves(input));
				
	}
	
	@Test
	public void positionChoosenByPlayerBlack() {
		String input = 
				"........\n" +
				"........\n" +
				"....0...\n" +
				"...BW0..\n" +
				"..0WB...\n" +
				"...B....\n" +
				"........\n" +
				"........\n" ;
		
		String output = 
				"........\n" +
				"........\n" +
				"........\n" +
				"...BW...\n" +
				"...BB...\n" +
				"...B....\n" +
				"........\n" +
				"........\n" ;
		
		Reversi reversi = new Reversi();
		assertEquals(output, reversi.afficherResultMove(input));
				
	}

}
