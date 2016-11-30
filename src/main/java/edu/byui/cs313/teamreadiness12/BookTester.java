package edu.byui.cs313.teamreadiness12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jason
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class BookTester {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("libraryJpa");
        EntityManager em = emf.createEntityManager();

        Book book = em.find(Book.class, 1);
        System.out.println("Book: " + book.getName());

        em.getTransaction().begin();

        
        Query query = em.createQuery("SELECT b FROM Book b");
        List<Author> author = query.getResultList();

        for (Book book : book) {
            System.out.println("Author: " + book.getName());
        }

        Query authorQuery = em.createQuery("SELECT a FROM Author a");
        List<Author> author = authorQuery.getResultList();

        for (Author author : author) {
            System.out.println("Auhtor: " + author.getName() + " has book: " + author.getBook().getName());
        }

        em.close();
    }

}
