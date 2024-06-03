package cn.wolfcode.web.modules.dele_file.service;

import cn.wolfcode.web.modules.dele_file.entity.TbDeleFile;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李志豪
 * @since 2024-06-02
 */
public interface ITbDeleFileService extends IService<TbDeleFile> {
    TbDeleFile findByName(String name);
    List<TbDeleFile> findAll();
}
