/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yomal Randunu
 */
public class ResultAttendancec {
    
     private final String stu_id;
    private final String first_name;
    private final String last_name;
    private final String nic;
     private final String lsno;
      private final String attendance;
    
    
    public ResultAttendancec(
            String Stu_id,
            String F_name,
            String L_name,
            String NIC,
            String Ls_no,
            String Attendance)
    {

    
        this.stu_id = Stu_id;
        this.first_name = F_name;
        this.last_name = L_name;
        this.nic = NIC;
        this.lsno=Ls_no;
        this.attendance=Attendance;
    }
    
    public String getStu_id(){
        return stu_id;
    }
    
     public String getFirst_name(){
        return first_name;
    }
     
    
      
       public String getLast_name(){
        return last_name;
    }
       
   
        
         public String getNIC(){
        return nic;
    }
         
    
   
          
     
           public String getLs_no(){
        return lsno;
    }
    
           public String getAttendance(){
        return attendance;
    }
    
}
