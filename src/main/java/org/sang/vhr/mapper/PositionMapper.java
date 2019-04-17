package org.sang.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.vhr.bean.Position;

import java.util.List;
@Mapper
public interface PositionMapper {
    public List<Position> getAllPos();
}
