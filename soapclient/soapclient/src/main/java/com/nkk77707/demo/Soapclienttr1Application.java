package com.nkk77707.demo;

import hello.wsdl.Country;
import hello.wsdl.GetCountryResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.management.MXBean;

@SpringBootApplication
public class Soapclienttr1Application {

	public static void main(String[] args) {
		SpringApplication.run(Soapclienttr1Application.class, args);
	}
	@Bean
	CommandLineRunner lookup(Client countryClient){
		return args -> {
			String name = "Japan";
			if(args.length>0){
				name = args[0];

			}
			GetCountryResponse response = countryClient.getCountryResponse(name);
			Country country = response.getCountry();
			System.err.println(
					"Country : " + country.getName()+
					"\nCapital : "+country.getCapital()+
					"\nPopulation : "+country.getPopulation()+
					"\nCurrency : "+country.getCurrency()
			);
		};
	}

}
