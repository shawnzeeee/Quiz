import java.util.Scanner;
import java.io.*;

public class marker{

    
    String[] answers=new String[9];

    public void mark(){
        File f=new File("quiz.csv"); 
        try{
            Scanner input=new Scanner(f);
            while(input.hasNext()){
                String str=input.nextLine();
                String[] ans=str.split(",");
                if(ans[0].equals("Answer Key")){
                    for(int i=0; i<ans.length; i++){
                        answers[i]=ans[i];
                    }

                }else{
                    for(int i=1; i<ans.length; i++){
                        if(ans[i].equals(answers[i])){
                            System.out.println("Q"+i+"Correct!");
                        } else{
                            System.out.println("Q"+i+"Wrong!"); 
                            
                        }
                    }
                }
            }
        }    
        catch(FileNotFoundException e) {

            e.printStackTrace();
        }

        
    }

}