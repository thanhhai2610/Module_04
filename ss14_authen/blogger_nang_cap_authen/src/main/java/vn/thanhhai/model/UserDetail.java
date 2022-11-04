package vn.thanhhai.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*biến  MyUserDetail(users) thanh UserDetails */
public class UserDetail implements UserDetails {

    private AppUser user;

    public UserDetail(AppUser user) {
        this.user = user;
    }

    @Override
    /*Phân quyền
     không dùng role thông thương mà dùng role của GrantedAuthority */
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        for (AppRole x : user.getRoles()) {
            grantedAuthorityList.add(new SimpleGrantedAuthority(x.getName()));
        }
        return grantedAuthorityList;
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.isEnabled();
    }
}
