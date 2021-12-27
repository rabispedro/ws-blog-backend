package blog.ws.wsblog.modules.users.services;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import blog.ws.wsblog.modules.users.dtos.UserDTO;
import blog.ws.wsblog.modules.users.entities.User;
import blog.ws.wsblog.modules.users.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ListUserByIdService {
	private UserRepository userRepository;

	@Transactional(readOnly = true)
	public UserDTO execute(final Long id) {
		Optional<User> user = this.userRepository.findById(id);
		UserDTO response = new UserDTO(user);
		return response;
	}
}
