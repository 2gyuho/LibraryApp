package service;

import domain.Loan;
import domain.LoanHistory;

import java.util.ArrayList;
import java.util.LinkedList;

public class LoanService {

    LinkedList<Loan> loans = new LinkedList<>();
    ArrayList<LoanHistory> loanHistories = new ArrayList<>();

    public static void loanBook(String name, int catalogueNumber) {
        //todo
    }

    public static void returnBook(String name, int catalogueNumber) {
        //todo
    }

    public LinkedList<Loan> getLoans() {
        return loans;
    }

    public ArrayList<LoanHistory> getLoanHistories() {
        return loanHistories;
    }

}
