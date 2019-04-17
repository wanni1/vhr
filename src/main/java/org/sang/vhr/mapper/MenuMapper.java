package org.sang.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.vhr.bean.Menu;

import java.util.List;
@Mapper
public interface MenuMapper {
    List<Menu> getAllMenu();

    List<Menu> getMenusByHrId(Long hrId);

   /* List<Menu> menuTree();

    List<Long> getMenusByRid(Long rid);*/
}
