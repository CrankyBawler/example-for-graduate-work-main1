package ru.skypro.homework.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
public class Ad {

    private int pk;
    private int author;
    private String description;
    private String image;
    private int price;
    private String title;
}
