package com.gcfw.location.service;

import com.gcfw.equipment.entity.Equ;

import java.util.List;

public interface LocService {
    List<Equ> getEquByUser(Object param);
}
