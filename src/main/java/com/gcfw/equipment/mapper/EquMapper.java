package com.gcfw.equipment.mapper;

import com.gcfw.equipment.entity.Equ;
import com.gcfw.equipment.vo.EquQuery;
import java.util.List;

public interface EquMapper {
    List<Equ> getEquList(EquQuery param);

    Long countEquList(EquQuery param);

    Equ getEquById(Integer id);


}
