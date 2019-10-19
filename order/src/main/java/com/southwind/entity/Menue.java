package com.southwind.entity;


import lombok.Data;
@Data
public class Menue {
    private long id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
