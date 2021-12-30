package main.java.br.sc.rafael.application;

import main.java.br.sc.rafael.db.DB;

import java.sql.Connection;

public class Program {
    public static void main(String[] args) {

        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
