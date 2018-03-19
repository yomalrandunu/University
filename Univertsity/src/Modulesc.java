/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yomal Randunu
 */
public class Modulesc {
    
    private final  String modid;
    private final  String modname;
    private final  String levelno;
    private final  String degreeid;
    
    
    public Modulesc( String Md_no, String Md_name, String Level_no,String Degree_id)
    {
        this.modid=Md_no;
        this.modname=Md_name;
        this.levelno=Level_no;
        this.degreeid=Degree_id;
        
    }
    
    public String getMd_no(){
        return modid;
    }
    
    public String getMd_name(){
        return modname;
    }
    
     public String getLevel_no(){
        return levelno;
    }
    
     public String getDegree_id(){
        return degreeid;
    }
    
    
}
