package co.yom.thecodercave.dependencyinjection.notdi;

/**
 * Modelo con atributos
 */
public class Customer {

    public int Id;
    public String Name;
    public String Email;
    public String Phone;

    public Customer() {
    }

    public Customer(int id, String name, String email, String phone) {
        Id = id;
        Name = name;
        Email = email;
        Phone = phone;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
