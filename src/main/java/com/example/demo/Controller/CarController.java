package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entity.Car;
import com.example.demo.Repository.CarRepository;
import com.example.demo.Service.CarService;
@RestController
@CrossOrigin
@RequestMapping("/Car")
public class CarController {
	@Autowired CarRepository carRepository;
	@Autowired CarService CarService;
	@PostMapping("/")
	public Car GetFn(@RequestBody Car emp){
		return carRepository.save(emp);
	}
	@PutMapping("/{id}")
	public Car PutFn(@PathVariable int id,@RequestBody Car emp){
		return carRepository.save(emp);
	}
	@GetMapping("/{id}")
	public Optional<Car> GetFn(@PathVariable int id){
		return carRepository.findById(id);
	}
	@GetMapping("/get")
	public List<Car> GeAlltFn(){
		return carRepository.findAll();
	}
	@DeleteMapping("/id")
	public String DeleteFn(@PathVariable int id) {
		carRepository.deleteById(id);
		return "Employee deleted Successfully";
		
	}
	@GetMapping(value="/sort/{field}")
    List <Car> informSort(@PathVariable String field){
	return  CarService.sortinform(field);
    }
    @GetMapping(value="/paging/{page}/{size}")
    public Page<Car> pagingc (@PathVariable int page,@PathVariable int size){
	return CarService.paging(page,size);
    }
    @GetMapping(value="/sortandpage/{page}/{size}/{field}")
    public Page<Car> SortingdndPaging(@PathVariable int page,@PathVariable int size,@PathVariable String field){
	return CarService.SortingAndPaging(page,size,field);
    }
}
