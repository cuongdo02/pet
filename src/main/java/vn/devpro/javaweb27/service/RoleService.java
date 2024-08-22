package vn.devpro.javaweb27.service;

import java.util.List;

import javax.management.relation.Role;
import javax.transaction.Transactional;

public class RoleService {
@Transactional
public void inactiveRole(Role role) {
	super.saveOrUpdate(role);
}
public Role getRoleByName(String name) {
	String sql = "SELECT * FROM tbl_role WHERE name ='" + name + "'";
	List<Role> roles = super.executeNativeSql(sql);
	
	if(roles.size() > 0) {
		return roles
	}
}
}
