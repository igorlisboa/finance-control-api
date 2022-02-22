package br.com.financial.financecontrolapi.dto;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel
@Data
public class LauchTypeDTO {

    private Long code;

    private String description;

    private String type;

}
