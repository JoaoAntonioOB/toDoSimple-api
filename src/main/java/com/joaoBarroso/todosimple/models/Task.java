package com.joaoBarroso.todosimple.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;



@Entity
@Table(name = Task.TABLE_NAME)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
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


}
