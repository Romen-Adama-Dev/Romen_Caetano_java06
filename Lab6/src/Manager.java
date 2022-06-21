import java.util.ArrayList;
import java.util.HashMap;

/*
    Write Manager class that:
        1. Create a collection (ArrayList) of 10 employees from divisions: “Risk Department”, “Scoring
        Department”, and “Credit Department”. Each employe should have different id and salary.
 */

public class Manager {
    //Create the ArrayList
    private ArrayList<Employee> List_of_Employee = new ArrayList<Employee>();
    private String name_Of_List;
    public Manager(String name_Of_List){
        this.name_Of_List=name_Of_List;
    }

    //Check that is on the list
    public boolean isOnList(Employee s){
        if(List_of_Employee.contains(s)){
            return true;
        }else{
            return false;
        }
    }

    //ArrayList with 10 elements
    public boolean writeOnList(Employee s){
        if(!isOnList(s) && List_of_Employee.size()<10){
            List_of_Employee.add(s);
            return true;
        }else{
            return false;
        }
    }

    //Print divisions that exist
    public void printDivisions(){
        List_of_Employee.forEach((n) -> System.out.println(n.getDivision()));
    }

    //Aaverage and sum salary
    public void printSalaryStuff(){

        double s=0;
        double a=0;
        for(Employee n:List_of_Employee){
            s+=n.getSalary();
        }
        a=s/List_of_Employee.size();
        System.out.println("The sum of salary is: "+s);
        System.out.println("And the average salary is: "+a);
    }

    //Employees on Risk Department
    public int countRisk(){
        String rd="Risk Department";
        int rc=0;
        for(Employee n:List_of_Employee){
            if(rd.equals(n.getDivision())){
                rc++;
            }
        }
        return rc;
    }

    public int countScoring(){
        String sd="Scoring Department";
        int sc=0;
        for(Employee n:List_of_Employee){
            if(sd.equals(n.getDivision())){
                sc++;
            }
        }
        return sc;
    }

    //Employees by division
    public void Group(){

        HashMap<Integer, String> ManagerMap = new HashMap<Integer, String>();
        for (Employee e : List_of_Employee) {
            ManagerMap.put(e.getId(), e.getDivision());
        }
    }
}
//Romen Adama Caetano Ramírez