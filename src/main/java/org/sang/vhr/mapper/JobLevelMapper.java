package org.sang.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.vhr.bean.JobLevel;

import java.util.List;
@Mapper
public interface JobLevelMapper {
    public List<JobLevel> getAllJobLevels();
}
