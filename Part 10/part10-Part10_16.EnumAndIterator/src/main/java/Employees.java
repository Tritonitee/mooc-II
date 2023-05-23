
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nasse
 */
public class Employees {

    private List<Person> list;

    public Employees() {
        this.list = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        try {
            if (!this.list.contains(personToAdd)) {
                this.list.add(personToAdd);
            }
        } catch (NullPointerException e) {
            this.list.add(personToAdd);
        }

    }

    public void add(List<Person> peopleToAdd) {
        try {
            for (int i = 0; i < peopleToAdd.size(); i++) {
                if (!this.list.contains(peopleToAdd.get(i))) {
                    this.list.add(peopleToAdd.get(i));
                }
            }
        } catch (NullPointerException e) {
            System.out.println("List to add was empty");
        }

    }

    public void print() {
        Iterator<Person> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            if (next.getEducation() == education) {
                System.out.println(next);
            }
        }
    }
    public void fire(Education education){
        Iterator<Person> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
