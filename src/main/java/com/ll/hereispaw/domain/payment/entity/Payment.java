package com.ll.hereispaw.domain.payment.entity;

import com.ll.hereispaw.global.jpa.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Table(name = "payments")
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class Payment extends BaseEntity {
//    @ManyToOne
//    @JoinColumn(name = "member_id")
//    private Member member;          // 결제한 회원
    private Long memberId;
    @Column(nullable = false)
    private Integer amount;          // 실제 결제 금액

    @Column(unique = true)
    private String paymentKey;      // 결제 고유 키
}
