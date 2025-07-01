package com.library.service;

import com.library.repository.BookDAO;

public class LibraryService {

    private BookDAO bookDAO;

    public void setBookDAO(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public void displayServiceInfo() {
        System.out.println("Executing LibraryService Layer");
        bookDAO.logRepositoryAccess();
    }
}
