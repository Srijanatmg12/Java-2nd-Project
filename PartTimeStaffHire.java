public class PartTimeStaffHire extends StaffHire//extending the parentclass
{
  // declaring private instance variables
  private int workingHour;
  private int wagesPerHour;
  private String staffName;
  private String joiningDate;
  private String qualification;
  private String appointedBy;
  private String shifts;
  private boolean joined;
  private boolean terminated;
  //Parametarized Constructor is defined
  public PartTimeStaffHire (int vacancyNumber, String designation, 
                            String jobType, int workingHour,int wagesPerHour, String shifts)
  {
      super(vacancyNumber,designation,jobType);//calling superclass constructor with these parameters
      //initializing values of instance variables
      this.workingHour=workingHour;
      this.wagesPerHour=wagesPerHour;
      this.shifts=shifts;
      //declaring the values for variables
      staffName="";
      joiningDate="";
      qualification="";
      appointedBy="";
      joined=false;
      terminated=false;
      
  }
  public int getWorkingHour()//returns workingHour
   {
        return workingHour;
   }
  public int getWagesPerHour()//returns wagesperhour
   {
        return wagesPerHour;
   }
  public String getStaffName()//returns staffName
    {
        return staffName;
    }
  public String getJoiningDate()//returns joiningDate
    {
        return joiningDate;
    }
  public String getQualification()//returns qualification
    {
        return qualification;
    }
  public String getAppointedBy()//returns appointedBy
    {
        return appointedBy;
    }
  public String getShifts()//returns shifts
  {
      return shifts;
    }
  public boolean getJoined()//returns joined
    {
        return joined;
    }
  public boolean getTerminated()//returns terminated
  {
      return terminated;
  }
  public void setShifts(String shifts)//set shifts as string value named as shifts
  {
      this.shifts=shifts;
  }
  public void hirePartTimeStaff(String staffName, String joiningDate, 
                        String qualification, String appointedBy)
  {
      if(getJoined())
      {
          System.out.println(getStaffName()+" was appointed on "+getJoiningDate());//if the statement is true, it displays staffName was appointed on joiningdate.
      }
      else
      {//if the statement is false,it displays the following outputs
          this.staffName=staffName;
          this.joiningDate=joiningDate;
          this.qualification=qualification;
          this.appointedBy=appointedBy;
          joined=true;
          terminated=false;
        }
  }
   public void terminateStaff()
  {
      if(getTerminated())
      {
          System.out.println(getStaffName()+" is already terminated");//if the statement is true, it displays staffname is already terminated.
      }
      else
      {//if the statement is false
          staffName="";
          joiningDate="";
          qualification="";
          appointedBy="";
          joined=false;
          terminated=true;
      }
  }
  public void displayInfo()
  {
      super.displayInfo();//calling superclass to display vacancyNumber,designation,jobtype 
      if (getJoined())      
      {
         System.out.println("Staff name : "+getStaffName());//displays staffName
         System.out.println("Wages per hour : "+getWagesPerHour());//displays wagesPerHour
         System.out.println("Working hour : "+getWorkingHour());//displays workinghour
         System.out.println("Joining Date : "+getJoiningDate());//displays joiningDate
         System.out.println("Qualification : "+getQualification());//displays qualification
         System.out.println("Appointed By : "+getAppointedBy());//displays appointedBy
         System.out.println("Income per day : "+(getWagesPerHour()*getWorkingHour()));//displays incomeperday
      }
    }
}