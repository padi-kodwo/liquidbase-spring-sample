package com.padi.liquidbase.dto;

import jakarta.validation.constraints.NotBlank;
import java.io.Serial;
import java.io.Serializable;
import lombok.Data;

@Data
public class UserDto implements Serializable {

  @Serial
  private static final long serialVersionUID = 6613471837742199375L;

  private String id;

  @NotBlank
  private String name;

  private String dateOfBirth;

  private String createdAt;

  private String modifiedAt;
}
