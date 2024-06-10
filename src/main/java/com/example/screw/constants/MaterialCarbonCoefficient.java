package com.example.screw.constants;

public enum MaterialCarbonCoefficient {
	
	BAR_IN_COIL("條鋼盤元", 2.63), //
	STEEL_WIRE_ROD("線材盤元", 2.71), //
	BALLING_BAR_IN_COIL("球化條鋼盤元", 2.83), //
	BALLING_STEEL_WIRE_ROD("球化線材盤元", 2.91), //
	HCL("鹽酸 (37%)", 1.69), //
	NATURAL_GAS("天然氣", 2.63), //
	NAOH("氫氧化鈉/液鹼 (45%)", 1.54), //
	ZINC_INGOT("鋅錠", 9.18), //
	REGENERATION_ZINC_INGOT("再生鋅錠", 0.04), //
	REGENERATION_ZINC_ALLOY_INGOT("再生鋅合金錠", 0.0403), //
	ELECTRIC("電力", 0.495);
	
	private String name;

	private double carbonCoefficient;

	private MaterialCarbonCoefficient(String name, double carbonCoefficient) {
		this.name = name;
		this.carbonCoefficient = carbonCoefficient;
	}

	public String getName() {
		return name;
	}

	public double getCarbonCoefficient() {
		return carbonCoefficient;
	}

	// 功能：根據原料，取得對應的碳係數值
	public static MaterialCarbonCoefficient getCarbonCoefficientByName(String name){
		for(MaterialCarbonCoefficient material : MaterialCarbonCoefficient.values()) {
			if(material.name.equals(name)) {
				return material;
			}
		}
		return null;
    }
	
}
