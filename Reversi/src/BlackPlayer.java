
public class BlackPlayer extends Reversi {

	
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

