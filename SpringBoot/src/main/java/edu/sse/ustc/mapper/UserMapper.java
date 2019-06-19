package edu.sse.ustc.mapper;

import edu.sse.ustc.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author imarklei90
 * @since 2019.06.19
 */

@Mapper
public interface UserMapper {

	public List<User> findAll();
}
