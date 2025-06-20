package com.pluralsight.NorthWindTradersAPI;

import com.pluralsight.NorthWindTradersAPI.modules.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



    @Component
    public class jdbcProductDao implements ProductDao{
        private DataSource dataSource;
        @Autowired
        public jdbcProductDao(DataSource dataSource){
            this.dataSource = dataSource;
        }

        public List<Product> getAll(){
            List<Product> products = new ArrayList<>();
            String sql = "SELECT * FROM Products;";
            try(Connection connection = dataSource.getConnection()){
                Statement statement = connection.createStatement();
                ResultSet rows = statement.executeQuery(sql);
                while(rows.next()){
                    Product product = new Product();
                    product.setProductId(rows.getInt("ProductId"));
                    product.setCategoryId(rows.getInt("CategoryId"));
                    product.setProductName(rows.getString("ProductName"));
                    product.setUnitPrice(rows.getDouble("Price"));
                    products.add(product);
                }
            }
            catch (SQLException e){ System.out.println(e); }
            return products;
        }

        //TODO: Fix this, not sure what to do.
//        public Customer findByProductId(String id){
//// code to get one customer here
//        }
    }
