package com.dgt79.basiccrud;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ADomain {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private Instant dateReceived;

    @NotNull
    private String reference;

    @NotNull
    private Integer count;
}
