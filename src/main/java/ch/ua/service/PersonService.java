package ch.ua.service;

import java.util.List;

import ch.ua.model.Person;

public interface PersonService {

	public void addPerson(ch.ua.model.Person p);

	public void updatePerson(Person p);

	public List<Person> listPersons();

	public List<Person> getListPersons(); // It's temp !!!

	public Person getPersonById(int id);

	public void removePerson(int id);

}
