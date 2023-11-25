package ru.skypro.homework.model;

import lombok.*;
import ru.skypro.homework.dto.Role;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private Role role;
    @OneToOne
//    private AvatarEntity image;
    @OneToMany(mappedBy = "author")
    private Collection<AdEntity> ads;
    @OneToMany(mappedBy = "author")
    private Collection<CommentEntity> comments;

    public UserEntity(Integer id, String email, String firstName, String lastName, String phone, Role role) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", role=" + role +
                ", ads=" + ads +
                ", comments=" + comments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity that = (UserEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(email, that.email) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(phone, that.phone) && role == that.role && Objects.equals(ads, that.ads) && Objects.equals(comments, that.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, firstName, lastName, phone, role, ads, comments);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Collection<AdEntity> getAds() {
        return ads;
    }

    public void setAds(Collection<AdEntity> ads) {
        this.ads = ads;
    }

    public Collection<CommentEntity> getComments() {
        return comments;
    }

    public void setComments(Collection<CommentEntity> comments) {
        this.comments = comments;
    }
}
