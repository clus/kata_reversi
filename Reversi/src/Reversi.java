
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
