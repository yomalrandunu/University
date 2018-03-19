
public class Student {
   
    private final String stu_id;
    private final String first_name;
    private final String middle_name;
    private final String last_name;
    private final String Email;
    private final String nic;
    private final String address;
    private final String batch_id;
    
    public Student(
            String Stu_id,
            String F_name,
            String M_name,
            String L_name,
            String email,
            String NIC,
            String Address,
            String Batch_id)
    {

    
        this.stu_id = Stu_id;
        this.first_name = F_name;
        this.middle_name = M_name;
        this.last_name = L_name;
        this.Email = email;
        this.nic = NIC;
        this.address = Address;
        this.batch_id = Batch_id;
        
    }
    
    public String getStu_id(){
        return stu_id;
    }
    
     public String getFirst_name(){
        return first_name;
    }
     
      public String getMiddle_name(){
        return middle_name;
    }
      
       public String getLast_name(){
        return last_name;
    }
       
        public String getemail(){
        return Email;
    }
        
         public String getNIC(){
        return nic;
    }
         
          public String getAddress(){
        return address;
    }
          
           public String getBatch_id(){
        return batch_id;
    }

    
   
}
