package com.geauxtracker.controller;

import com.geauxtracker.model.User;
import com.geauxtracker.model.Budget;
import com.geauxtracker.repository.UserRepository;
import com.geauxtracker.repository.BudgetRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ApiController {

    private final UserRepository userRepo;
    private final BudgetRepository budgetRepo;

    public ApiController(UserRepository userRepo, BudgetRepository budgetRepo) {
        this.userRepo = userRepo;
        this.budgetRepo = budgetRepo;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @GetMapping("/budgets")
    public List<Budget> getBudgets() {
        return budgetRepo.findAll();
    }

    @PostMapping("/budgets")
    public Budget createBudget(@RequestBody Budget budget) {
        return budgetRepo.save(budget);
    }
}
