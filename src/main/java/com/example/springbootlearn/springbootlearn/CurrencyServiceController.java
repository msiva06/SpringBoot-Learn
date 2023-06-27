package com.example.springbootlearn.springbootlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyServiceController {
    
    @Autowired
    private CurrencyServiceConfiguration currencyService;

    @RequestMapping("/currency")
    public CurrencyServiceConfiguration getCurrencyService() {
        return currencyService;
    }

   
}
