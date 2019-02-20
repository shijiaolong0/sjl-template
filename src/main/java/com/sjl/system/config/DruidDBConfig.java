package com.sjl.system.config;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;


/**
 * Created by PrimaryKey on 17/2/4.
 */
@Configuration
public class DruidDBConfig {

    @Bean(initMethod = "init", destroyMethod = "close")   //声明其为Bean实例
    @Primary  //在同样的DataSource中，首先使用被标注的DataSource
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        return datasource;
    }
    //注册后台servlet,开启后可以看到后台监控界面
    @Bean
    public ServletRegistrationBean<StatViewServlet> druidServlet() {
        ServletRegistrationBean<StatViewServlet> reg = new ServletRegistrationBean<StatViewServlet>();
        reg.setServlet(new StatViewServlet());
        //通过localhost/druid即可访问druid后台访问界面
        reg.addUrlMappings("/druid/*");
        //白名单    开启能访问druid后台的ip,""表示所有ip
        reg.addInitParameter("allow", ""); 
        Map<String, String> param = new HashMap<String,String>();
        param.put("loginUsername", "sjl");
        param.put("loginPassword", "123");
        //黑名单    开启不能访问druid后台的ip
        //param.put("deny", "");
        //param.put("allow", "");
        reg.setInitParameters(param);
        return reg;
    }
    //用于监听获取应用的数据，filter用于收集数据，servlet用于展现数据
    @Bean
    public FilterRegistrationBean<WebStatFilter> filterRegistrationBean() {
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<WebStatFilter>();
        filterRegistrationBean.setFilter(new WebStatFilter());
        //过滤的请求地址
        filterRegistrationBean.addUrlPatterns("/*");
        //排除过滤的地址
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}

