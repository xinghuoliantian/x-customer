package com.gcfw.equipment.service;


import com.gcfw.equipment.entity.Equ;
import com.gcfw.equipment.vo.EquQuery;

import java.util.List;

public interface EquService {
    List<Equ> getEquList(EquQuery param);

    Long countEquList(EquQuery param);

    Equ getEquById(Integer id);

    List<Equ> getAllEqud(Object param);
}
