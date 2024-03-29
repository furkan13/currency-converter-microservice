package limit.service.limit.controller;

import limit.service.limit.Entities.Limits;
import limit.service.limit.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getLimitValue() {
        return new Limits(configuration.getMinimum(),configuration.getMaximum());



    }
}
