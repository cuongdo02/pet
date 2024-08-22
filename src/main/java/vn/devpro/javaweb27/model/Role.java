package vn.devpro.javaweb27.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "tbl_role")
public class Role extends BaseModel implements GrantedAuthority{
	@Column(name = "name", length = 200, nullable = false)
	private String name;

	@Column(name = "description", length = 500)
	private String description;

//	--------Mapping many-to-many: tbl_role to tbl_user ------------
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "tbl_user_role", joinColumns = @JoinColumn(name = "role_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users = new ArrayList<User>();

	public Role() {
		super();
	}

	
	
	public Role(Integer id, Date createDate, Date updateDate, Boolean status, String username, String description,
			List<User> users) {
		super(id, createDate, updateDate, status);
		this.name = name;
		this.description = description;
		this.users = users;
	}



	public String getUsername() {
		return name;
	}

	public void setUsername(String username) {
		this.name = username;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}



	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
