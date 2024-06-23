package chilengue.dev.api.dev.test.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chilengue.dev.api.dev.test.model.User;
import chilengue.dev.api.dev.test.repositories.UserRepository;
import chilengue.dev.api.dev.test.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {

        Optional<User> obj=repository.findById(id);
        return obj.orElse(null);
    }

}
