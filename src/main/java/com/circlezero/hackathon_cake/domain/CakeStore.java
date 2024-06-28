package com.circlezero.hackathon_cake.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class CakeStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 30)
    private String address;

    @Column(nullable = false, length = 30)
    private String phone_number;

    @OneToMany(mappedBy = "CakeStore", cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();

    //@OneToMany(mappedBy = "CakeStore", cascade = CascadeType.ALL)
    //private List<RecordImage> myMissionList = new ArrayList<>();
}
