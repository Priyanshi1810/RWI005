package com.map;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Que {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Ans> answers = new HashSet<>();

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Set<Ans> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Ans> answers) {
        this.answers = answers;
    }
}
