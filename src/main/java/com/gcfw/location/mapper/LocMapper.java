package com.gcfw.location.mapper;

import com.gcfw.equipment.entity.Equ;

import java.util.List;

public interface LocMapper {
    List<Equ> getEquByUser(Object param);
}
