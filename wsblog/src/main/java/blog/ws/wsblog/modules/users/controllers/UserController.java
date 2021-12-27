package blog.ws.wsblog.modules.users.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blog.ws.wsblog.modules.users.services.ListUserByIdService;
import lombok.AllArgsConstructor;
import blog.ws.wsblog.modules.users.dtos.UserDTO;


@RestController
@RequestMapping(value = "/users")
// @AllArgsConstructor
public class UserController {

	// private ListAllUserService listAllUserService;

	@Autowired
	private ListUserByIdService listUserByIdService;
	// private CreateUserService createUserService;
	// private DeleteUserService deleteUserService;
	// private UpdateUserService updateUserService;
	
	// @GetMapping("/")
	// public ResponseEntity<Page<UserDTO>>	getAllUsers(Pageable pageable) {
	// 	Page<UserDTO> response = listAllUserService.execute(pageable);
	// 	return ResponseEntity.ok(response);
	// }

	@GetMapping("/{id}")
	private ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
		UserDTO response = listUserByIdService.execute(id);

		return ResponseEntity.ok(response);
	}

	// @PostMapping("/")
	// public User createUser(@RequestBody User user) {
	// 	return usersRepository.save(user);
	// }

	// @DeleteMapping("/{id}")
	// public void deleteUser(@PathVariable Long id) {
	// 	usersRepository.deleteById(id);
	// 	return;
	// }
}
