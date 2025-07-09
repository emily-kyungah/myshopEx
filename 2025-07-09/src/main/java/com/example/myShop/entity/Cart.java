package com.example.myShop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="t_cart")
@Getter @Setter
@ToString
public class Cart extends BaseEntity{
    @Id
    @Column(name="card_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="member_id")
    private Member member;
}
