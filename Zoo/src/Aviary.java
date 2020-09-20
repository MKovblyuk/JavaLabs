import java.util.List;

/**
 * the class characterizes the aviary which contains
 * workers,animals and has the certain properties
 */
public class Aviary {
    // required parameters
    private Type type;

    // optional parameters
    private int capacity = 1;
    private List<Animal> animals;
    private List<Employee> employers;
    private int number = 1;

    
    ////////////////     builder     //////////////////
    public static class Builder{
        Aviary aviary;

        public Builder(Type type){
            aviary = new Aviary();
            aviary.setType(type);
        }
        public Builder withCapacity(int capacity){
            aviary.setCapacity(capacity);
            return this;
        }
        public Builder withAnimals(List<Animal> animals){
            aviary.setAnimals(animals);
            return this;
        }
        public Builder withEmployers(List<Employee> employers){
            aviary.setEmployers(employers);
            return this;
        }
        public Builder withNumber(int number){
            aviary.setNumber(number);
            return this;
        }

        public Aviary build(){
            return aviary;
        }

    }

    ///////////////     getters and setters    ///////////////////////
    public void setCapacity(int capacity){
        if(capacity < 1)this.capacity = 1;
        else this.capacity = Math.min(capacity,100);
    }
    public int getCapacity(){
        return capacity;
    }
    public void setAnimals(List<Animal> animals){
        this.animals = animals;
    }
    public List<Animal> getAnimals(){
        return animals;
    }
    public void setEmployers(List<Employee> employers){
        this.employers = employers;
    }
    public List<Employee> getEmployers(){
        return employers;
    }
    public void setType(Type type){
        this.type = type;
    }
    public Type getType(){
        return type;
    }
    public void setNumber(int number){
        if(number < 1)this.number = 1;
        else this.number = Math.min(number,100);
    }
    public int getNumber(){
        return number;
    }

    //////////////////////  overrides methods   ////////////////////
    @Override
    public String toString(){
        String str = "capacity: " + capacity + "\n";
        str += "number: " + number +"\n";
        str += "type: " + type.toString() + "\n";

        str += "animals:\n";
        for (Animal animal:animals) {
            str += animal.toString() + "\n";
        }

        str += "employers:\n";
        for(Employee employee: employers){
            str += employee.toString() + "\n";
        }

        return str;
    }

    @Override
    public int hashCode(){
        final int prime = 31;

        int result = prime + capacity;
        result = prime*result + number;
        result += type.hashCode();
        for(Animal animal:animals){
            result += animal.hashCode();
        }
        for(Employee employee:employers){
            result += employee.hashCode();
        }

        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass())return false;

        Aviary other = (Aviary)obj;

        if(capacity != other.getCapacity())return false;
        if(!animals.equals(other.getAnimals()))return false;
        if(!employers.equals(other.getEmployers()))return false;
        if(number != other.getNumber())return false;
        return type == other.getType();
    }
}
