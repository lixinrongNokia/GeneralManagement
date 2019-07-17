package com.gzwl.demo.pojo;

public class DictionaryType {
    /** id*/
    private Integer dictionaryTypeId;

    /** 字典名*/
    private String dictionaryTypeName;

    /** 字典值*/
    private String dictionaryTypeValue;

    /** 字典类型1表2字段*/
    private String dictionaryTypeType;

    /** 父级id*/
    private Integer parentId;
    
	/** 联表查询 */
    private String fatherName;

    public Integer getDictionaryTypeId() {
        return dictionaryTypeId;
    }

    public void setDictionaryTypeId(Integer dictionaryTypeId) {
        this.dictionaryTypeId = dictionaryTypeId;
    }

    public String getDictionaryTypeName() {
        return dictionaryTypeName;
    }

    public void setDictionaryTypeName(String dictionaryTypeName) {
        this.dictionaryTypeName = dictionaryTypeName == null ? null : dictionaryTypeName.trim();
    }

    public String getDictionaryTypeValue() {
        return dictionaryTypeValue;
    }

    public void setDictionaryTypeValue(String dictionaryTypeValue) {
        this.dictionaryTypeValue = dictionaryTypeValue == null ? null : dictionaryTypeValue.trim();
    }

    public String getDictionaryTypeType() {
        return dictionaryTypeType;
    }

    public void setDictionaryTypeType(String dictionaryTypeType) {
        this.dictionaryTypeType = dictionaryTypeType == null ? null : dictionaryTypeType.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
}