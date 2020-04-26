package com.sunsoft.MySpringBootSecond.MyController;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunsoft.bean.Employee;
import com.sunsoft.bean.Product;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/product")
public class MyController {
	
	static List<Product> l1=new ArrayList<>();
	

	
	@GetMapping(path="/add", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> myFunc(@RequestParam("pid") int id,@RequestParam("pname") String name,@RequestParam("pprice") int price) {
		
		Product p1=new Product(id, name, price);
		l1.add(p1);
		
		return l1;
		
			
	
	}
}
