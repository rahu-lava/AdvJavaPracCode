/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical8b;

/**
 *
 * @author rahul
 */
public class Practical8b  implements java.io.Serializable {
    
    
    private String fn=null;
private String ln=null;
private int u =0;
    

    
    public void setpehlaNaam(String n){
        
        this.fn = n ;
    }
    
    public void setankhriNaam(String n){
        
        this.ln = n ;
    }    
    
    public void setummra(int a){
    
        this.u = a;
    }
    
    public String getpehlaNaam(){
        
        return fn ;
    }
    
    public String getankhriNaam(){
        
        return ln ;
    }    
    
    public int getummra(){
    
        return u ;
    }
    
}
