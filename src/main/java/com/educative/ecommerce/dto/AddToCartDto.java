package com.educative.ecommerce.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@NoArgsConstructor
@Data
public class AddToCartDto {

    private Integer id;
    private @NotNull Integer productId;
    private @NotNull Integer quantity;




}
