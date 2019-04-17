package org.sang.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.vhr.bean.PoliticsStatus;

import java.util.List;

@Mapper
public interface PoliticsstatusMapper {
    public List<PoliticsStatus> getAllPoliticsStatus();
}
