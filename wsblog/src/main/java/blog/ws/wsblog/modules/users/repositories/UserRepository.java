package blog.ws.wsblog.modules.users.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import blog.ws.wsblog.modules.users.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}
