package idiots.mini_project.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data // getter setter
@Builder
@Entity
public class User {
<<<<<<< HEAD

=======
>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id; // 아파트 아이디

<<<<<<< HEAD
=======

>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f
    @Column(nullable = false, length = 30)
    private String apartname;

    @Column(nullable = false, length = 30)
    private String building; // 동

    @Column(nullable = false, length = 30)
    private String unit; // 호

//    @Column(nullable = false, length = 15)
//    private String phonenumber;

<<<<<<< HEAD
=======

//    @Column(nullable = false, length = 30)
//    private String neareststation;

>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f
    @Enumerated(EnumType.STRING)
    private Role role;

}
