package prob5;

class Employee {
    public double percentage;
    private String name;
    private int empId;
    public String result;
    int ass1,ass2,ass3,total;

    public void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    public void setId(int id){
        this.empId=id;
    }
    int getEmpId(){
        return this.empId;
    }



    String updateResult(){
        if(this.ass1>=75 && this.ass2>=75 && this.ass3>=75)
            this.result= "Promoted";

        else
            this.result= "demoted";

        return result;
    }

    int calculateTotal() {
        this.total=this.ass1+this.ass2+this.ass3;
        return total;
    }


    double percentage() {
        this.percentage=(((double) (this.ass1 + this.ass2 + this.ass3)/300)*100);
        return percentage;
    }
}
