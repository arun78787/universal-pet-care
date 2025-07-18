package com.dailycodework.universalpetcare.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "adm_id")
public class Admin extends User{
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
