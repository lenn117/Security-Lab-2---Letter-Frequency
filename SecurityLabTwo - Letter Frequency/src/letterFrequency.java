import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class letterFrequency
{

	  public static void main(String[] args ) throws IOException
	  {

				  FileReader reader = new FileReader("PlainTextdocument.txt");

				  char[] capital = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N',
									'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

				  char[] small =   { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
									'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

				  System.out.println("Letter	Frequency");
				  int nextChar;
				  char ch;

				  // Declare 26 char counting
				  int[] count = {0,0,0,0,0,
				  0,0,0,0,0,
				  0,0,0,0,0,
				  0,0,0,0,0,
				  0,0,0,0,0,
				  0
				  };

				  //Loop through the file char
				  while ( (nextChar = reader.read() ) != -1 )
					  {
						 for (int i = 0; i < 26; i++)
						{
						  ch = (char) nextChar;
						  if( ch== capital[i] || ch == small[i] )
						  {
							  count[i]++;
						  }
						 }
				  }

				  // Print out
				   for (int i = 0; i < 26; i++)
				   {
					  System.out.print("  " + capital[i]);
					  System.out.println("		  " + count[i]);
				   }
				

				  reader.close();
				  
				  PrintWriter outFile = new PrintWriter (new File("FrequencyOfPlaintext.txt"));
				  
				  for (int i = 0; i < 26; i++){
					  
					
					outFile.print("  " + capital[i]);
					outFile.println("		  " + count[i]);
					
				 }
				 
				 outFile.close ( );
				 



			}
		}
