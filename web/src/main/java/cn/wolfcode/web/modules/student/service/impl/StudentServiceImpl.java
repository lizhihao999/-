package cn.wolfcode.web.modules.student.service.impl;

import cn.wolfcode.web.modules.student.entity.Student;
import cn.wolfcode.web.modules.student.mapper.StudentMapper;
import cn.wolfcode.web.modules.student.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李志豪
 * @since 2024-05-31
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
