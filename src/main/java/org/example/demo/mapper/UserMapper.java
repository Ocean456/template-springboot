package org.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.demo.model.User;


@Mapper
public interface UserMapper extends BaseMapper<User> {

}
