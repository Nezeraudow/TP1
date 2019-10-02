package eu.eisti.fintech.p2k20.ade.pricing.controllers;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import eu.eisti.fintech.p2k20.ade.pricing.model.Pricing;

@RestController
public class PricingController {
    
    Logger LOG = LoggerFactory.getLogger(PricingController.class);
    
    @GetMapping("/princing/{pricingId}")
    public Pricing getPricingById(@PathVariable int pricingId) {
        Pricing response = new Pricing();
        response.setId(pricingId);
        response.setMinAmount(new BigDecimal("500.00"));
        response.setMaxAmount(new BigDecimal("5000.00"));
        response.setMinDuration(4);
        response.setMaxDuration(60);
        response.setRate(new BigDecimal("2.54"));
        return response;
        
    }
    @PostMapping("/pricing")
    public void addPricing(@RequestBody Pricing pricing){
        LOG.info("Added new pricing with ID " + pricing.getId());
    }

}
