package JavaRushTaskSt.Zadachi_7.LV_methods.Access_Modifiers;

public class Person10 {
     public String firstName;
     public String lastName;

    public Person10(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

     public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

     public String getFullName(){
        return firstName + " " + lastName;
    }
}
