package Classes;

import Enums.Disease;
import Enums.Sex;
import Enums.Type;
import Enums.VaccineType;
import Services.AnimalService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunClass {
    public static void main(String[] args){
        List<Vaccine> vaccines = new ArrayList<>();
        vaccines.add(new Vaccine.Builder(VaccineType.A, Disease.HERODOVIROS)
                .withName("vaccine 2")
                .build());
        vaccines.add(new Vaccine.Builder(VaccineType.C, Disease.BLUTANG)
                .withName("vaccine 1")
                .build());
        vaccines.add(new Vaccine.Builder(VaccineType.B, Disease.SAP)
                .withName("vaccine 3")
                .build());


        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal.Builder(Type.AMPHIBIANS, Sex.MALE)
                .withName("Peter")
                .withDateOfBirth(LocalDate.of(2010,3,3))
                .withVaccines(vaccines)
                .build());
        animals.add(new Animal.Builder(Type.PISCES, Sex.MALE)
                .withName("Tom")
                .withDateOfBirth(LocalDate.of(2010,3,4))
                .withVaccines(vaccines)
                .build());
        animals.add(new Animal.Builder(Type.BIRDS, Sex.MALE)
                .withName("Bob")
                .withDateOfBirth(LocalDate.of(2001,3,4))
                .withVaccines(vaccines)
                .build());

        System.out.println(new AnimalService.TypeNameComparator().compare(animals.get(0),animals.get(1)));

//        Collections.sort(animals,new AnimalService.NameLengthComparator());
//        for(Animal animal : animals){
//            System.out.println(animal);
//        }

        List<Vaccine> vaccines1 = new ArrayList<>();
        AnimalService animalService = new AnimalService(animals.get(0));
        //vaccines1 = animalService.sortVaccines();
        vaccines1 = animalService.sortVaccinesWithStream();
        vaccines1.forEach(System.out::println);
    }
}
