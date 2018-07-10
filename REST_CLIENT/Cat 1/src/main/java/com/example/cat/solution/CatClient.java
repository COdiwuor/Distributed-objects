package com.example.cat.solution;

import com.example.cat.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "cat",url = "https://517630f0.ngrok.io")
public interface CatClient {
    @RequestMapping(method = RequestMethod.POST)
    Student register(Student student);

    @RequestMapping(method = RequestMethod.POST,
    value = "{id}/calculate")
    Double calculate(@RequestBody List<Double> operands,
                     @PathVariable("id") Long id,
                     @RequestParam("operation") String operation);
    @RequestMapping(method = RequestMethod.POST,
            value = "{id}/validate")
    void validate(@RequestBody List<Double> operands,
                  @PathVariable("id") Long id,
                  @RequestParam("result") Double result);
}
