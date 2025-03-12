package com.ll.hereispaw.domain.payment.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RewardRequest {
  private Long rewardUserId;
  private Integer rewardAmount;
}
