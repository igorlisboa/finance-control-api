package br.com.financial.financecontrolapi.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class IncomeModel {

    private String description;
    private BigDecimal value;
    private Date date;

}
