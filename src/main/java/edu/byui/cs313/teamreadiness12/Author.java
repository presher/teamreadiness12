/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.byui.cs313.teamreadiness12;

/**
 *
 * @author Jason code taken form major example
 */

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne; 


@Entity
public class Author implements Serializable {
    
    @Id 
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int id;
       private String name;

       @ManyToOne 
       private Book book; 

       public int getId() { 
              return id;
       } 

       public void setId(int id) { 
              this.id = id;
       }

       public String getName() { 
              return name;
       } 

       public void setName(String name) { 
              this.name = name;
       }

       public Book getBook() { 
              return book;
       }

       public void setLibrary(Book library) { 
              this.book = book;
       }
    
}
