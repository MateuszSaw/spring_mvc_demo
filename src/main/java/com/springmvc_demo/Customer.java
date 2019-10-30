package com.springmvc_demo;

import com.springmvc_demo.validation.CourseCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Customer {


    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "Must Be greater than or equal to 0")
    @Max(value = 10, message = "Must be less than or equal  10 ")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digit")
    private String postalCode;

    @CourseCode(value = "TOP", message = "Must start with TOP")
    private String courseCode;
}
