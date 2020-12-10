package Classes;

import Database.ConnectionManager;
import Database.DBTables;
import Enums.Disease;
import Enums.Sex;
import Enums.Type;
import Enums.VaccineType;
import Services.AnimalService;
import com.sun.tools.javac.tree.DCTree;

import java.util.*;
import java.lang.*;
import java.io.Console;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunClass {
    public static void main(String[] args) throws ClassNotFoundException {
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

      ///////////////   db   ////////

        try {
            Connection connection = ConnectionManager.getConnection();

            DBTables.createAnimalsTable(connection);
            DBTables.createAviaryTable(connection);
            DBTables.createEmployeeTable(connection);
            DBTables.createVaccineTable(connection);

            DBTables.dropAviaryTable(connection);
            DBTables.dropVaccineTable(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
