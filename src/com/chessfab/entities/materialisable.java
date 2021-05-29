package com.chessfab.entities;

public class materialisable {
    private materialTypeEnum materialType;

    public enum materialTypeEnum {
        wood,
        redWood,
        iron,
        titan,
        aluminium,
        carbon,
        plastic,
        stone
    }

    public void setMaterialType(materialTypeEnum material) {
        this.materialType = material;
    }

    public materialTypeEnum materialType() {
        return this.materialType;
    }
}
