package com.dt.ssm.controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/scController")
public class ScController {

    public JdbcTemplate jt;

    @Resource
    public void setDataSource(DataSource ds) {
        this.jt = new JdbcTemplate(ds);
        this.jt.setFetchSize(1024);
    }


    @RequestMapping("/findAll")
    public Object findAll(Integer page, @RequestParam("limit") Integer rows) {
        Map result = new HashMap();

        try {
            List<Map<String, Object>> lists = jt.queryForList("SELECT st.Sname,c.Cname, s.score from sc as s LEFT JOIN student as st on st.Sid = s.Sid LEFT JOIN course as c on c.Cid = s.Cid ORDER BY st.Sname limit "+ rows + " offset " + (page - 1) * rows );
            Integer count = jt.queryForObject("SELECT count(*) from sc as s LEFT JOIN student as st on st.Sid = s.Sid LEFT JOIN course as c on c.Cid = s.Cid ORDER BY st.Sname" ,Integer.class);
            result.put("code", "0");//这个是必须的
            result.put("data", lists);
            result.put("count", count);
        } catch (Exception e) {
            result.put("code", "1");
            result.put("msg", e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    private void test1(){
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
        System.out.println("111");
    }
}
