package org.fasttrackit.agenda.domain;

public class Contact {

    private String firstName;

    private String lastName;

//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }

    private String phone;

    private String address;

    public Contact(){ // un constructor, se pune intre fielduri si metode
        super(); // super e constructorul de la Object
        phone = ""; // acest constructor e fara parametri
    }

    public Contact (String firstNameParam, String lastNameParam){ // constructor cu parametri
        this();
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;
    }

    public Contact (String firstName, String lastName, String address){ //alt constructor face referire la cel anterior prin this
        this(firstName,lastName);
        this.address = address;
    }

    public void setFirstname(String firstNameParam){
        // validare
        if (firstNameParam.equals("")){
            throw new IllegalArgumentException("First name can not be empty");
        }
        this.firstName = firstNameParam;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastname() {
        return lastName;
    }

    @Override
    public String toString(){
        return "First name is " + firstName + " and last name is " + lastName ;
    }

    @Override
    public boolean equals(Object o){
        Contact second = (Contact)o;
        if (((Contact) o).getFirstName().equals(this.firstName) && second.getLastname().equals(this.getLastname())){
            return true;
        }
        else {
            return false;
        }
    }

}
