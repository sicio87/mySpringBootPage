package eu.karols.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, length = 30, unique = true)
	private String login;
	@Column(length = 60)
	private String password;
	@Column(length = 100)
	private String name;
	@Column(length = 100)
	private String email;
	@OneToMany(mappedBy = "author")
	private Set<Task> tasks = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User() {
	}

	public User(Long id, String login, String name, String email) {
		this.id = id;
		this.login = login;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", login='" + login + '\'' + ", password='" + password + '\''
				+ ", name='" + name + ", email='" + email + '\'' + '}';
	}

}
