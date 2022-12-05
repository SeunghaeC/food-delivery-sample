package fooddeliverysample.common;


import fooddeliverysample.BoundedContext51Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext51Application.class })
public class CucumberSpingConfiguration {
    
}
