package lk.ijse.dep9.app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString(exclude = "taskSet")
@EqualsAndHashCode(exclude = "taskSet")

public class Project implements SuperEntity {

    private int id;

    private String name;
    private String username;


    public Project(String name, User user) {
        this.name = name;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
