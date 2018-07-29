package AllExercise;

public class Worker {

   private String name;
   private String surname;
   private char gender;
   private int numberOfSection;
   private float salary;
   private int age;
   private int numberOfChildren;
   private boolean maritalStatus;

   public Worker(){};

    public Worker(String name, String surname, char gender, int numberOfSection, float salary, int age, int numberOfChildren, boolean maritalStatus) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.numberOfSection = numberOfSection;
        this.salary = salary;
        this.age = age;
        this.numberOfChildren = numberOfChildren;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getNumberOfSection() {
        return numberOfSection;
    }

    public void setNumberOfSection(int numberOfSection) {
        this.numberOfSection = numberOfSection;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
