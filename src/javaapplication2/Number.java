
package javaapplication2;
/**
 *
 * @author Miguel
 */
public class Number {
    
    private float number1;
    
    public Number (float number1){
        this.number1 = number1;
    }
    
    public Number(){
        this.number1 = 0;
    }
    
    public float getNumber(){
        return number1;
    }
    
    public void setNumber(float number1){
        this.number1 = number1;
    }
    
    public String NumberText(){
    
        String msm ="";
        
         if (this.number1 %2 == 0)
        {
           msm = "el numero es par";
        }else{
            
           msm = "el numero es impar ";
            
        }
         return msm;
    }
    


}
