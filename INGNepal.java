
/**
 * Creating GUI for hiring staff for both part time and full time.
 *
 * Srijana Tamang
 * 07-24-2020
 */
import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;

public class INGNepal implements ActionListener
{
    ArrayList<StaffHire> list = new ArrayList<StaffHire>();
    
    private JFrame frame;
    
    //declaring variables for JLabel
    private JPanel panel;
    //Jlabel for fulltimestaff
    private JLabel labelVacancyNumber, labelDesignation, labelJobType, labelSalary, labelWorkingHour, labelVacancyNumberApnt,
    labelStaffName, labelJoiningDate, labelQualification, labelAppointed_by,
    
    //jlabel for partTimestaff
    labelVacancyNumber1, labelDesignation1, labelJobType1, labelWorkingHour1, labelVacancyNumberApnt1, 
    labelStaffName1, labelJoiningDate1, labelQualification1, labelAppointed_by1,
    labelShifts, labelWagesperhour,labelVacancyNumber2,labelTerminate;

    private JTextField //declaring variables for JtextField
    
    //jTextfield for fulltimestaff
    txtVacancyNumber, txtDesignation,txtJobType, txtSalary, txtWorkingHour, txtVacancyNumberApnt,
    txtStaffName, txtJoiningDate, txtQualification, txtAppointed_by,
    
    //JtextField for partTimestaff
    txtVacancyNumber1, txtDesignation1, txtJobType1,txtWorkingHour1, txtVacancyNumberApnt1,
    txtStaffName1, txtJoiningDate1, txtQualification1, txtAppointed_by1,
    txtShifts, txtWagesperhour,
    
    //Textfield for termination PartTimestaff
    txtVacancyNumber2, txtTerminated;
    
    //Comboboxes
    private JComboBox comboJob_type, comboJob_type1, comboShifts;

    private JButton //buttons 
    
    buttonAddFullTimeVacancy, buttonAddPartTimeVacancy,buttonAppoint, buttonAppoint1,
    buttonClear, buttonDisplay, buttonTerminate, buttonClear1, buttonDisplay1;

    FullTimeStaffHire FT;
    PartTimeStaffHire PT; 

    public static void main(String[] args)
    {
        new INGNepal().StaffHireForm();
    }
    //GUI

