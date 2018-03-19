
public class Lecturec {
    
        private final  String Lecid;
    private final  String Lecname;
    private final  String LecEmail;
    
    public Lecturec( String Lec_id,String Lec_name, String Email)
    {
        this.Lecid=Lec_id;
        this.Lecname=Lec_name;
        this.LecEmail=Email;
        
    }
    
    public String getLec_id(){
        return Lecid;
    }
    
    public String getLec_name(){
        return Lecname;
    }
    
     public String getEmail(){
        return LecEmail;
    }
    
}
