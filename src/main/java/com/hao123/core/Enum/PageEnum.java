package com.hao123.core.Enum;

public enum PageEnum {
//    通常页面大小
    NormalPageSize(5),
//    大页面
    BigPageSize(10);

    private final Integer number;

    PageEnum(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}