    public void StaffHireForm()
    {
        frame=new JFrame("ING NEPAL");
        JPanel panel = new JPanel();

        JLabel title =  new  JLabel();
        title.setText("For Full Time Vacancy:");
        title.setBounds(300, 5, 290, 70);
        panel.add(title);
        Font font1 = new Font("Times New Roman", Font.BOLD,25);
        title.setFont(font1);

        labelVacancyNumber=new JLabel("Vacancy Number:");
        labelVacancyNumber.setBounds(20,60,120,30);
        panel.add(labelVacancyNumber);

        txtVacancyNumber=new JTextField();
        txtVacancyNumber.setBounds(130,60,80,30);
        panel.add( txtVacancyNumber);

        labelDesignation=new JLabel("Designation:");
        labelDesignation.setBounds(220,60,130,30);
        panel.add(labelDesignation);

        txtDesignation=new JTextField();
        txtDesignation.setBounds(305,60,100,30);
        panel.add(txtDesignation);

        labelJobType=new JLabel("Job Type:");
        labelJobType.setBounds(410,60,80,30);
        panel.add(labelJobType);

        String job_type[]={"-Select- ", "FullTime", "PartTime"};
        comboJob_type=new JComboBox(job_type);
        comboJob_type.setBounds(465,60,80,30);
        panel.add(comboJob_type);

        labelSalary=new JLabel("Salary:");
        labelSalary.setBounds(20,95,120,30);
        panel.add(labelSalary);

        txtSalary=new JTextField();
        txtSalary.setBounds(130,95,80,30);
        panel.add(txtSalary);

        labelWorkingHour=new JLabel("Working Hour:");
        labelWorkingHour.setBounds(220,95,100,30);
        panel.add(labelWorkingHour);

        txtWorkingHour=new JTextField();
        txtWorkingHour.setBounds(305,95,100,30);
        panel.add(txtWorkingHour);

        buttonAddFullTimeVacancy=new JButton("Add FullTime Vacancy");
        buttonAddFullTimeVacancy.setBounds(440,95,180,30);
        panel.add(buttonAddFullTimeVacancy);
        buttonAddFullTimeVacancy.addActionListener(this);

        labelVacancyNumberApnt=new JLabel("Vacancy Number:");
        labelVacancyNumberApnt.setBounds(20,130,120,30);
        panel.add(labelVacancyNumberApnt);

        txtVacancyNumberApnt=new JTextField();
        txtVacancyNumberApnt.setBounds(130,130,80,30);
        panel.add(txtVacancyNumberApnt);

        labelStaffName=new JLabel("Staff Name:");
        labelStaffName.setBounds(220,130,100,30);
        panel.add(labelStaffName);

        txtStaffName=new JTextField();
        txtStaffName.setBounds(305,130,130,30);
        panel.add(txtStaffName);

        labelJoiningDate=new JLabel("Joining Date:");
        labelJoiningDate.setBounds(440,130,100,30);
        panel.add(labelJoiningDate);

        txtJoiningDate=new JTextField();
        txtJoiningDate.setBounds(518,130,80,30);
        panel.add(txtJoiningDate);

        labelQualification=new JLabel("Qualification:");
        labelQualification.setBounds(20,165,120,30);
        panel.add(labelQualification);

        txtQualification=new JTextField();
        txtQualification.setBounds(130,165,80,30);
        panel.add(txtQualification);

        labelAppointed_by=new JLabel("Appointed By:");
        labelAppointed_by.setBounds(220,165,100,30);
        panel.add(labelAppointed_by);

        txtAppointed_by=new JTextField();
        txtAppointed_by.setBounds(305,165,130,30);
        panel.add(txtAppointed_by);

        buttonAppoint=new JButton("Appoint");
        buttonAppoint.setBounds(450,165,100,30);
        panel.add(buttonAppoint);
        buttonAppoint.addActionListener(this);//adding actionlistener to the buttons for fulltimestaff

        buttonClear=new JButton("Clear");
        buttonClear.setBounds(570,165,70,30);
        panel.add(buttonClear);
        buttonClear.addActionListener(this);

        buttonDisplay=new JButton("Display");
        buttonDisplay.setBounds(650,165,90,30);
        panel.add(buttonDisplay);
        buttonDisplay.addActionListener(this);

      
        JLabel title1 =  new  JLabel();
        title1.setText("For Part Time Vacancy:");
        title1.setBounds(300, 180, 300, 150);
        panel.add(title1);
        Font font2 = new Font("Times New Roman",Font.BOLD,25);
        title1.setFont(font2);

        labelVacancyNumber1=new JLabel("Vacancy Number:");
        labelVacancyNumber1.setBounds(20,280,120,30);
        panel.add(labelVacancyNumber1);

        txtVacancyNumber1=new JTextField();
        txtVacancyNumber1.setBounds(130,280,80,30);
        panel.add( txtVacancyNumber1);

        labelDesignation1=new JLabel("Designation:");
        labelDesignation1.setBounds(220,280,130,30);
        panel.add(labelDesignation1);

        txtDesignation1=new JTextField();
        txtDesignation1.setBounds(305,280,100,30);
        panel.add(txtDesignation1);

        labelJobType1=new JLabel("Job Type:");
        labelJobType1.setBounds(410,280,80,30);
        panel.add(labelJobType1);

        String job_type1[]={"-Select- ", "PartTime", "FullTime"};
        comboJob_type1=new JComboBox(job_type1);
        comboJob_type1.setBounds(465,280,80,30);
        panel.add(comboJob_type1);

        labelWagesperhour=new JLabel("Wages Per Hour:");
        labelWagesperhour.setBounds(20,315,120,30);
        panel.add(labelWagesperhour);

        txtWagesperhour=new JTextField();
        txtWagesperhour.setBounds(130,315,80,30);
        panel.add(txtWagesperhour);

        labelWorkingHour1=new JLabel("Working Hour:");
        labelWorkingHour1.setBounds(220,315,100,30);
        panel.add(labelWorkingHour1);

        txtWorkingHour1=new JTextField();
        txtWorkingHour1.setBounds(305,315,100,30);
        panel.add(txtWorkingHour1);

        labelShifts=new JLabel("Shifts:");
        labelShifts.setBounds(410,315,80,30);	
        panel.add(labelShifts);

        String shifts[]={"-Select- ", "Morning", "Day", "Evening"};
        comboShifts=new JComboBox(shifts);
        comboShifts.setBounds(460,315,120,30);
        panel.add(comboShifts);

        buttonAddPartTimeVacancy=new JButton("Add PartTime Vacancy");
        buttonAddPartTimeVacancy.setBounds(250,365,180,30);
        buttonAddPartTimeVacancy.addActionListener(this); //adding actionlistener to the buttonsfor partTimestaff
        panel.add(buttonAddPartTimeVacancy);

        labelVacancyNumberApnt1=new JLabel("Vacancy Number:");
        labelVacancyNumberApnt1.setBounds(20,415,120,30);
        panel.add(labelVacancyNumberApnt1);

        txtVacancyNumberApnt1=new JTextField();
        txtVacancyNumberApnt1.setBounds(130,415,80,30);
        panel.add(txtVacancyNumberApnt1);

        labelStaffName1=new JLabel("Staff Name:");
        labelStaffName1.setBounds(220,415,100,30);
        panel.add(labelStaffName1);

        txtStaffName1=new JTextField();
        txtStaffName1.setBounds(305,415,130,30);
        panel.add(txtStaffName1);

        labelJoiningDate1=new JLabel("Joining Date:");
        labelJoiningDate1.setBounds(440,415,100,30);
        panel.add(labelJoiningDate1);

        txtJoiningDate1=new JTextField();
        txtJoiningDate1.setBounds(518,415,80,30);
        panel.add(txtJoiningDate1);

        labelQualification1=new JLabel("Qualification:");
        labelQualification1.setBounds(20,450,120,30);
        panel.add(labelQualification1);

        txtQualification1=new JTextField();
        txtQualification1.setBounds(130,450,80,30);
        panel.add(txtQualification1);

        labelAppointed_by1=new JLabel("Appointed By:");
        labelAppointed_by1.setBounds(220,450,100,30);
        panel.add(labelAppointed_by1);

        txtAppointed_by1=new JTextField();
        txtAppointed_by1.setBounds(305,450,130,30);
        panel.add(txtAppointed_by1);

        buttonAppoint1=new JButton("Appoint");
        buttonAppoint1.setBounds(450,450,100,30);
        panel.add(buttonAppoint1);
        buttonAppoint1.addActionListener(this);//Adding actionlistener to appoint

        buttonClear1=new JButton("Clear");
        buttonClear1.setBounds(200,495,100,35);
        panel.add(buttonClear1);
        buttonClear1.addActionListener(this);//adding actionlistener to clear

        buttonDisplay1=new JButton("Display");
        buttonDisplay1.setBounds(400,495,100,35);
        panel.add(buttonDisplay1);
        buttonDisplay1.addActionListener(this);//adding acrionlistener to display

        labelVacancyNumber2=new JLabel("Vacancy Number:");
        labelVacancyNumber2.setBounds(20,550,120,30);
        panel.add(labelVacancyNumber2);

        txtVacancyNumber2=new JTextField();
        txtVacancyNumber2.setBounds(130,550,80,30);	
        panel.add( txtVacancyNumber2);

        buttonTerminate=new JButton("Terminate");
        buttonTerminate.setBounds(220,550,100,30);
        panel.add(buttonTerminate);
        buttonTerminate.addActionListener(this);//adding actionlistener to terminate

        panel.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setBounds(50 ,50 ,800 ,650);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //adding fulltimestaff

    public void actionPerformed(ActionEvent a)
    {
        if(a.getSource()==buttonAddFullTimeVacancy){

            int vacancyNumber= 0;
            String designation = "";
            int salary= 0;
            String jobType= "";
            int workingHour= 0;

            try{
                vacancyNumber = Integer.parseInt(txtVacancyNumber.getText()); 
                designation = txtDesignation.getText();
                salary = Integer.parseInt(txtSalary.getText());
                jobType = (comboJob_type.getSelectedItem()).toString();
                workingHour = Integer.parseInt(txtWorkingHour.getText());
                //comparing the value of vacancy number
                boolean isDuplicateVacancyNumber=false;
                 for(StaffHire var:list){
                    if(var.getvacancyNumber()==vacancyNumber){
                        isDuplicateVacancyNumber= true;
                        break;
                    }
                 }
                 if(isDuplicateVacancyNumber==false)
                  {
                    FT=new FullTimeStaffHire(vacancyNumber,designation,jobType,salary,workingHour);
                    list.add(FT);
                    JOptionPane.showMessageDialog(panel,"vacancy added "+list.size());
                 }
                 else
                 {
                    JOptionPane.showMessageDialog(panel,"Input Vacancy no is already in the list. "+list.size()); 
                 }
            }
            catch(Exception expt)
            {
                JOptionPane.showMessageDialog(panel,"Please fill the appropriate value!! "); 
            }
        }
        //appointing fulltimestaff

        if(a.getSource()==buttonAppoint){
            try{
                int vacancyNumber=Integer.parseInt(txtVacancyNumberApnt.getText()); 
                String staffName=txtStaffName.getText();
                String joiningDate=txtJoiningDate.getText();
                String qualification=txtQualification.getText();
                String appointed_by=txtAppointed_by.getText();

                boolean vacancyNumberFound=false;
                for(StaffHire obj:list){
                    if(obj.getvacancyNumber()==vacancyNumber){
                        vacancyNumberFound=true;
                        if(obj instanceof FullTimeStaffHire){
                            FT = (FullTimeStaffHire)obj;
                            if(txtStaffName.getText().equals("") || txtQualification.getText().equals("") || txtAppointed_by
                            .getText().equals("") || txtJoiningDate.getText().equals(""))
                            {
                                JOptionPane.showMessageDialog(panel,"Sorry!!Empty textfield has been found.Please fill all textfields.");
                                return;
                            
                            }
                            
                            if(FT.getJoined()==true){
                                JOptionPane.showMessageDialog(panel,"Staff is already hired!");
                            }else{
                                FT.hireFullTimeStaff(staffName,joiningDate,qualification,appointed_by);
                                JOptionPane.showMessageDialog(panel,"Staff has been appointed successfully!");
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(panel,"This vacancy is not for Fulltime Staff Hire");
                            break;
                        }
                    }             
                }
                if(!vacancyNumberFound){
                    JOptionPane.showMessageDialog(panel,"Invalid Vacancy!!Please enter valid VacancyNumber.");

                }   

            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(panel,"Please fill up all the values!!");
            }

        }
        //adding parttimestaff

        if(a.getSource()==buttonAddPartTimeVacancy){

            int vacancyNumber1 = 0;
            String designation1 = "";
            int wagesperhour = 0;
            int workingHour1 = 0;
            String job_type1 = "";
            String shifts = "";
            
            try{
                vacancyNumber1 = Integer.parseInt(txtVacancyNumber1.getText());
                designation1 = txtDesignation1.getText();
                wagesperhour = Integer.parseInt(txtWagesperhour.getText());
                workingHour1 = Integer.parseInt(txtWorkingHour1.getText());
                job_type1 = (comboJob_type1.getSelectedItem()).toString();
                shifts = (comboShifts.getSelectedItem()).toString();

                boolean isDuplicateVacancyNumber = false;
                for(StaffHire var:list){
                    if(var.getvacancyNumber()==vacancyNumber1){
                        isDuplicateVacancyNumber = true;
                        break;
                    }
                }

                if(txtDesignation1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(panel, "Please fill all textfields.");
                    return;
                }

                if(isDuplicateVacancyNumber==false)
                {
                    PT=new PartTimeStaffHire(vacancyNumber1, designation1, job_type1,wagesperhour,workingHour1, shifts);
                    list.add(PT);
                    JOptionPane.showMessageDialog(panel,"vacancy added "+list.size());
                }
                else
                {
                    JOptionPane.showMessageDialog(panel,"Input Vacancy no is already in the list. "+list.size()); 
                }
            }
            catch(Exception expt)
            {
                JOptionPane.showMessageDialog(panel,"Input is invalid.Please fill the valid input."); 
            }
        }
        //appointing partTime staff
        if(a.getSource()==buttonAppoint1){
            try{
                int vacancyNumber1=Integer.parseInt(txtVacancyNumberApnt1.getText()); 
                String staffName1=txtStaffName1.getText();
                String joiningDate1=txtJoiningDate1.getText();
                String qualification1=txtQualification1.getText();
                String appointed_by1=txtAppointed_by1.getText();

                boolean vacancyNumber1Found=false;
                for(StaffHire obj:list){
                    if(obj.getvacancyNumber()==vacancyNumber1){
                        vacancyNumber1Found=true;
                        if(obj instanceof PartTimeStaffHire){
                            PartTimeStaffHire n=(PartTimeStaffHire)obj;

                            if(txtStaffName1.getText().equals("") || txtQualification1.getText().equals("") || txtAppointed_by1
                            .getText().equals(""))
                            {
                                JOptionPane.showMessageDialog(panel,"Sorry!!Empty textfield has been found.Please fill all textfields.");
                                return;
                            }

                            if(n.getJoined()==true){
                                JOptionPane.showMessageDialog(panel,"Staff is already hired!");
                            }else{
                                n.hirePartTimeStaff(staffName1,joiningDate1,qualification1,appointed_by1);
                                JOptionPane.showMessageDialog(panel,"Staff is hired successfully!");
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(panel,"Sorry!!This vacancy is not for Parttime Staff Hire");
                            break;
                        }
                    }             
                }
                if(!vacancyNumber1Found){
                    JOptionPane.showMessageDialog(panel,"Please fill the valid vacancynumber.");

                }   

            }
            catch(Exception expt)
            {
                JOptionPane.showMessageDialog(panel, "Kindly enter valid value.");
            }
        }
        //terminating partTimestaff
        if(a.getSource()==buttonTerminate){
            try{
                int vacant=Integer.parseInt(txtVacancyNumber2.getText());

                boolean vacancyNum=false;

                for(StaffHire obj:list){
                    if(obj.getvacancyNumber()==vacant){
                        vacancyNum = true;
                        if(obj instanceof PartTimeStaffHire){
                            PT=(PartTimeStaffHire)obj;
                            //checking condition to terminate part-time staff and display the suitable message
                           if(PT.getTerminated()==true) { 
                                JOptionPane.showMessageDialog(panel,"PartTime Staff is already terminated!!!");

                            }
                            else if(PT.getJoined()==true)
                            {
                                PT.terminateStaff();
                                JOptionPane.showMessageDialog(panel,"Staff has been terminated successfully!!");
                                break;
                                
                          }//displaying the suitable message if the condition doesn't match
                          else{
                            JOptionPane.showMessageDialog(panel,"Sorry, cannot terminate until staff get appointed.");
                            
                          }
                       }             
                  }
                
             }
            }catch(Exception exp){
                JOptionPane.showMessageDialog(panel," Please fill the emptyfields. ");
            }

        } 
        //displaying the values for fulltimestaffhire

        if (a.getSource().equals(buttonDisplay))
        {
            for(StaffHire FullTimeStaffHire:list)
            {
                if(FullTimeStaffHire instanceof StaffHire)
                {
                    StaffHire FullTimeStaffHireDisplay = (StaffHire) FullTimeStaffHire;
                    FullTimeStaffHireDisplay.displayInfo();
                    JOptionPane.showMessageDialog(panel,"Information is displayed in the terminal.");
                }else{
                    JOptionPane.showMessageDialog(panel,"No Staff has been appointed so, cannot display the info.");
                
                }
            }
        }
        //displaying the values for parttime staff
        if (a.getSource().equals(buttonDisplay1))
        {
            for(StaffHire PartTimeStaffHire:list)
            {
                if(PartTimeStaffHire instanceof StaffHire)
                {
                    StaffHire PartTimeStaffHireDisplay = (StaffHire) PartTimeStaffHire;
                    PartTimeStaffHireDisplay.displayInfo();
                    JOptionPane.showMessageDialog(panel,"Information is displayed in the terminal.");
                }else{
                    JOptionPane.showMessageDialog(panel,"Staff has not been appointed so,cannot display the info.");
                    
                }
            }
        }
        //clearing all the values from FullTime staff

        if(a.getSource()==buttonClear)
        {
            txtVacancyNumber.setText("");
            txtDesignation.setText("");
            txtSalary.setText("");
            txtWorkingHour.setText("");
            txtVacancyNumberApnt.setText("");
            txtStaffName.setText("");
            txtQualification.setText("");
            txtAppointed_by.setText("");
            comboJob_type.setSelectedIndex(0);
            txtJoiningDate.setText("");

        }
        //clearing all the values from PartTimestaff

        if(a.getSource()==buttonClear1)
        {
            txtVacancyNumber1.setText("");
            txtDesignation1.setText("");
            comboShifts.setSelectedIndex(0);
            txtWorkingHour1.setText("");
            txtWagesperhour.setText("");
            txtVacancyNumberApnt1.setText("");
            txtStaffName1.setText("");
            txtQualification1.setText("");
            txtAppointed_by1.setText("");
            comboJob_type1.setSelectedIndex(0);
            txtJoiningDate1.setText("");

        }

        

    }

}

