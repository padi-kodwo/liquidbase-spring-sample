package com.padi.liquidbase.dto;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;
import lombok.Data;

@Data
public class EditUserDto implements Serializable {
  private String id;

  @NotBlank
  private String name;

  private String dateOfBirth;
}
