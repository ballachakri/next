package com.next.dbsteps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.sql.*;

public class DBCountriesSteps {

    private Connection con = null;
    private ResultSet resultSet = null;

    @Given("I am connected to database")
    public void i_am_connected_to_database() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "admin");
    }

    @When("I search for countries in a continent as {string}")
    public void i_search_for_countries_in_a_continent_as(String continent) throws SQLException {
        String query = "select name from country where Continent=" + "\'" + continent + "\'";
        Statement stmt = con.createStatement();
        resultSet = stmt.executeQuery(query);
    }

    @Then("I should view all the countries in the continent")
    public void i_should_view_all_the_countries_in_the_continent() throws SQLException {
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
        con.close();
    }

}
