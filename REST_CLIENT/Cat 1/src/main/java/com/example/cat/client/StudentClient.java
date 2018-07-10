package com.example.cat.client;

import com.example.cat.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "tester",url = "http://10.51.44.121:5000")
public interface StudentClient {
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    List<Student>testclient();

    @RequestMapping(value = "/students",method = RequestMethod.POST)
    Student createStudent(
            @RequestBody Student student);
}
