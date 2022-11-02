package vn.thanhhai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.thanhhai.model.MyUserDetail;
import vn.thanhhai.model.User;
import vn.thanhhai.repository.UsesRepo;

@Service
@Transactional
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UsesRepo userRepo;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username);
        if (user == null){
            throw  new UsernameNotFoundException("User name:" + username + "not found");
        }
        return new MyUserDetail(user);
    }

}
