
/**
 * the class characterizes vaccine that
 * vaccinate animals in the zoo
 */
public class Vaccine {
    // required parameters
    private VaccineType vaccineType;
    private Disease disease;

    // optional parameters
    private String name = "no name";


    ///////////////        builder       /////////////////
    public static class Builder{
        Vaccine vaccine;

        public Builder(VaccineType vaccineType,Disease disease){
            vaccine = new Vaccine();
            vaccine.setDisease(disease);
            vaccine.setVaccineType(vaccineType);
        }
        public Builder withName(String name){
            vaccine.setName(name);
            return this;
        }

        public Vaccine build(){
            return vaccine;
        }
    }

    ///////////////     getters and setters    ///////////////////////
    public void setVaccineType(VaccineType vaccineType){
        this.vaccineType = vaccineType;
    }
    public VaccineType getVaccineType(){
        return vaccineType;
    }
    public void setName(String name){
        if(name.equals(""))this.name = "no name";
        else this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setDisease(Disease disease){
        this.disease = disease;
    }
    public Disease getDisease(){
        return disease;
    }

    //////////////////////  overrides methods   ////////////////////
    @Override
    public String toString(){
        String str = "Vaccine type: " + vaccineType.toString() + "\n";
        str += "Name: " + name + "\n";
        str += "Against: " + disease.toString();
        return str;
    }

    @Override
    public int hashCode(){
        int result = disease.hashCode();
        result += vaccineType.hashCode();
        result += name.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)return true;
        if(obj == null || getClass() != obj.getClass())return false;

        Vaccine other = (Vaccine)obj;

        if(vaccineType != other.getVaccineType())return false;
        if(name != other.getName())return false;
        return disease == other.getDisease();
    }

}
