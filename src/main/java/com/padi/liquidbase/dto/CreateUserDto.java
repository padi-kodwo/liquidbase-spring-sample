package com.padi.liquidbase.dto;

import jakarta.validation.constraints.NotBlank;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class CreateUserDto implements Serializable {

  @Serial
  private static final long serialVersionUID = -2985334470797763515L;

  @NotBlank
  private String name;

  private String dateOfBirth;
}
