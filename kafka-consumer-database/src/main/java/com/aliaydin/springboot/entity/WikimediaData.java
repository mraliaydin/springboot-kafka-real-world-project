package com.aliaydin.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wikimedida_recentchange")
@Getter
@Setter
public class WikimediaData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //To store large data we can use lob annotation.
    @Column(columnDefinition="LONGTEXT", length = 16777215)
    private String wikiEventData;
}
