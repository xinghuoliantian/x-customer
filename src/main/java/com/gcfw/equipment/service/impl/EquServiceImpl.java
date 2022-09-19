package com.gcfw.equipment.service.impl;


import com.gcfw.equipment.entity.Equ;
import com.gcfw.equipment.mapper.EquMapper;
import com.gcfw.equipment.service.EquService;
import com.gcfw.equipment.vo.EquQuery;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EquServiceImpl implements EquService {

    @Resource
    private EquMapper equMapper;

    @Override
    public List<Equ> getEquList(EquQuery param) {
        return equMapper.getEquList(param);
    }

    @Override
    public Long countEquList(EquQuery param) {
        return equMapper.countEquList(param);
    }

    @Override
    public Equ getEquById(Integer id) {
        return equMapper.getEquById(id);
    }

    @Override
    public List<Equ> getAllEqud() {
        return equMapper.getAllEqud();
    }


}
