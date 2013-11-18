
public class Reversi {

	protected String[][] initialGrille = new String [8][8] ;


	public Reversi(){

		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				initialGrille[i][j]=".";

		initialGrille[3][3] = "B" ;
		initialGrille[3][4] = "W" ;
		initialGrille[4][3] = "W" ;
		initialGrille[4][4] = "B" ;

	}

	public String[][] printLegalMoves(String[][] input, String player){

		String ouput[][] = initialGrille;
		String parametre ;

		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				if(initialGrille[i][j]==player){
					if(player == "B")
						parametre = "W" ;
					else parametre = "B" ;

					if(initialGrille[i-1][j-1]==parametre 	&& initialGrille[i-2][j-2]==".")    initialGrille[i-2][j-2]="O";
					if(initialGrille[i-1][j+1]==parametre	&& initialGrille[i-2][j+2]==".")	initialGrille[i-2][j+2]="O";
					if(initialGrille[i-1][j]==parametre 	&& initialGrille[i-2][j]==".")		initialGrille[i-2][j]="O";
					if(initialGrille[i][j-1]==parametre 	&& initialGrille[i][j-2]==".")		initialGrille[i][j-2]="O";
					if(initialGrille[i][j+1]==parametre 	&& initialGrille[i][j+2]==".")		initialGrille[i][j+2]="O";
					if(initialGrille[i+1][j-1]==parametre	&& initialGrille[i+2][j-2]==".")	initialGrille[i+2][j-2]="O";
					if(initialGrille[i+1][j]==parametre		&& initialGrille[i+2][j]==".")		initialGrille[i+2][j]="O";
					if(initialGrille[i+1][j+1]==parametre 	&& initialGrille[i][j+2]==".")		initialGrille[i][j+2]="O";

				}
		return ouput;

	}



	public String[][] printMoveForPlayer(String[][] input, String player) {

		String output[][] = input ;
		String parametre ;

		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				if(output[i][j]==player){
					if(player == "B")
						parametre = "W" ;
					else parametre = "B" ;

					if(output[i-1][j]==parametre 	&& output[i+1][j]==parametre )	   	output[i][j]=parametre;
					if(output[i][j-1]==parametre 	&& output[i][j+1]==parametre )	   	output[i][j]=parametre;
					if(output[i-1][j-1]==parametre	&& output[i+1][j+1]==parametre )	output[i][j]=parametre;
					if(output[i-1][j+1]==parametre 	&& output[i+1][j-1]==parametre )	output[i][j]=parametre;

				}
		return output;
	}
}
