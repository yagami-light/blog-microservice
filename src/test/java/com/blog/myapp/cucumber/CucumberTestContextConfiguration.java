package com.blog.myapp.cucumber;

import com.blog.myapp.MicroserviceStarterApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = MicroserviceStarterApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
