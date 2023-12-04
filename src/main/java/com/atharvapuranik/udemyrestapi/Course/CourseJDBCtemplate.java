package com.atharvapuranik.udemyrestapi.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public class CourseJDBCtemplate{

    @Autowired
    private JdbcTemplate conn;

    private String INS_QUERY =
            """
            INSERT INTO COURSE(ID, NAME, AUTHOR)
            VALUES(?,?,?);    \s
            """;

    private String DEL_QUERY =
            """
            DELETE FROM COURSE WHERE ID=?;
            """;

    private String SEL_QUERY =
            """
            SELECT * FROM COURSE WHERE ID=?;
            """;

    public void run(Course course){
        conn.update(INS_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void del(int id){
        conn.update(DEL_QUERY,id);
    }


    public Course findById(int id){
        return conn.queryForObject(SEL_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }

}
