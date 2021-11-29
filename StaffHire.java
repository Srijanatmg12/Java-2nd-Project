
/**
 * Creating a class StaffHire with two subclasses(full-time and part-time).
 *
 * @author Srijana Tamang
 * @version (0.01)
 */
public class StaffHire
{
  //instance variables - replace the value below by the user
    private int vacancyNumber;
    private String designation;
    private String jobType;
    //Constructor for object of staffhire class
    public StaffHire(int vacancyNumber,String designation,String jobType){
        //initialization of instance variables
        this.vacancyNumber=vacancyNumber;
        this.designation=designation;
        this.jobType=jobType;
        vacancyNumber=vacancyNumber;
        designation="";
        jobType="";   
    }
    //use of getter and setter for variables
     public int getvacancyNumber()//defines the getvacancyNumber method which returns int value named as vacanacyNumber
    {
        return vacancyNumber;
    }
    public void setvacancyNumber(int vacancyNumber)//defines the setvacancyNumber method which is non-return method that sets int value named as vacancyNumber
    {
        this.vacancyNumber=vacancyNumber;
    }
    public String getdesignation()//defines getdesignation method which returns string value named as designation
    {
        return designation;
    }
    public void setdesignation(String designation)//defines the setdesignation method which is non-return method that sets string value named as designation
    {
        this.designation=designation;
    }
    public String getjobType()//defines getjobType method which returns string value named as jobtype
    {
        return jobType;
    
    }
    public void setjobType(String jobType)//defines the setjobtype method which is non-return method that sets string value named as jobtype
    {
        this.jobType=jobType;
    
    }
    //displaying the results
    public void displayInfo()
    {
        System.out.println("vacancyNumber = "+getvacancyNumber());//displays the vacancyNumber
        System.out.println("designation= "+getdesignation());//displays the designation
        System.out.println("jobType = "+getjobType());//displays the jobType
        
    }   
}