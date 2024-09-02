package Dao;

import Model.Person;
import java.util.ArrayList;
import java.util.List;

public class DaoPerson implements Dao<Person> {
    private List<Person> data = new ArrayList<>();
    private static int nextId = 1;

    @Override
    public void create(Person t) {
        if (t.getId() != 0) {
            // Excepción
            return;
        }
        t.setId(nextId++);
        this.data.add(t);
    }

    @Override
    public void delete(int id) {
        Person personToDelete = readById(id);
        if (personToDelete != null) {
            data.remove(personToDelete);
            System.out.println("La persona con el id:" + id + " fue eliminada.");
        } else {
            System.out.println("La persona con el id: " + id + " no existe.");
        }
    }

    @Override
    public Person readById(int id) {
        for (Person person : data) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> readAll() {
        return new ArrayList<>(data);
    }

    @Override
    public void update(Person t) {
        Person existingPerson = readById(t.getId());
        if (existingPerson != null) {
            existingPerson.setNombre(t.getNombre());
            existingPerson.setDni(t.getDni());
            System.out.println("La persona con el id: " + t.getId() + " fue actualizada.");
        } else {
            System.out.println("La persona con el id: " + t.getId() + " no existe.");
        }
    }
}
