package idiots.mini_project.repository;

import idiots.mini_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByApartnameAndBuildingAndUnit(String apartname, int building, int unit);
}
