package View;

import Dao.Dao;
import Dao.DaoPerson;
import Model.Person;

public class Main {
    public static void main(String[] args) {
        // Cambiar _Person por DaoPerson
        Dao<Person> daoPerson = new DaoPerson();

        // Crear personas
        daoPerson.create(new Person("Pepe", 13798433));
        daoPerson.create(new Person("Santiaguito", 44568993));
        daoPerson.create(new Person("Marcela", 20589222));

        // Listar todas las personas
        System.out.println("\nListar todas las personas:");
        for (Person person : daoPerson.readAll()) {
            System.out.println(person);
        }

        // Listar persona por ID
        System.out.println("\nListar persona con ID 2:");
        Person personById = daoPerson.readById(2);
        if (personById != null) {
            System.out.println(personById);
        } else {
            System.out.println("Persona no encontrada");
        }

        // Actualizar persona
        System.out.println("\nActualizar persona con ID 3:");
        daoPerson.update(new Person("Lucia", 205892332));

        // Eliminar persona
        System.out.println("\nEliminar persona con ID 1:");
        daoPerson.delete(1);

        System.out.println("\nListar todas las personas sin el id eliminado:");
        for (Person person : daoPerson.readAll()) {
            System.out.println(person);
        }
    }
}

