package com.ll.hereispaw.global.kafka.dto;

import lombok.Data;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class PaymentEventDto {
    @NonNull
    private String id;

    @NonNull
    private Integer amount;
}
