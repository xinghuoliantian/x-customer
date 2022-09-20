package com.gcfw.location.service.impl;

import com.gcfw.equipment.entity.Equ;
import com.gcfw.location.mapper.LocMapper;
import com.gcfw.location.service.LocService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LocServiceImpl implements LocService {

    @Resource
    private LocMapper locMapper;

    @Override
    public List<Equ> getEquByUser(Object param) {
        return locMapper.getEquByUser(param);
    }
}
