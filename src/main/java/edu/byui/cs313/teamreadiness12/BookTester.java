package edu.byui.cs313.teamreadiness12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jason code taken form major example
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookTester {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libraryJpa");
        EntityManager em = emf.createEntityManager();

        Book book = em.find(Book.class, 1);
        System.out.println("Book: " + book.getName());
        
        Author author = em.find(Author.class, 1);
        System.out.println("Auhtor: " + author.getName());

        em.getTransaction().begin(); 

        Author newAuthor = new Author();
        newAuthor.getName();

        em.persist(newAuthor);

        em.getTransaction().commit();
        
        em.getTransaction().begin(); 

        Book newBook = new Book();
        newBook.getName();

        em.persist(newBook);

        em.getTransaction().commit();
        
        em.close();
        
        
        
        

        
        
    }

}
