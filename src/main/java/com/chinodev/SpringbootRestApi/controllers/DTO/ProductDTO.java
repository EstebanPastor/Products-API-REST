package com.chinodev.SpringbootRestApi.controllers.DTO;
import com.chinodev.SpringbootRestApi.entities.Maker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductDTO {

    private Long id;

    private String name;

    private BigDecimal price;


    private Maker maker;
}
