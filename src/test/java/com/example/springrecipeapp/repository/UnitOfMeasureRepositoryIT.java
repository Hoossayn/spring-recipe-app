package com.example.springrecipeapp.repository;

import com.example.springrecipeapp.model.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {

    @Autowired
    UnitOfMeasureRepository repository;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findByUon() {
        Optional<UnitOfMeasure> unitOfMeasureOptional = repository.findByUon("Mudu");
        assertEquals("Mudu", unitOfMeasureOptional.get().getUon());
    }

    @Test
    public void findByUonTeaSpoon() {
        Optional<UnitOfMeasure> unitOfMeasureOptional = repository.findByUon("Teaspoon");
        assertEquals("Teaspoon", unitOfMeasureOptional.get().getUon());
    }
}