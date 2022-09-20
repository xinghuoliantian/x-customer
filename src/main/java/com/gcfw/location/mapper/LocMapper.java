package com.gcfw.location.mapper;

import com.gcfw.equipment.entity.Equ;
import com.gcfw.equipment.vo.EquQuery;

import java.util.List;

public interface LocMapper {
    List<Equ> getEquByUser(Object param);

    List<Equ> getGpsList(EquQuery param);

    Long countGpsList(EquQuery param);
}
