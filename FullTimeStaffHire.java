public class FullTimeStaffHire extends StaffHire
{
  //private instance variables
  private int salary;
  private int workingHour;
  private String staffName;
  private String joiningDate;
  private String qualification;
  private String appointedBy;
  private boolean joined;
  //Constructor for object of FullTimeStaffHire Class
  public FullTimeStaffHire (int vacancyNumber, String designation, 
                            String jobType, int salary, int workingHour)
  {
      super(vacancyNumber,designation,jobType);//calling to the superclass constructor with these parameters
      //initializing values of instance variables
      this.salary=salary;
      this.workingHour=workingHour;
      //declaring the values for variables
      staffName="";
      joiningDate="";
      qualification="";
      appointedBy="";
      joined=false;
  }
  /**
   * Defines getsalary method which returns int value named as salary.
   */
  public int getSalary()
    {
        return salary;
    }
  /**
   * Define getWorkingHour method which returns int value named as workingHour.
   */
  public int getWorkingHour()
    {
        return workingHour;
    }
  /**
   * Defines getStaffName method which returns string value named as StaffName. 
   */
  public String getStaffName()
    {
        return staffName;
    }
  /**
   * defines getjoiningDate method which returns string value named as JoiningDate.
   */
  public String getJoiningDate()
    {
        return joiningDate;
    }
  /**
   * defines getQualification method which returns string value named as Qualification.
   */
  public String getQualification()
    {
        return qualification;
    }
  /**
   * defines getAppointedBy method which returns string value named as AppointedBy.
   */
  public String getAppointedBy()
    {
        return appointedBy;
    }
  /**
   * defines getjoined method which returns boolean value named as Joined.
   */
  public boolean getJoined()
    { return joined;
    }
  /**
   * Define setsalary method which is non return method that sets int value named as salary.
   */
  public void setSalary(int salary)
  {
    if (getJoined())
    {
       System.out.println("The staff is already hired so there is no change in salary");//if the getjoined equalts to true, it displays the given output.
    }
    else
     {
        this.salary = salary;//if the getjoined equlas to false, it displays the int value named as salary.
     }
  }
  /**
   * Define setworkingHour method which is non return method that sets int value named as workingHour.
   */
  public void setWorkingHour(int workingHour)
  {
      this.workingHour=workingHour;
  }
  public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
  {
      if(getJoined())
      {
          System.out.println(getStaffName()+" was appointed on "+getJoiningDate());//if the statement is true,it displays the given output.
      }
      else
        {//if the statement is false, it will display the given values named as their own
          this.staffName=staffName;
          this.joiningDate=joiningDate;
          this.qualification=qualification;
          this.appointedBy=appointedBy;
          joined=true;
         }
  }
  //displaying the outputs
  public void displayInfo()
  {
      super.displayInfo();// calling superclass constructor to display vacancyNumber,designation and jobtype
      if (getJoined())      
      {
         System.out.println("Staff name : "+getStaffName());//it displays the staffName
         System.out.println("Salary : "+getSalary());//it displays the salary
         System.out.println("Working hour : "+getWorkingHour());//it displays the WorkingHour
         System.out.println("Joining Date : "+getJoiningDate());//it displays the joiningDate of the staff
         System.out.println("Qualification : "+getQualification());//it displays the qualification
         System.out.println("Appointed By : "+getAppointedBy());//it displays AppointedBy
      }
    }
}

