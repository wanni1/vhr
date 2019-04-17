package org.sang.vhr.service;

import org.sang.vhr.bean.Hr;
import org.sang.vhr.bean.Role;
import org.sang.vhr.common.HrUtils;
import org.sang.vhr.mapper.HrMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/* 判断用户是否存在*/
@Service
public class HrService implements UserDetailsService{
    @Autowired
    HrMapper hrMapper;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr=hrMapper.loadUserByUsername(s);
        if(hr==null)
        {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return hr;
    }
    public List<Role> getRolesByHrId(Long id)
    {
        return hrMapper.getRolesByHrId(id);
    }
    public List<Hr> getAllHrExceptAdmin() {
        return hrMapper.getAllHr(HrUtils.getCurrentHr().getId());
    }
    public List<Hr> getAllHr() {
        return hrMapper.getAllHr(null);
    }
}
