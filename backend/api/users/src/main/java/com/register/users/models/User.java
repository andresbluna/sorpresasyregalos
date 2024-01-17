import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "users")
public class User {
    private static final String UUID_GENERATOR_STRATEGY = "org.hibernate.id.UUIDGenerator";

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = UUID_GENERATOR_STRATEGY)
    private String id;

    private String user;
    private String gender;
    private String name;
    private String surname;
    private String mail;
    private int phone;

    //Zero argument constructor
    public User(){}

    public User(String user, String gender, String name, String surname, String mail, int phone) {
        this.user = user;
        this.gender = gender;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.phone = phone;
    }

    //getters and setters...
}