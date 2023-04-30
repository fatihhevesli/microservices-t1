package com.turkcellbootcamp.inventoryservice.entities;

import com.turkcellbootcamp.inventoryservice.entities.enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "model")
public class Model {
    @Id
    private UUID id;
    private int modelYear;

}