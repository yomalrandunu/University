/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yomal Randunu
 */
public class ResultPhonec {
   private final String stu_id;
    private final String first_name;
    private final String last_name;
    private final String nic;
    private final String phone;
    
    public ResultPhonec(
            String Stu_id,
            String F_name,
            String L_name,
            String NIC,
            String Phone)
    {

    
        this.stu_id = Stu_id;
        this.first_name = F_name;
     
        this.last_name = L_name;
       
        this.nic = NIC;
      
       
        
        this.phone=Phone;
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
         
    
   
          
     
           public String getPhone(){
        return phone;
    }

    
}
   
    
    
  
    

