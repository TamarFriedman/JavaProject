package models;

public class Person {
    private int idPerson;
    private String firstName;
    private String lastName;
    private String mail;

    public Person(int idPerson, String firstName, String lastName, String mail) {
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
