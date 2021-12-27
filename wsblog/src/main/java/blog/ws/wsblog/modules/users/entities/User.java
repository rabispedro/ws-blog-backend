package blog.ws.wsblog.modules.users.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import blog.ws.wsblog.modules.utils.TimeUtil;

@Entity()
@Table(name = "users")
@Data
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "nickname", nullable = false)
	private String nickname;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "cpf", nullable = false, unique = true)
	private String cpf;

	@Column(name = "phone", nullable = true)
	private List<String> phone;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "created_at", nullable = false)
	private Timestamp createdAt;

	@Column(name = "updated_at", nullable = false)
	private Timestamp updatedAt;

	@PrePersist
	protected void onCreate() {
		this.createdAt = TimeUtil.getCurrentTimestamp();
		this.updatedAt = TimeUtil.getCurrentTimestamp();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = TimeUtil.getCurrentTimestamp();
	}
}
