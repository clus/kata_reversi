
public class BlackPlayer extends Reversi {

	public String[][] printLegalMoves(String[][] input) {

		String ouput[][] = initialGrille;

		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				if(initialGrille[i][j]=="B"){

					if(initialGrille[i-1][j-1]=="W" 	&& initialGrille[i-2][j-2]==".")    initialGrille[i-2][j-2]="O";
					if(initialGrille[i-1][j]=="W" 		&& initialGrille[i-2][j]==".")		initialGrille[i-2][j]="O";
					if(initialGrille[i-1][j+1]=="W"		&& initialGrille[i-2][j+2]==".")	initialGrille[i-2][j+2]="O";
					if(initialGrille[i][j-1]=="W" 		&& initialGrille[i][j-2]==".")		initialGrille[i][j-2]="O";
					if(initialGrille[i][j+1]=="W" 		&& initialGrille[i][j+2]==".")		initialGrille[i][j+2]="O";
					if(initialGrille[i+1][j-1]=="W"		&& initialGrille[i+2][j-2]==".")	initialGrille[i+2][j-2]="O";
					if(initialGrille[i+1][j]=="W"		&& initialGrille[i+2][j]==".")		initialGrille[i+2][j]="O";
					if(initialGrille[i+1][j+1]=="W" 	&& initialGrille[i][j+2]==".")		initialGrille[i][j+2]="O";

				}
		return ouput;

	}

	
	public String[][] printMoveForPlayerBlack(String[][] input) {
		
		String ouput[][] = input ;
		
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				if(ouput[i][j]=="W"){
					
					if(ouput[i-1][j]=="B" 	&& ouput[i+1][j]=="B" )	   	ouput[i][j]="B";
					if(ouput[i][j-1]=="B" 	&& ouput[i][j+1]=="B" )	   	ouput[i][j]="B";
					if(ouput[i-1][j-1]=="B" && ouput[i+1][j+1]=="B" )	ouput[i][j]="B";
					if(ouput[i-1][j+1]=="B" && ouput[i+1][j-1]=="B" )	ouput[i][j]="B";
													
					}
		return ouput;
	}



}

