package cn.wolfcode.web.commons.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component//标识为Bean
@ConfigurationProperties(prefix = "datasource.mysql")//prefix前缀需要和yml配置文件里的匹配。
@Data//这个是一个lombok注解，用于生成getter&setter方法
public class ApplicationInfo {
    private  String validationQuery;
    private  String driver;
    private  String database;
    private  String ip;
    private  String port;
    private  String username;
    private  String password;
    private  String url;

}
