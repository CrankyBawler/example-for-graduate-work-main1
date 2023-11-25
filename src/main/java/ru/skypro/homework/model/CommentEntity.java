package ru.skypro.homework.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comments")

public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
    private Long createdAt;

    @ManyToOne
    @JoinColumn (name = "author_id")
    private UserEntity author;
    @ManyToOne
    @JoinColumn (name = "ad_id")
    private AdEntity ad;

}
