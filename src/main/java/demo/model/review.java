package demo.model;
import javax.persistence.*;

@Entity(name = "review")
@Table(name = "review")
public class review{
    @Column(name = "Feedback")
    private String feedback;
    @Column(name = "Name")
    private String name;
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Contact-id")
    private int contactid;
    @Column(name = "Email")
    private String email;
    @Id
    private Long id;

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContactid() {
        return contactid;
    }

    public void setContactid(int contactid) {
        this.contactid = contactid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
