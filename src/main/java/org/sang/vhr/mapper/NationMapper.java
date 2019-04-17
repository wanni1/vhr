package org.sang.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.vhr.bean.Nation;

import java.util.List;

@Mapper
public interface NationMapper {
    public List<Nation> getAllNation();
}
