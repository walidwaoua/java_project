package client;

public class Client {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String cin ;

        Client() {
            firstName="";
            lastName="";
            email="";
            phone="";
            address="";
            cin="";
        }

    Client(String firstName, String lastName, String email, String phone ,String address   ,String cin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.cin = cin;

    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    public String getCin() {
        return cin;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }


    public void afficherInfos() {
        System.out.println("Nom: " + firstName);
        System.out.println("Prénom: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Téléphone: " + phone);
        System.out.println("Adresse: " + address);
        System.out.println("Cin: " + cin);

    }
    




}
