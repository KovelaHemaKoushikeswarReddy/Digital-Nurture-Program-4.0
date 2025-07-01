package com.library.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookDAO;
import com.library.service.BookManager;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Application Started");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookManager manager = ctx.getBean("bookManager", BookManager.class);
        manager.displayServiceInfo();

        BookDAO dao = ctx.getBean("bookDAO", BookDAO.class);
        dao.displayRepositoryInfo();
    }
}
