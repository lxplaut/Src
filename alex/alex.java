import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import string
import java.io.*;
 
class alex{
 
	public static void main (String args[]) {
 
	try{
		BufferedReader br = 
                      new BufferedReader(new InputStreamReader(System.in));
 
		String Data;
int j=1 ;
 
		while((Data=br.readLine())!=null){

System.out.print("0 NA00");
 System.out.print(j);
j++;

System.out.print(" 0 0 0 -9 ");




		for (int i=0; i<Data.length(); i++) {
    
			if (Data.charAt(i) == '1')  {
                 System.out.print("2 ");}
                 if (Data.charAt(i) == '0') { 
                 System.out.print("1 ");}
                 }
                 


			System.out.println();
		}
 
	}catch(IOException io){
		io.printStackTrace();
	}	
  }
}

    
                 
 
