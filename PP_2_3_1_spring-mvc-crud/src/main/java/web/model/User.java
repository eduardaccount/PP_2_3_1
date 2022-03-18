package web.model;

import javax.persistence.*;

@Entity
@Table(name = "users_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "user_age")
    private byte userAge;

    public User() {
    }

    public User(long userId, String userName, String userEmail, byte userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAge = userAge;
    }

    public User(String userName, String userEmail, byte userAge) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAge = userAge;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public byte getUserAge() {
        return userAge;
    }

    public void setUserAge(byte userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "User: " +
                "userId = " + userId +
                ", userName = '" + userName + '\'' +
                ", userEmail = '" + userEmail + '\'' +
                ", userAge = " + userAge;
    }
}
