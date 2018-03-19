/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yomal Randunu
 */
public class ResultMarksc {
    
    private final String stu_id;
    private final String first_name;
    private final String last_name;
    private final String nic;
    private final String assessmentno;
    private final String marks;
    
    public ResultMarksc(
            String Stu_id,
            String F_name,
            String L_name,
            String NIC,
            String Assess_no,
            String Marks)
    {

    
        this.stu_id = Stu_id;
        this.first_name = F_name;
     
        this.last_name = L_name;
       
        this.nic = NIC;
      
       
        
        this.assessmentno=Assess_no;
        this.marks=Marks;
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
         
    
   
          
     
           public String getAssess_no(){
        return assessmentno;
    }
           
            
           public String getMarks(){
        return marks;
    }
    
}
