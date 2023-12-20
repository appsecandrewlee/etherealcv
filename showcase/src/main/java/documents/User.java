package documents;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

/**
 * User Document for MongoDB cv
 * Created by: Andrew Lee
 */
public class User {

    @Id
    private Long uuid;

    //name,email and password
    private String name;
    private String email;
    private String password;


    //getters and setters for id
    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }



    //getters and setters for name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    //getters and setters for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //getters and setters for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
