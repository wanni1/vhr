package org.sang.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.vhr.bean.Hr;
import org.sang.vhr.bean.Role;

import java.util.List;

@Mapper
public interface HrMapper {
   public Hr loadUserByUsername(String username);  //根据用户名查询用户的所有信息
   public List<Role> getRolesByHrId(Long id);              //根据id查询用户身份
   public List<Hr> getAllHr(@Param("currentId") Long currentId);
}
