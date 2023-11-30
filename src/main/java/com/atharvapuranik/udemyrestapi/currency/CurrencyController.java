package com.atharvapuranik.udemyrestapi.currency;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceConfig currencyServiceConfig;

    @GetMapping("/currency")
    public CurrencyServiceConfig getDetails(){
        return currencyServiceConfig;
    }

}
