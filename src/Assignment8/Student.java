package Assignment8;

public class Student {
    public int ID;
    public String Name;
    public int Age;
    public String Address;
    public float Gpa;

    public Student(int ID, String Name, int Age, String Address, float Gpa){
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Address = Address;
        this.Gpa = Gpa;
    }

    public int getID(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public int getAge(){
        return Age;
    }

    public void setAge(int Age){
        this.Age = Age;
    }

    public String getAddress(){
        return Address;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public float getGpa(){
        return Gpa;
    }

    public void setGpa(float Gpa){
        this.Gpa = Gpa;
    }


}
