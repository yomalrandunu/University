
public class Lessonsc {
    
    private final  String lsid;
    private final  String lsname;
    private final  String modulesno;
    private final  String lecid;
    
    
    public Lessonsc( String Ls_no, String Ls_name, String Modules_no,String Lecture_id)
    {
        this.lsid=Ls_no;
        this.lsname=Ls_name;
        this.modulesno=Modules_no;
        this.lecid=Lecture_id;
        
    }
    
    public String getLs_no(){
        return lsid;
    }
    
    public String getLs_name(){
        return lsname;
    }
    
     public String getModules_no(){
        return modulesno;
    }
    
     public String getLecture_id(){
        return lecid;
    }
    
}
