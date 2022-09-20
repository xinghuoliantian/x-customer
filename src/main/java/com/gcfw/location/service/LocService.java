package com.gcfw.location.service;

import com.gcfw.equipment.entity.Equ;
import com.gcfw.location.vo.GpsQuery;

import java.util.List;

public interface LocService {
    List<Equ> getEquByUser(Object param);

    List<Equ> getGpsList(GpsQuery param);

    Long countGpsList(GpsQuery param);
}
