
public class Reversi {
	
	private String[][] initialGrille = new String [8][8] ;
	
	public Reversi(){
		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				initialGrille[i][j]=".";
		
		initialGrille[3][3] = "B" ;
		initialGrille[3][4] = "W" ;
		initialGrille[4][3] = "W" ;
		initialGrille[4][4] = "B" ;

	}
	
	public String[][] printLegalMovesWhite(String[][] input) {
		
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
	
		public String[][] printLegalMovesBlack(String[][] input) {
			
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
		
		public String[][] choosenPositionByPlayerBlack(String[][] input) {
			
			
			return input;
			
			
		}

		public String[][] printMoveForPlayerBlack(String[][] input) {
		
			String ouput[][] = initialGrille;
			
			for(int i=0;i<8;i++)
				for(int j=0;j<8;j++)
					if(initialGrille[i][j]=="W"){
						
						if(initialGrille[i-1][j]=="B" 	&& initialGrille[i+1][j]=="B" )	   	initialGrille[i][j]="B";
						if(initialGrille[i][j-1]=="B" 	&& initialGrille[i][j+1]=="B" )	   	initialGrille[i][j]="B";
						if(initialGrille[i-1][j-1]=="B" && initialGrille[i+1][j+1]=="B" )	initialGrille[i][j]="B";
						if(initialGrille[i-1][j+1]=="B" && initialGrille[i+1][j-1]=="B" )	initialGrille[i][j]="B";
														
						}
			return ouput;
		}
		
		
		
//		public boolean isTheTurnForBlack(){
//		if(initialGrille[8][0] == "B") 
//			return true;
//		else return false;
//	}
//	
//	public boolean isTheTurnForWhite(){
//		if(initialGrille[8][0] == "W") 
//			return true;
//		else return false;
//	}
//	
//	public void choosePosition() {
//
//		for(int i=0;i<8;i++)
//			for(int j=0;j<8;j++)
//				if(initialGrille[i][j]=="O"){
//					if(isTheTurnForBlack()==true) 
//						
//				}
//		
//	}
	

}
