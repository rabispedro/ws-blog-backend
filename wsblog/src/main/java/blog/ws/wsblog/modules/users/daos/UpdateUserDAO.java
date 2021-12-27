package blog.ws.wsblog.modules.users.daos;

import java.util.List;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class UpdateUserDAO {
	Optional<String> name;
	Optional<String> nickname;
	Optional<String> email;
	Optional<List<String>> phone;
	Optional<String> password;
}
