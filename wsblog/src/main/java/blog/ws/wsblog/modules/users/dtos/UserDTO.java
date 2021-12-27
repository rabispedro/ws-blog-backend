package blog.ws.wsblog.modules.users.dtos;

import java.sql.Timestamp;
import java.util.Optional;

import blog.ws.wsblog.modules.users.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	String nickname;
	Timestamp createdAt;

	public UserDTO(User user) {
		this.nickname = user.getNickname();
		this.createdAt = user.getCreatedAt();
	}

	public UserDTO(Optional<User> user) {
		this.nickname = user.get().getNickname();
		this.createdAt = user.get().getCreatedAt();
	}
}
