package com.accesadades.botiga.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table ( name = "category")
public class Category implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long category_id;

    @Column
    private String name;

    @Column(name = "creation_at")
    @CreationTimestamp
    private LocalDateTime creationDate;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updateDate;
/*
    @OneToMany(cascade=CascadeType.PERSIST)
    @JoinColumn(name="subcategory_id")
    private Subcategory subcategory; */ 
/*
    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Subcategory> subcategories;*/


}
