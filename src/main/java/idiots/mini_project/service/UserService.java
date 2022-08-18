package idiots.mini_project.service;

import idiots.mini_project.model.User;
import idiots.mini_project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void login(User user) {
        userRepository.save(user);
    }
}
