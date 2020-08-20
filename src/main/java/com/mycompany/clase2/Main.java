/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase2;

import java.time.LocalDate;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author 50232
 */
public class Main {

    public static void main(String[]args){
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    Validator validator = factory.getValidator();


    Usuario usuario = new Usuario();
    usuario.setEdad(19);
    usuario.setNombre("Pablo");
    usuario.setEmail("alonzo@yio.com");
    usuario.setFecha(LocalDate.now().minusYears(1));

    Set<ConstraintViolation<Usuario>> violations = validator.validate(usuario);

    for (ConstraintViolation<Usuario> violation : violations) {
    System.out.println(violation.getMessage());
    }
    
    }
    
}
