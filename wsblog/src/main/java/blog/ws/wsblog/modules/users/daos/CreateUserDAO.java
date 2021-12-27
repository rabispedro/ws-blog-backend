package blog.ws.wsblog.modules.users.daos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CreateUserDAO {
	String name;
	String nickname;
	String email;
	String cpf;
	List<String> phone;
	String password;
}
