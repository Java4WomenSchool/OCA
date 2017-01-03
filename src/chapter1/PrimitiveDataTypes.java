/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 *
 * @author User
 */
public class PrimitiveDataTypes {
    
    public void floats(){
        float value = 102.0F;
//      float value2 = 102.0; // won't work, needs the F at the end
        float value3 = (float) 102.0; 
        float value4 = 102;
        float value5 = (int)102.0;
//      float value6 = 1f * (boolean)0; //cannot convert to boolan, incompatible
        float value7 = 1f * (short)0.0;
//      float value8 = 1f * 0.0; //incompatible, possible lossy conversion from double to float
        
        
    }

    
    public static void main(String[] args) {
        
    }
   
}
