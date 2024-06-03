package cn.wolfcode.web.generator;
import cn.wolfcode.web.commons.entity.ApplicationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class pathsConfig {


    public static String projectPath="C:\\Users\\Administrator\\IdeaProjects\\wolfcode-web"+"\\";
    public static String createFile = "C:\\Users\\Administrator\\IdeaProjects\\createFile";
    public static String usname="root";
    public static String password="root";



    public static String tg_html = projectPath+"web\\src\\main\\resources\\templates";
    public static String s_modules=createFile+"\\cn\\wolfcode\\web\\modules";
    public static String tg_modules = projectPath+"web\\src\\main\\java\\cn\\wolfcode\\web\\modules";
    public static String s_html = createFile + "\\html";
    public static String s_js = createFile + "\\js";
    public static String tg_js = projectPath+"web\\src\\main\\resources\\static\\scripts";
    public static String sqlPath = createFile+"\\sql\\sql.sql";
    public static String url = "jdbc:mysql://localhost:3306/nojoke?useSSL=false&serverTimezone=GMT%2B8&characterEncoding=utf8";
    public static String newController=projectPath+"web\\src\\main\\java\\cn\\wolfcode\\web\\modules";

}
