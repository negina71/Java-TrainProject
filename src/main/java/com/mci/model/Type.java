package com.mci.model;

public enum Type {
	WAGON(WagonType.class),
	LOCOMOTIVE(LocomotiveType.class);
	
	private final Class<? extends Enum<?>> nestedEnum;
	
	private Type(Class<? extends Enum<?>> nestedEnum) {
		this.nestedEnum=nestedEnum;
	}
	
	public Enum<?>[] getNestedEnums(){
		return nestedEnum.getEnumConstants();
	}
	
	public static enum WagonType{
		PASSENGER,CARGO;
	}
	 public static enum LocomotiveType{
		 DIESEL,ELECTRIC;
	 }
}
