import java.time.LocalDate;

/**
 * the class characterizes the zoo employee
 * and his basic data
 */
public class Employee {
    // required parameters
    private Sex sex;

    // optional parameters
    private String name = "no name";
    private String surname = "no surname";
    private LocalDate dateOfBirth = LocalDate.now();

    ///////////////      builder     ///////////////////
    public static class Builder{
        Employee employee;

        public Builder(Sex sex){
            employee = new Employee();
            employee.setSex(sex);
        }
        public Builder withName(String name){
            employee.setName(name);
            return this;
        }
        public Builder withSurname(String surname){
            employee.setSurname(surname);
            return this;
        }
        public Builder withDateOfBirth(LocalDate dateOfBirth){
            employee.setDateOfBirth(dateOfBirth);
            return this;
        }

        public Employee build(){
            return employee;
        }
    }

    ///////////////     getters and setters    ///////////////////////
    public void setName(String name){
        if(name.equals(""))this.name = "no name";
        else this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        if(surname.equals(""))this.surname = "no surname";
        else this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }
    public void setSex(Sex sex){
        this.sex = sex;
    }
    public Sex getSex(){
        return sex;
    }
    public void setDateOfBirth(LocalDate dateOfBirth){
        int year;
        int minYear = 1800;

        // comparing years
        if(dateOfBirth.getYear() > LocalDate.now().getYear())year = LocalDate.now().getYear();
        else if(dateOfBirth.getYear() < minYear)year = minYear;
        else year = dateOfBirth.getYear();

        // setting values
        this.dateOfBirth = LocalDate.of(year,dateOfBirth.getMonth(),dateOfBirth.getDayOfMonth());
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }

    //////////////////////  overrides methods   ////////////////////
    @Override
    public String toString(){
        String str = "name: " + name + "\n";
        str += "surname: " + surname + "\n";
        str += "sex: " + sex.toString() + "\n";
        str += "date of birth: " + dateOfBirth.toString();
        return str;
    }

    @Override
    public int hashCode(){
        int result = name.hashCode();
        result += surname.hashCode();
        result += sex.hashCode();
        result += dateOfBirth.hashCode();

        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass())return false;

        Employee other = (Employee)obj;

        if(name != other.getName())return false;
        if(surname != other.getSurname())return false;
        if(sex != other.getSex())return false;
        return dateOfBirth.equals(other.getDateOfBirth());
    }

}
