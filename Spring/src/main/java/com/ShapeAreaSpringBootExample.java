package com.backbenchers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import spring.Circle;
import spring.Rectangle;
import spring.Shape;

@SpringBootApplication
public class ShapeAreaSpringBootExample {

    public static void main(String[] args) {
        SpringApplication.run(ShapeAreaSpringBootExample.class, args);
    }

    @RestController
    public static class ShapeController {

        @Bean
        public Circle circle() {
            return new Circle(0); // Dummy circle bean
        }

        @Bean
        public Rectangle rectangle() {
            return new Rectangle(0, 0); // Dummy rectangle bean
        }

        @GetMapping("/calculate-area")
        public double calculateArea(@RequestParam String shape,
                                    @RequestParam(required = false) Double radius,
                                    @RequestParam(required = false) Double length,
                                    @RequestParam(required = false) Double width) {
            Shape chosenShape;
            switch (shape) {
                case "Circle":
                    chosenShape = circle();
                    ((Circle) chosenShape).setRadius(radius);
                    break;
                case "Rectangle":
                    chosenShape = rectangle();
                    ((Rectangle) chosenShape).setLength(length);
                    ((Rectangle) chosenShape).setWidth(width);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid shape: " + shape);
            }
            return chosenShape.calculateArea();
        }
    }
}
