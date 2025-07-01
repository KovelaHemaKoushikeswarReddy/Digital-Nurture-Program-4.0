package com.library.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.LibraryService;

public class MainLauncher {
    public static void main(String[] args) {
        System.out.println("Launching Library System...");

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        LibraryService service = (LibraryService) ctx.getBean("libraryService");
        service.displayServiceInfo();
    }
}
