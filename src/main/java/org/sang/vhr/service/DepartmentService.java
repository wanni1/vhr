package org.sang.vhr.service;

import org.sang.vhr.bean.Department;
import org.sang.vhr.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DepartmentService {
@Autowired
DepartmentMapper departmentMapper;
    public List<Department> getDepByPid(Long pid) {
        return departmentMapper.getDepByPid(pid);
    }
    public List<Department> getAllDeps() {
        return departmentMapper.getAllDeps();
    }
}
