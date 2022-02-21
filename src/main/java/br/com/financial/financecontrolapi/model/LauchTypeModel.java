package br.com.financial.financecontrolapi.model;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel
@Data
public class LauchTypeModel {

    private Long code;

    private String description;

    private String type;

}
