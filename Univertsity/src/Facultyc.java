/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yomal Randunu
 */
public class Facultyc {
    
    private final  String Fid;
    private final  String Fname;
    
    public Facultyc( String F_id,String F_name)
    {
        this.Fid=F_id;
        this.Fname=F_name;
    }
    
    public String getF_id(){
        return Fid;
    }
    
    public String getF_name(){
        return Fname;
    }
    
    
    
}
