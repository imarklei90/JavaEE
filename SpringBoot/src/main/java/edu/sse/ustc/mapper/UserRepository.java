package edu.sse.ustc.mapper;

import edu.sse.ustc.domain.User;
import org.springframework.data.repository.CrudRepository;

/** User Repository接口
 * @author imarklei90
 * @since 2019.06.23
 */
public interface UserRepository  extends CrudRepository<User, Integer> {
}
