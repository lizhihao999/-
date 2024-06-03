package cn.wolfcode.web.commons.Service;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;

@Service
public class ExeRunnerService {

    @PostConstruct
    public void startExeOnStartup() {
        String exePath = "C:\\Redis-x64-3.2.100\\redis-server.exe"; // Windows上的exe文件路径
        ProcessBuilder processBuilder = new ProcessBuilder(exePath);

        try {
            Process process = processBuilder.start();
            System.out.println("redis-server.exe启动成功");
            // 如果需要的话，你可以在这里处理process的输出和错误流
            // ...
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("redis-server.exe启动异常");
            // 处理异常
        }
    }
}
