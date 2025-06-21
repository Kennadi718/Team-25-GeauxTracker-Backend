package com.geauxtracker.repository;

import com.geauxtracker.model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, Long> {}
