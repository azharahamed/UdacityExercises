package app.azu.eureka.microservices.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;

    public Item(){}

    public Item(Long id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
