package controllers;

import models.Person;

public class PersonController {
    
    public void sortByName(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < people.length - 1; j++) {
                if (people[i].getName().compareToIgnoreCase(people[j].getName()) < 0) {
                    Person aux = people[i];
                    people[i] = people[j];
                    people[j] = aux;
                    swapped = true;
                }
            }
        }
    }
}
