package am.itspace.bagaryocompany.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private int articul;
    private String components;
    private int count;
    private double rating;
    private String description;
    private Date dateSince;
    private int minCount;
    private int ratingCount;
    @ManyToOne
    private Category category;



}
