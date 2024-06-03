package cn.wolfcode.web.modules.dele_file.service.impl;

import cn.wolfcode.web.modules.dele_file.entity.TbDeleFile;
import cn.wolfcode.web.modules.dele_file.mapper.TbDeleFileMapper;
import cn.wolfcode.web.modules.dele_file.service.ITbDeleFileService;
import cn.wolfcode.web.modules.sys.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李志豪
 * @since 2024-06-02
 */
@Service
public class TbDeleFileServiceImpl extends ServiceImpl<TbDeleFileMapper, TbDeleFile> implements ITbDeleFileService {
    @Autowired
    private TbDeleFileMapper dlMapper;

    @Override
    public TbDeleFile findByName(String name) {
        LambdaQueryWrapper<TbDeleFile> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(TbDeleFile::getName, name);
        return baseMapper.selectOne(queryWrapper); // 使用selectOne方法返回单个结果
    }
    @Override
    public List<TbDeleFile> findAll(){
        List<TbDeleFile> dlList = dlMapper.selectList(null);
        return dlList;

    }
}
