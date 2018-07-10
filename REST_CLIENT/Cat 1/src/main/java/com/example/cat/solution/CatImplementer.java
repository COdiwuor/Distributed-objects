package com.example.cat.solution;

import com.example.cat.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CatImplementer implements CommandLineRunner {

    @Autowired
    private  CatClient catClient;


    @Override
    public void run(String... args) throws Exception {
        Student student = catClient.register(
                new Student("089326",
                        "Dennis Ndungu MWika"));
        List<Double> operands = new ArrayList<>();
        operands.add(12.0);
        operands.add(12.0);
        Double result = catClient.calculate(operands,
                student.getId(),"Multiply");
        catClient.validate(operands,student.getId()
        ,result);

    }
}
