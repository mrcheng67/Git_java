package Pool.JDBCtemplate;


import Pool.Utils.DruidUtils;

import org.springframework.jdbc.core.JdbcTemplate;


public class jdbcTemplateDemo {
    public static void main(String[] args) throws Exception {
        /*
        * JdbcTemplate 使用方式
        *       更新用 update  用于增删改语句
        *       查询用 queryForMap():查询结果 将结果封装为map集合
        *             queryForList():查询结果将结果集封装为list集合
        *             query():查询结果将结果封装为JavaBean对象
        * */
        JdbcTemplate template = new JdbcTemplate(DruidUtils.getDataSource());
        String sql = "update bank set account = ? where id = ?";
        int count = template.update(sql,1600,3);
        System.out.println("count = " + count);
    }
}
