package com.enkode.cognito.controller;

import com.enkode.cognito.model.CompensationDto;
import com.enkode.cognito.model.GeneralResponse;
import com.enkode.cognito.service.CompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compensation")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class CompensationController {
  @Autowired CompensationService compensationService;

  @GetMapping("/{id}")
  public ResponseEntity<GeneralResponse<CompensationDto>> getDetails(
      @PathVariable(name = "id") String empId) {

    GeneralResponse<CompensationDto> response =
        new GeneralResponse<>(compensationService.getDetails(empId));
    return ResponseEntity.ok(response);
  }
}
