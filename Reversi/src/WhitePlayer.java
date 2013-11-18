
public class WhitePlayer extends Reversi {

	public String[][] printLegalMoves(String[][] input) {

		String ouput[][] = initialGrille;

		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				if(initialGrille[i][j]=="W"){

					if(initialGrille[i-1][j-1]=="B" 	&& initialGrille[i-2][j-2]==".")    initialGrille[i-2][j-2]="O";
					if(initialGrille[i-1][j]=="B" 		&& initialGrille[i-2][j]==".")		initialGrille[i-2][j]="O";
					if(initialGrille[i-1][j+1]=="B"		&& initialGrille[i-2][j+2]==".")	initialGrille[i-2][j+2]="O";
					if(initialGrille[i][j-1]=="B" 		&& initialGrille[i][j-2]==".")		initialGrille[i][j-2]="O";
					if(initialGrille[i][j+1]=="B" 		&& initialGrille[i][j+2]==".")		initialGrille[i][j+2]="O";
					if(initialGrille[i+1][j-1]=="B"		&& initialGrille[i+2][j-2]==".")	initialGrille[i+2][j-2]="O";
					if(initialGrille[i+1][j]=="B"		&& initialGrille[i+2][j]==".")		initialGrille[i+2][j]="O";
					if(initialGrille[i+1][j+1]=="B" 	&& initialGrille[i][j+2]==".")		initialGrille[i][j+2]="O";

				}
		return ouput;

	}
	
public String[][] printMoveForPlayerWhite(String[][] input) {
		
		String ouput[][] = initialGrille;
		
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				if(initialGrille[i][j]=="B"){
					
					if(initialGrille[i-1][j]=="W" 	&& initialGrille[i+1][j]=="W" )	   	initialGrille[i][j]="W";
					if(initialGrille[i][j-1]=="W" 	&& initialGrille[i][j+1]=="W" )	   	initialGrille[i][j]="W";
					if(initialGrille[i-1][j-1]=="W" && initialGrille[i+1][j+1]=="W" )	initialGrille[i][j]="W";
					if(initialGrille[i-1][j+1]=="W" && initialGrille[i+1][j-1]=="W" )	initialGrille[i][j]="W";
													
					}
		return ouput;
	}

}
