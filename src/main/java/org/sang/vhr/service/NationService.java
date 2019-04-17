package org.sang.vhr.service;

import org.sang.vhr.bean.Nation;
import org.sang.vhr.mapper.NationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NationService {
    @Autowired
    NationMapper nationMapper;
    public List<Nation> getAllNation()
    {
        return nationMapper.getAllNation();
    }
}
