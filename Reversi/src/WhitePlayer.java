
public class WhitePlayer extends Reversi {


	public String[][] printMoveForPlayerWhite(String[][] input) {

		String ouput[][] = input ;

		for(int i=0;i<8;i++)
			for(int j=0;j<8;j++)
				if(ouput[i][j]=="B"){

					if(ouput[i-1][j]=="W" 	&& ouput[i+1][j]=="W" )	   	ouput[i][j]="W";
					if(ouput[i][j-1]=="W" 	&& ouput[i][j+1]=="W" )	   	ouput[i][j]="W";
					if(ouput[i-1][j-1]=="W" && ouput[i+1][j+1]=="W" )	ouput[i][j]="W";
					if(ouput[i-1][j+1]=="W" && ouput[i+1][j-1]=="W" )	ouput[i][j]="W";

				}
		return ouput;
	}

}
