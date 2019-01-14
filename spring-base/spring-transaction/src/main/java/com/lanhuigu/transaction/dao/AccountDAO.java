package com.lanhuigu.transaction.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * 模拟DAO层--简单测试
 */
public class AccountDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    /**
     * setter依赖注入DataSource
     */
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insert() {
        String sql = "insert into account (id, userId, accountName, money) values (1, 1, 'user01_account', 0)";
        jdbcTemplate.update(sql);
    }
}
