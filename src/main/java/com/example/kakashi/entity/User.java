package com.example.kakashi.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldNameConstants;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldNameConstants
@Table(name = "users")


public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String eventName;

    private String description;


}
