package idiots.mini_project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Admin {
<<<<<<< HEAD

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int firestationid;
=======
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false, length = 30)
<<<<<<< HEAD
    private String firestationname;

    @Column(nullable = false, length = 30)
    private String firestationpassword;
=======
    private String name;

    @Column(nullable = false, length = 30)
    private String password;
>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f

    @ManyToOne
    @JoinColumn(name="apartname")
    private User user;

}
