/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yomal Randunu
 */
public class Assessmentc {
    private final  String Asseid;
    private final  String Assename;
    private final  String moduleno;
   
    
    
    public Assessmentc( String Asse_id, String Asse_name, String module_no)
    {
        this.Asseid=Asse_id;
        this. Assename=Asse_name;
        this.moduleno=module_no;
       
        
    }
    
    public String getAsse_id(){
        return Asseid;
    }
    
    public String getAsse_name(){
        return  Assename;
    }
    
     public String getmodule_no(){
        return moduleno;
    }
    
    
    
    
    
}
