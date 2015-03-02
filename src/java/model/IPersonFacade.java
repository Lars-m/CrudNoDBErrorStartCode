package model;

import java.util.Collection;

public interface IPersonFacade {
  public Person addPerson(Person p);
  public Person deletePerson(int id);
  public Person getPerson(int id);
  public Collection<Person> getPersons();
  public Person editPerson(Person p);
}
