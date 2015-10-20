package com.wonders.xlab.test.repository.primary;

import com.wonders.xlab.test.entity.primary.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wangqiang on 15/10/20.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
