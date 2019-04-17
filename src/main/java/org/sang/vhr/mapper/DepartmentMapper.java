package org.sang.vhr.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sang.vhr.bean.Department;

import java.util.List;
@Mapper
public interface DepartmentMapper {
    List<Department> getDepByPid(Long pid);
    List<Department> getAllDeps();
}
