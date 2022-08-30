package idiots.mini_project.repository;

import idiots.mini_project.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
<<<<<<< HEAD
    Admin findByFirestationnameAndFirestationpassword(String firestationname, String firestationpassword);
=======
    Admin findByNameAndPassword(String name, String password);
>>>>>>> 1baac522ebbb4d809a79c8f94caf645b5bb9748f
}