package com.example.security.security;

import com.example.security.dao.UserDao;
import com.example.security.entity.Role;
import com.example.security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lmh
 * @date 2018/11/20 17:45
 * @desc
 */
public class CustomUserService implements UserDetailsService {

	@Autowired
	UserDao userDao;

	@Override
	public UserDetails loadUserByUsername(String username) { //重写loadUserByUsername 方法获得 userdetails 类型用户

		User user = userDao.findByUserName(username);
		if(user == null){
			throw new UsernameNotFoundException("用户名不存在");
		}
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		//用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
		for(Role role : user.getRoles())
		{
			authorities.add(new SimpleGrantedAuthority(role.getName()));
			System.out.println(role.getName());
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(),
				user.getPassword(), authorities);
	}

}
