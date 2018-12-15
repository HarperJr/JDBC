package com.vlsu.com.vlsu.localdb.jdbc.mapper;

import com.vlsu.com.vlsu.localdb.model.Enchant;
import org.mapstruct.Mapper;

@Mapper
public abstract class EnchantTypeMapper {

    protected Enchant entityToModel(int enchantId) {
        if (enchantId == 0) {
            return null;
        } else {
            return new Enchant(){
                {
                    setId(enchantId);
                }
            };
        }
    }

    protected int modelToEntity(Enchant enchant) {
        return enchant == null ? 0 : enchant.getId();
    }
}
