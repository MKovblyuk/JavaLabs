import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class RunClass {
    public static void main(String[] args){


        ///////////////////     test vaccine   ///////////////////////
        Vaccine vaccine = new Vaccine.Builder(VaccineType.A,Disease.BLUTANG)
                .withName("name")
                .build();

        Vaccine vaccine2 = new Vaccine.Builder(VaccineType.A,Disease.BLUTANG)
                .withName("name")
                .build();

        Vaccine vaccine3 = new Vaccine.Builder(VaccineType.A,Disease.BLUTANG)
                .build();

        System.out.println("///////////////  vaccine  ////////////////\n");
        System.out.println("hash vaccine = " + vaccine.hashCode());
        System.out.println("hash vaccine2 = " + vaccine2.hashCode());
        System.out.println("hash vaccine3 = " + vaccine3.hashCode());
        System.out.println(vaccine3);

        ////////////////     test employee   ////////////////////////
        Employee employee = new Employee.Builder(Sex.MALE)
                .withName("name")
                .withSurname("surname")
                .withDateOfBirth(LocalDate.of(2001,2,3))
                .build();

        System.out.println("///////////////  employee  ////////////////\n");
        System.out.println("hash = " + employee.hashCode());
        System.out.println(employee);

        ////////////////////////     test animal     //////////////////////////////
        List<Vaccine> vaccines = new LinkedList<>();
        vaccines.add(vaccine);

        Animal animal = new Animal.Builder(Type.BIRDS,Sex.MALE)
                .withDateOfBirth(LocalDate.now())
                .withName("name")
                .withVaccines(vaccines)
                .build();

        System.out.println("///////////////  animal  ////////////////\n");
        System.out.println("hash = " + animal.hashCode());
        System.out.println(animal);

        ///////////////////////////    test aviary   //////////////////////////////
        List<Animal> animals = new LinkedList<>();
        animals.add(animal);
        List<Employee> employers = new LinkedList<>();
        employers.add(employee);

        Aviary aviary = new Aviary.Builder(Type.BIRDS)
                .withAnimals(animals)
                .withCapacity(12)
                .withEmployers(employers)
                .withNumber(2)
                .build();

        System.out.println("///////////////  aviary  ////////////////\n");
        System.out.println("hash = " + aviary.hashCode());
        System.out.println(aviary);


    }


}
