package demo.model;

import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "contactus")
public class contactus {
    private int id;
    private String fullName;
    private String address;
    private String email;
    private String message;


    public contactus() {
    }

    public contactus(int id, String fullName, String address, String email, String message) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.message = message;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
