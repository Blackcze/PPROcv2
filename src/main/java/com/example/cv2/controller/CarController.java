package com.example.cv2.controller;

import com.example.cv2.model.car;

import java.util.ArrayList;
import java.util.List;

public class CarController {

    public List<car> cars= new ArrayList<car>();

    public String list(Model model){
        cars.add(new car("ABC123", "blue", 30.4f, 5));
        model.addAtribute("cars", cars);
        return "list";
    }
    @PostMapping("/cars")
    public String addCar(car car) {
        cars.add(car);
        return "redirect:/cars";
    }

    @GetMapping("/car/{id}")
    public String getCar(@PathVariable("id") int id, Model model) {
        car car = findCarById(id);
        model.addAttribute("car", car);
        return "edit";
    }

    private car findCarById(int id) {
        return null;
    }

    @PostMapping("/edit/{id}")
    public String editCar(@PathVariable("id") int id, car car) {
        cars.remove(id);
        cars.add(car);
        return "redirect:/cars";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable("id") int id) {
        cars.remove(id);
        return "redirect:/";
    }
}

