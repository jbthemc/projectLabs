package org.fasttrackit.agenda.domain;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private String nameAgenda;
    private String owner;
    private Contact[] contacts = new Contact[20];
    private List<Contact> contactList = new ArrayList<>();


    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Contact contact0 = new Contact("Vasile", "Muresan"); // folosind constructorul 2 cu 2 parametri

        Contact contact1 = new Contact("Vasile", "Muresan", "Cluj-Napoca"); // al 3-lea constructor

        System.out.println("Contactele aduse prin constructori sunt: " + contact0 + contact1);

        // creem o instanta din clasa contact
        Contact firstContact = new Contact();
        firstContact.setFirstname("Ionut");
        firstContact.setLastname("Bacalu");
        //firstContact.setPhone("07222222");
        System.out.println(firstContact.toString());
        //System.out.println(firstContact.getPhone());

        agenda.getContactList().add(firstContact);
        agenda.contacts[0] = firstContact;

        Contact secondContact = new Contact();
        secondContact.setFirstname("Mihaela");
        secondContact.setLastname("Ciocan");
        System.out.println(secondContact.toString());

        agenda.getContactList().add(secondContact);

        agenda.contacts[1] = secondContact;

        System.out.println("Check equals with == " + (secondContact==firstContact));
        System.out.println("Check equals with equals " + (secondContact.equals(firstContact)));
    }

    /*
    Array vs List:
    Array are static & List are dinamic
    Array sunt obiecte > contacte[1]
    Listele sunt metode > list.get(1)
    Array: contact[1] = "x"
    List: list.add(1)
     */

    /*
    Trebuie sa folosim incapsularea per principiile OOP > folosim setter & getter cu: alt+insert > selectam variabilele
     */

    public String getNameAgenda() {
        return nameAgenda;
    }

    public void setNameAgenda(String nameAgenda) {
        this.nameAgenda = nameAgenda;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}
