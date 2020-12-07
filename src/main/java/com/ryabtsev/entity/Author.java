package com.ryabtsev.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "author_name")
    private String AuthorName;
    @Column(name = "author_surName")
    private String AuthorSurname;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Article> articles;


    public Author() {
    }

    public Author(String authorName, String authorSurname, int articleCount) {
        AuthorName = authorName;
        AuthorSurname = authorSurname;

    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getAuthorSurname() {
        return AuthorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        AuthorSurname = authorSurname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id == author.id &&
                Objects.equals(AuthorName, author.AuthorName) &&
                Objects.equals(AuthorSurname, author.AuthorSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, AuthorName, AuthorSurname);
    }
}
