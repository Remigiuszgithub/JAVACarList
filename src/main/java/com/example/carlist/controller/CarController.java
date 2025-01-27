package com.example.carlist.controller;

import com.example.carlist.model.Car;
import com.example.carlist.repository.CarRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;

    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping
    public String getAllCars(Model model) {
        model.addAttribute("cars", carRepository.findAll());
        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("car", new Car());
        return "create";
    }

    @PostMapping("/create")
    public String createCar(@ModelAttribute Car car) {
        carRepository.save(car);
        return "redirect:/cars";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        model.addAttribute("car", carRepository.findById(id).orElseThrow());
        return "update";
    }

    @PostMapping("/update/{id}")
    public String updateCar(@PathVariable Long id, @ModelAttribute Car car) {
        car.setId(id);
        carRepository.save(car);
        return "redirect:/cars";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Long id) {
        carRepository.deleteById(id);
        return "redirect:/cars";
    }
}

