package com.joaoBarroso.todosimple.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Objects;


@Entity
@Table(name = Task.TABLE_NAME)
public class Task {
    public static  final String TABLE_NAME = "tab_task";

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", unique = true)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "user_id", nullable = false, updatable = false)
        private User user;

        @Column(name = "description", length = 255, nullable = false)
        @NotNull
        @NotEmpty
        @Size(min = 2, max = 200)
        private String description;

    public Task() {
    }

    public Task(String description, User user, Long id) {
        this.description = description;
        this.user = user;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(user, task.user) && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, description);
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
