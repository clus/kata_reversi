import static org.junit.Assert.*;

import org.junit.Test;


public class ReversiTest {

	@Test
	public void legalMovesForPlayerBlack() {
		String[][] input= 
			{
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".","B","W",".",".","."},
				{".",".",".","W","B",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}};
		
		String[][]output = 
			{
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".","O",".",".","."},
				{".",".",".","B","W","O",".","."},
				{".",".","O","W","B",".",".","."},
				{".",".",".","O",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}};
		
		Reversi reversi = new Reversi();
		assertArrayEquals(output, reversi.printLegalMovesBlack(input));
				
	}
	
	@Test
	public void printMoveForPlayerBlack() {
		String[][] input= 
			{
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".","B","W",".",".","."},
				{".",".",".","W","B",".",".","."},
				{".",".",".","B",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}};
		
		String[][]output = 
			{
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".","B","W",".",".","."},
				{".",".",".","B","B",".",".","."},
				{".",".",".","B",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}};
		
		Reversi reversi = new Reversi();
		assertArrayEquals(output, reversi.printMoveForPlayerBlack(input));
				
	}
	
	@Test
	public void legalMovesForPlayerWhite() {
		String[][] input= 
			{
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".","B","W",".",".","."},
				{".",".",".","W","B",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}};
		
		String[][]output = 
			{
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".","O",".",".",".","."},
				{".",".","O","B","W",".",".","."},
				{".",".",".","W","B","O",".","."},
				{".",".",".",".","O",".",".","."},
				{".",".",".",".",".",".",".","."},
				{".",".",".",".",".",".",".","."}};
		
		Reversi reversi = new Reversi();
		assertArrayEquals(output, reversi.printLegalMovesWhite(input));
				
	}


}
