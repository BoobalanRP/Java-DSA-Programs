package freshwork_interview;

import java.util.Stack;

public class BracketMatching {
    
    public static void main(String[] args) {
        char[] brackets1 = {'{', '}', '}', '}', '{', '{'};
        if(brackets1.length%2 == 1){
              System.out.println("Brackets : Not Matching");
              return;
        }
        boolean value = false;int count = 0;
        for(int i=0; i<brackets1.length; i++){
            if(brackets1[i] == '{'){
                count++;
            }
            else if(brackets1[i]== '}'){
                if(count > 0){
                    count--;
                }else{
                    value = true;
                    break;
                }
            }
        }
     if(value){
            System.out.println("Brackets : Not Matching");
     }else{
          System.out.println("Brackets : Matching");
     }
    }
}
