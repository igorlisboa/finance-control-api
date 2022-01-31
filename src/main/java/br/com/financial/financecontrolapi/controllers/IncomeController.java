package br.com.financial.financecontrolapi.controllers;

import br.com.financial.financecontrolapi.model.Income;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api
@RequestMapping("/incomes")
public class IncomeController {

    @PostMapping
    public String income(Income income){



        return "true";
    }

}
