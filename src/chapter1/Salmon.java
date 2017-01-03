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
public class Salmon {
    int count;
    public void Salmon(){ //not a constructor, has a return type
        count = 4;        
    }
    public static void main(String[] args){
        Salmon s = new Salmon();
        System.out.println(s.count);
        System.out.println("chapter1.Salmon.main()");
//        System.out.println(count); //(non-static variable count cannot be referenced from a static context)
    }
}
