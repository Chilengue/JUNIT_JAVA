package chilengue.dev.api.dev.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import chilengue.dev.api.dev.test.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
