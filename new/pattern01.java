import java.util.*;
public class pattern01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int lines=s.nextInt();  
	    int i,j;  
	    int space=0;  
	    for(i=0;i<lines;i++){
	        for(j=1;j<=space;j++){ 
	            System.out.print(" ");  
	        }  
	        for(j=1;j<=lines;j++){  
	            if(j<=(lines-i))  
	            System.out.print(j);  
	            else  
	            System.out.print("*");  
	        }  
	        j--;  
	        while(j>0){  
	            if(j>lines-i)  
	            System.out.print("*");  
	            else  
	            System.out.print(j);  
	            j--;  
	        }  
	        if((lines-i)>9) 
	        space=space+1;  
	    System.out.println("");
	}
	}  

}
