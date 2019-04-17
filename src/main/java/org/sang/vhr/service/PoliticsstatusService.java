package org.sang.vhr.service;

import org.sang.vhr.bean.PoliticsStatus;
import org.sang.vhr.mapper.PoliticsstatusMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PoliticsstatusService {
    @Autowired
    PoliticsstatusMapper politicsstatusMapper;

    public List<PoliticsStatus> getAllPoliticsStatus()
    {
        return politicsstatusMapper.getAllPoliticsStatus();
    }
}
